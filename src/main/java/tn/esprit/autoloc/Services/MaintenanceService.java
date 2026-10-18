package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.MaintenanaceRepository;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private MaintenanaceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> afficherMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance AfficherMaintenanceByID(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }
}