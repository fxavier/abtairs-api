package com.xavier.abtairsapi.model;

public enum ReasonNotAccepted {

	HOUSEHOLDER_NOT_PRESENT("Chefe do agregado familiar ausente"),
	SICK("Doenca"),
	FUNERAL("Funeral"),
	BABY_BORN("Bebe recem nascimento"),
	OTHER("Outros");
	
	private String description;
	
	ReasonNotAccepted(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	
}
