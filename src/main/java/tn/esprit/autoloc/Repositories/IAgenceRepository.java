package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.Entities.Agence;

@Repository
public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}
