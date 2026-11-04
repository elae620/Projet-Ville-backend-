package com.elae.ville.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.elae.ville.entities.Pays;

@RepositoryRestResource(path = "pays", collectionResourceRel = "pays")
@CrossOrigin("http://localhost:4200")
public interface PaysRepository extends JpaRepository<Pays, Long> {
}