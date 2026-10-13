package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    void deleteAgence(long id);
    List<Agence> retrieveAgence();
    Agence retrieveAgenceById(long id);
    Agence updateAgence(Agence agence);

}
