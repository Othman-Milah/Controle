package ma.emsi.jpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.emsi.jpa.entities.Etudiant;
import ma.emsi.jpa.repos.EtudiantRepo;

@SpringBootApplication
public class Tpjpag21Application implements CommandLineRunner {

	@Autowired
	EtudiantRepo etudiantRepo;
	public static void main(String[] args) {
		SpringApplication.run(Tpjpag21Application.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 for(int i=1; i< 20;i++) {
			etudiantRepo.save(new Etudiant(null,"Etudiant "+i, new Date()));
		}
	
		System.out.println("Nombre de lignes: " + etudiantRepo.count());
		
		System.out.println("Selectionner un étudiant");
		Etudiant e7 = etudiantRepo.findById(7).orElse(null);
		if(e7 == null )
			System.out.println("Etudiant n existe pas ! ");			
		else
			System.out.println(e7.toString());
		
		System.out.println("Selectionner l'ensemble");
		etudiantRepo.findAll().forEach(e -> {
			System.out.println(e.toString());
		});;
		
		
		System.out.println("MAJ étudiant 7");
		e7.setName("Etudiant EMSI Centre 1");
		etudiantRepo.save(e7);
		
		System.out.println("Supprission d'un étudiant");
		etudiantRepo.delete(e7);
		
		etudiantRepo.deleteById(10);
		
		etudiantRepo.findByName("Etudiant 12").forEach(e -> {
			System.out.println(e.toString());
		});;
		
		System.out.println("Supprission d'un étudiant par son nom");
		System.out.println("Nbr de lignes supprimées : " + 
					etudiantRepo.deleteByName("Etudiant 14"));
		 */
	}

}
