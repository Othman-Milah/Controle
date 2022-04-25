package ma.emsi.jpa.controller;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.jpa.entities.Livre;
import ma.emsi.jpa.service.LivreService;

@RestController
public class LivreController {
	@Autowired
	private LivreService service;
	
	@OrderBy
	@GetMapping("emsi_api/livres")
	public List<Livre> findAllLivres(){
		return service.getLivres();
	}
	
	@GetMapping("emsi_api/livre/{id}")
	public Livre findLivrebyId(@PathVariable Integer id) {
		return service.getLivre(id);
	}
	
	@PostMapping("emsi_api/addLivre")
	public Livre addLivre(@RequestBody Livre livre) {
		return service.AddLivre(livre);
	}
	
	@PostMapping("emsi_api/addLivres")
	public List<Livre> addLivres(@RequestBody List<Livre> livres){
		return service.AddLivres(livres);
	}
	
	@DeleteMapping("emsi_api/deleteLivre/{id}")
	public String deleteLivre(@PathVariable Integer id) {
		return service.DeleteLivre(id);
	}
	
	@PutMapping("emsi_api/updateLivre")
	public Livre updateLivre(@RequestBody Livre livre) {
		return service.UpdateLivre(livre);
	}
	
}
