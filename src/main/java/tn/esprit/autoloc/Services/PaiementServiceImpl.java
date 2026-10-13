package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.IPaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final IPaiementRepository paiementRepo;

    @Override
    public List<Paiement> retrievePaiement() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement retrievePaiementById(long id) {
        return paiementRepo.findById(id).orElseThrow(null);
    }
}