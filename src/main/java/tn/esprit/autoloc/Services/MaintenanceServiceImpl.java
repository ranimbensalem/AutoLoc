package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Repositories.IMaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final IMaintenanceRepository maintenanceRepo;

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void deleteMaintenance(long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> retrieveMaintenance() {
        return maintenanceRepo.findAll();
    }

    @Override
    public Maintenance retrieveMaintenanceById(long id) {
        return maintenanceRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }
}