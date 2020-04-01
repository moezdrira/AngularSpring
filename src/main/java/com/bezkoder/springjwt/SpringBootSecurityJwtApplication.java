package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.Produit;
import com.bezkoder.springjwt.repository.ProduitReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner {
	@Autowired
	private ProduitReposotory produitReposotory;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		produitReposotory.save(new Produit(null, "jwttttt", 605, 3));
		produitReposotory.save(new Produit(null, "rd1sssss1", 614, 5));
		produitReposotory.save(new Produit(null, "Mehdissss", 64, 5));
	}
}
