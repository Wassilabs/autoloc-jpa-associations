package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement (Paiement paiement);
    void supprimerPaiement (Long id) ;
    List<Paiement> afficherPaiements ();
    Paiement modifierPaiement (Paiement paiement);
    Paiement AfficherPaiementByID (Long id);
}