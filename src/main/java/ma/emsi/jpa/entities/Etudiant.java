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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity @Table(name = "ETUDIANTS_EMSI")
public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOM",length = 40, nullable = false)
	private String name;
	@Column(name = "date_naissance") @Temporal(TemporalType.DATE)
	private Date birthday;

}


