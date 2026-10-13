package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    void deleteContrat(long id);
    List<Contrat> retrieveContrat();
    Contrat retrieveContratById(long id);
    Contrat updateContrat(Contrat contrat);
}