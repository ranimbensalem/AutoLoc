package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.Entities.Employe;
@Repository
public interface IEmployeRepository extends JpaRepository<Employe, Long> {

}
