package com.his.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.client.ApplicationApiClient;
import com.his.client.CitizenApiClient;
import com.his.client.EdApiClient;
import com.his.dto.ApplicationRegDTO;
import com.his.dto.CitizenDTO;
import com.his.dto.EligDetermineDTO;
import com.opencsv.CSVWriter;

@Service
public class BeneifitServiceImpl implements BenefitService {
	
	@Autowired
	EdApiClient edClient;

	@Autowired
	CitizenApiClient citizenClient;

	@Autowired
	ApplicationApiClient arClient;


	@Override
	public void generateBenefitIssuance() throws Exception {
		List<EligDetermineDTO> eligibleEdDetails = edClient.getEligibleEdDetails();
		
		 File file = new File("BenefitFile.csv"); 
		  
		    try { 
		        // create FileWriter object with file as parameter 
		        FileWriter outputfile = new FileWriter(file); 
		  
		        // create CSVWriter object filewriter object as parameter 
		        CSVWriter writer = new CSVWriter(outputfile); 
		  
		        // create a List which contains String array 
		        List<String[]> data = new ArrayList<String[]>(); 
		        data.add(new String[] { "SNo","Name","Account No", "Benefit Amount"}); 
		        
		        int rowIndex = 1;

				for (EligDetermineDTO ed : eligibleEdDetails) {
					ApplicationRegDTO application = arClient.getApplication(ed.getAppNumber());
					CitizenDTO citizen = citizenClient.getCitizen(application.getCitizenId());
					data.add(new String[] { rowIndex+"", citizen.getName(), "10000000"+rowIndex, 
							ed.getBenefitAmount()!=null?"$"+ed.getBenefitAmount().toString():"$0"}); 
			        rowIndex++;
				}

		        writer.writeAll(data); 
		        // closing writer connection 
		        writer.close(); 
		    } 
		    catch (IOException e) { 
		        // TODO Auto-generated catch block 
		        e.printStackTrace(); 
		    }
	}
	

}
