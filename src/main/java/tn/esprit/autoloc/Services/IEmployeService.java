package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    void deleteEmploye(long id);
    List<Employe> retrieveEmploye();
    Employe retrieveEmployeById(long id);
    Employe updateEmploye(Employe employe);
}