package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation ajouterReservation (Reservation reservation);
    void supprimerReservation (Long id) ;
    List<Reservation> afficherReservations ();
    Reservation modifierReservation (Reservation reservation);
    Reservation AfficherReservationByID (Long id);
}
