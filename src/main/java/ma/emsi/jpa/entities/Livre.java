package ma.emsi.jpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
@Table(name="livre")
public class Livre  {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "titre", length = 50)
	private String titre;
	
	@Column(name = "maison_edition", length = 50)
	private String maison_e;
	
	@Column(name="date_sortie") @Temporal(TemporalType.DATE)
	private Date date_s;
	
	@Column(name="auteur")
	private String auteur;
	
	@Column(name="date_derniere_consultation") @Temporal(TemporalType.DATE)
	private Date date_der_cons;
	
	@Column(name="disponibilite")
	private boolean disp;
}
