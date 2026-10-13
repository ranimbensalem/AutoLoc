package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Repositories.IContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final IContratRepository contratRepo;

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public void deleteContrat(long id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> retrieveContrat() {
        return contratRepo.findAll();
    }

    @Override
    public Contrat retrieveContratById(long id) {
        return contratRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }
}