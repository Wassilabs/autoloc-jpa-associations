package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.Services.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")
public class ClientController {
    private IClientService clientService;
    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client)

    {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierAgence(@RequestBody Client client)

    {
        return clientService.modifierClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void SupprimerClient(@PathVariable Long id)
    {
        clientService.supprimerClient(id);
    }



    @GetMapping("/getClient/{id}")
    public Client AfficherClientByID(@PathVariable Long id)
    {
        return clientService.AfficherClientByID(id);
    }



    @GetMapping("/allClient")
    public List<Client> afficherClients()
    {
        return clientService.afficherClients();
    }


}
