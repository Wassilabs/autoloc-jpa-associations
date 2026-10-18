package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EmployeRepository;
import tn.esprit.autoloc.entities.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {

    private EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> afficherEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe AfficherEmployeByID(Long id) {
        return employeRepository.findById(id).orElse(null);
    }
}