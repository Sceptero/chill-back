package booking.server.services.booking;

import booking.server.entities.Booking;
import booking.server.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Wojtek on 2016-11-05.
 */

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Iterable<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findOne(id);
    }

    @Override
    public void deleteBookingById(Long id) {
        bookingRepository.delete(id);
    }

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}
