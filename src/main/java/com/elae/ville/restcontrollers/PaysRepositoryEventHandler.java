package com.elae.ville.restcontrollers;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.elae.ville.entities.Pays;

/**
 * Ensures POST /pays always creates a new country, even if a client sends
 * a placeholder value (such as idPays: 0) for the generated identifier.
 */
@Component
@RepositoryEventHandler(Pays.class)
public class PaysRepositoryEventHandler {

	@HandleBeforeCreate
	public void clearGeneratedId(Pays pays) {
		pays.setIdPays(null);
	}
}
