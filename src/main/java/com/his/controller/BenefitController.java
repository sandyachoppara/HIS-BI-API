package com.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.service.BenefitService;

@RestController
public class BenefitController {
	
	@Autowired
	BenefitService biService;
	
	@GetMapping("/generateBenefitIssauance")
	ResponseEntity<String> generateBenefitIssuance() throws Exception{
		 biService.generateBenefitIssuance();
		 
		 return new ResponseEntity<>("csv generated", HttpStatus.OK);
		
	}

}
