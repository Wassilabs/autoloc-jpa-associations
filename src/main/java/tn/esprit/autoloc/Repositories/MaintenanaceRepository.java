package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Maintenance;
@Repository
public interface MaintenanaceRepository extends JpaRepository<Maintenance, Long> {
}
