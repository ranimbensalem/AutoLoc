package tn.esprit.autoloc.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}