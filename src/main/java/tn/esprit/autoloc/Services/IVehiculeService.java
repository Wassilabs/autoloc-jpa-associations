package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule (Vehicule vehicule);
    void supprimerVehicule (Long id) ;
    List<Vehicule> afficherVehicules ();
    Vehicule modifierVehicule (Vehicule vehicule);
    Vehicule AfficherVehiculeByID (Long id);

}
