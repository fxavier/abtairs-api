package com.xavier.abtairsapi.model;

public enum ReasonNotSensitized {

	CLOSED("Fechada"),
	ADULT_ABSENT("Adulto nao presente"),
	REFUSAL("Recusa");
	
	private String description;
	
	ReasonNotSensitized(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	
}
