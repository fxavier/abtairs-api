package com.xavier.abtairsapi.model;

public enum ReasonNotSprayed {
	CLOSED("Fechada"),
	REFUSAL("Recusa"),
	SICK("Doenca"),
	FUNERAL("Funeral"),
	OTHER("Outros Motivos");
	
	private String description;

	ReasonNotSprayed(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	
	

}
