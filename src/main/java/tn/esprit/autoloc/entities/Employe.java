package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.entities.enumeration.RoleEmploye;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long  idEmploye;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
    @ManyToOne
    private Agence agence;
}
