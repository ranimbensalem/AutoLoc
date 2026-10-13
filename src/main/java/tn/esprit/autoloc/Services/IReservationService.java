package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    void deleteReservation(long id);
    List<Reservation> retrieveReservation();
    Reservation retrieveReservationById(long id);
    Reservation updateReservation(Reservation reservation);
}