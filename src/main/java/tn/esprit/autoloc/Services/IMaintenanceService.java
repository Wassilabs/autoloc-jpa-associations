package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    void supprimerMaintenance(Long id);
    List<Maintenance> afficherMaintenances();
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance AfficherMaintenanceByID(Long id);
}