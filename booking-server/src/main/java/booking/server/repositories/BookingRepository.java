package booking.server.repositories;

import booking.server.entities.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.io.Serializable;

/**
 * Created by Wojtek on 2016-11-05.
 */
@Repository
public interface BookingRepository
        extends CrudRepository<Booking, Long> {



}
