package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Paiement;
import java.util.List;

public interface IPaiementService {
    List<Paiement> retrievePaiement();
    Paiement retrievePaiementById(long id);
}