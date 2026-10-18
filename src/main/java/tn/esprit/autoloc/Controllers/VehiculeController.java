package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IVehiculeService;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicule/{id}")
    public Vehicule AfficherVehiculeByID(@PathVariable Long id) {
        return vehiculeService.AfficherVehiculeByID(id);
    }

    @GetMapping("/allVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.afficherVehicules();
    }
}