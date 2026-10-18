package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {

    Employe ajouterEmploye(Employe employe);
    void supprimerEmploye(Long id);
    List<Employe> afficherEmployes();
    Employe modifierEmploye(Employe employe);
    Employe AfficherEmployeByID(Long id);
}