package ma.emsi.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.jpa.entities.Livre;
import ma.emsi.jpa.repos.LivreRepo;

@Service
public class LivreService {

	@Autowired
	private LivreRepo repo;
	
	public Livre getLivre(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Livre> getLivres() {
		return repo.findAll();
	}
	
	public Livre AddLivre(Livre livre) {
		return repo.save(livre);
	}
	
	public List<Livre> AddLivres(List<Livre> livres){
		return repo.saveAll(livres);
	}
	
	public String DeleteLivre(Integer id) {
		repo.delete(repo.getById(id));
		return "Livre numero "+id+" est supprime";
	}
	
	public Livre UpdateLivre(Livre livre) {
		Livre newLivre = repo.getById(livre.getId());
		newLivre.setAuteur(livre.getAuteur());
		newLivre.setDate_der_cons(livre.getDate_der_cons());
		newLivre.setDate_s(livre.getDate_s());
		newLivre.setDisp(true);
		newLivre.setMaison_e(livre.getMaison_e());
		newLivre.setTitre(livre.getTitre());
		return repo.save(newLivre);
	}
}
