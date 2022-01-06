package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placanje")
public class PlacanjeController {

	@PostMapping
	public ResponseEntity<String> placanje(@RequestBody PlacanjeDTO dto){
		System.out.println("Placanje sume od " + dto.suma + "...");
		return ResponseEntity.ok("Placanje uspesno zavrseno!");
	}
	
}
