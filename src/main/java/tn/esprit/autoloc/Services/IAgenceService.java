package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence (Agence agence);
    void supprimerAgence (Long id) ;
    List <Agence> afficherAgences ();
    Agence modifierAgence (Agence agence);
    Agence AfficherAgenceByID (Long id);
}
