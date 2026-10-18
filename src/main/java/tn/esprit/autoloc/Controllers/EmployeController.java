package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.Services.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employes")
public class EmployeController {

    private IEmployeService employeService;

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);
    }

    @GetMapping("/getEmploye/{id}")
    public Employe AfficherEmployeByID(@PathVariable Long id) {
        return employeService.AfficherEmployeByID(id);
    }

    @GetMapping("/allEmployes")
    public List<Employe> afficherEmployes() {
        return employeService.afficherEmployes();
    }
}