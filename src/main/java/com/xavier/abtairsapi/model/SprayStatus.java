package com.xavier.abtairsapi.model;

public enum SprayStatus {
	
	SPRAYED("Pulverizada"),
	NOT_SPRAYED("Nao Pulverizada");
	
	private String description;
	private String documento;
	
	private SprayStatus(String description, String documento) {
		this.description = description;
		this.documento = documento;
	}
		
	private SprayStatus(String description) {
		this.description = description;
	}



	public String getDescription() {
		return description;
	}

	public String getDocumento() {
		return documento;
	}
	   
	
	
}
