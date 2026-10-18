package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {

    EquipementRepository equipementRepository;
    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> afficherEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement AfficherEquipementByID(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }
}