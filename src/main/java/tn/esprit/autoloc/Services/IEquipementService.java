package tn.esprit.autoloc.Services;
import tn.esprit.autoloc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement (Equipement equipement);
    void supprimerEquipement (Long id) ;
    List<Equipement> afficherEquipements ();
    Equipement modifierEquipement (Equipement equipement);
    Equipement  AfficherEquipementByID (Long id);
}