package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.entities.enumeration.CategoieVehicule;
import tn.esprit.autoloc.entities.enumeration.StatutVehicule;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(EnumType.STRING)
    private CategoieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
    @ManyToOne
    private Agence agence;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private Set<Reservation> reservations;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipement> equipements;
}
