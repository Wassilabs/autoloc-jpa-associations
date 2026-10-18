package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {


}
