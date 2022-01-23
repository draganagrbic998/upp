package com.example.demo;

public class StepenObrazovanjaDTO {
	public Long broj;
	public String naziv;
	
	@Override
	public String toString() {
		return this.broj.toString() + " " + this.naziv;
	}
}
