package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IPaiementService;
import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {

    private IPaiementService paiementService;

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id) {
        paiementService.supprimerPaiement(id);
    }

    @GetMapping("/getPaiement/{id}")
    public Paiement AfficherPaiementByID(@PathVariable Long id) {
        return paiementService.AfficherPaiementByID(id);
    }

    @GetMapping("/allPaiements")
    public List<Paiement> afficherPaiements() {
        return paiementService.afficherPaiements();
    }
}