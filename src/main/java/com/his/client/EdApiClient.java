package com.his.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.his.dto.EligDetermineDTO;

@FeignClient(name = "ED-API")
public interface EdApiClient {
	
	@GetMapping("/eligibledetails")
	public List<EligDetermineDTO> getEligibleEdDetails();

}
