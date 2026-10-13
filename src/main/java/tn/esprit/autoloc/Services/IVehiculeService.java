package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    void deleteVehicule(long id);
    List<Vehicule> retrieveVehicule();
    Vehicule retrieveVehiculeById(long id);
    Vehicule updateVehicule(Vehicule vehicule);
}