package tn.esprit.autoloc.Repositories;

import tn.esprit.autoloc.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}