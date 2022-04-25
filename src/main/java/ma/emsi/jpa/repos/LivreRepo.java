package ma.emsi.jpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.jpa.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre, Integer> {

}
