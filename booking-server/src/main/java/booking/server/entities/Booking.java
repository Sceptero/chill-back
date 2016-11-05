package booking.server.entities;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;

/**
 * Created by Wojtek on 2016-11-05.
 */
@Entity
public class Booking implements Serializable{

    public Booking(Long id, Date startDate, Date endDate, Resource resource, User user) {
        this.id = id;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resource = resource;
    }

    public Booking() {}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Long id;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
    Date startDate;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
    Date endDate;

    @ManyToOne
    Resource resource;

    @ManyToOne
    User user;

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Resource getResource() {
        return resource;
    }
}
