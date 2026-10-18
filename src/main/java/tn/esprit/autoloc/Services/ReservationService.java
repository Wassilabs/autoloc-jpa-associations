package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository ;
    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> afficherReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation AfficherReservationByID(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }
}
