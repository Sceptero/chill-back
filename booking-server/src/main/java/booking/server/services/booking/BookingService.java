package booking.server.services.booking;

import booking.server.entities.Booking;
import org.springframework.stereotype.Service;
 
@Service
public interface BookingService
{
    Iterable<Booking> getBookings();

    Booking getBookingById(Long id);

    void deleteBookingById(Long id);

    void saveBooking(Booking booking);
}

