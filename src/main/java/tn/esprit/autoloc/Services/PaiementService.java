package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {

    PaiementRepository paiementRepository ;
    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepository.deleteById(id);

    }

    @Override
    public List<Paiement> afficherPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement AfficherPaiementByID(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }
}