package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    void deleteEquipement(long id);
    List<Equipement> retrieveEquipement();
    Equipement retrieveEquipementById(long id);
    Equipement updateEquipement(Equipement equipement);
}