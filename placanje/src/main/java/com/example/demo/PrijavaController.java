package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/prijava")
public class PrijavaController {

	@PostMapping
	public ResponseEntity<String> placanje(@RequestBody PrijavaDTO dto) {
		System.out.println(dto);
		return ResponseEntity.ok("Prijava uspesno sacuvana");
	}

}
