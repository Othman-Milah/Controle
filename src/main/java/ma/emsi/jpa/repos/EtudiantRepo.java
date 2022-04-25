package ma.emsi.jpa.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import ma.emsi.jpa.entities.Etudiant;

@Transactional
public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {

	List<Etudiant> findByBirthday(Date birthday);
	List<Etudiant> findByName(String name);
	
	long deleteByName(String n);
	
	
}
