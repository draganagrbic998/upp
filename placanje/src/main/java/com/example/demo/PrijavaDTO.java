package com.example.demo;

public class PrijavaDTO {
	public String ime;
	public String prezime;
	public String email;
	public String adresa;
	public StepenObrazovanjaDTO stepenObrazovanja;
	public String fileLocation;

	@Override
	public String toString() {
		return this.ime + " " + this.prezime + "\n" + this.email + " " + this.adresa + "\n" + this.stepenObrazovanja
				+ "\n" + this.fileLocation;
	}
}
