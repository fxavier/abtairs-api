package com.xavier.abtairsapi.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.xavier.abtairsapi.event.CreatedResourceEvent;

public class CreatedResourceListener implements ApplicationListener<CreatedResourceEvent>{

	@Override
	public void onApplicationEvent(CreatedResourceEvent createdResourceEvent) {
		
		HttpServletResponse response = createdResourceEvent.getResponse();
		Long id = createdResourceEvent.getId();
		
		AddHeaderLocation(response, id);
		
		
	}

	private void AddHeaderLocation(HttpServletResponse response, Long id) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(id).toUri();
		response.setHeader("Location", uri.toASCIIString());
	}

	

}
