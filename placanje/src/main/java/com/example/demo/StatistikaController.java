package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/statistika")
public class StatistikaController {

	@GetMapping
	public ResponseEntity<List<StatistikaDTO>> placanje() {
		List<StatistikaDTO> retVal = new ArrayList<StatistikaDTO>();
		StatistikaDTO val = new StatistikaDTO();

		val.city = "Negotin";
		val.cityCnt = 150;
		val.period = "12-15h";
		
		retVal.add(val);

		return ResponseEntity.ok(retVal);
	}

}
