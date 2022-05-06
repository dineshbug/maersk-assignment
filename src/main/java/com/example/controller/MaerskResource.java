package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.MaerskBean;
import com.example.bean.MaerskResponse;
import com.example.respository.MaerskRepository;

@RestController
@RequestMapping("/api/bookings")
public class MaerskResource {
	
	
	@Autowired
	private MaerskRepository maerskRepository; 
	
	@PostMapping("/")
	@ResponseBody
	public ResponseEntity<?> save(@RequestBody MaerskBean maerskBean) {
		MaerskBean maerskBeanResponse = maerskRepository.save(maerskBean);
		return ResponseEntity.ok().body(maerskBeanResponse.getId());
	}
	
	@PostMapping("/checkAvailability")
	@ResponseBody
	public ResponseEntity<?> checkAvailability(@RequestBody MaerskBean maerskBean) {
		MaerskResponse maerskResponse = new MaerskResponse();
		if(maerskBean.getQuantity() > 0) {
			maerskResponse.setAvailable(true);
		}
		else {
			maerskResponse.setAvailable(false);
		}
		return ResponseEntity.ok().body(maerskResponse);
	}

}
