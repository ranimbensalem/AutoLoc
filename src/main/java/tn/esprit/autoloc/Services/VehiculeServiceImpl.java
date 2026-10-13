package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.IVehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final IVehiculeRepository vehiculeRepo;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void deleteVehicule(long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> retrieveVehicule() {
        return vehiculeRepo.findAll();
    }

    @Override
    public Vehicule retrieveVehiculeById(long id) {
        return vehiculeRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }
}