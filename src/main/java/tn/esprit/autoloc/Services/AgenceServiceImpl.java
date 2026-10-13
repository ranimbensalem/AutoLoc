package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.IAgenceRepository;
import tn.esprit.autoloc.Repositories.IEmployeRepository;

import java.util.List;

@Service//declarer le bean avec @service nottation qui fait la logique metier

@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService{
    //@Autowired // on peut remplacer by setter w la constructor
    private final IAgenceRepository agenceRepo;


    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteAgence(long id) {
    agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> retrieveAgence() {
        return agenceRepo.findAll();
    }

    @Override
    public Agence retrieveAgenceById(long id) {
        return agenceRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }
}
