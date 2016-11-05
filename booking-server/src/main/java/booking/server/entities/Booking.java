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

    public Booking(Long id, Long userId, Date startDate, Date endDate, Long resourceId) {
        this.id = id;
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resourceId = resourceId;
    }

    public Booking() {}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Long id;

    Long userId;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
    Date startDate;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
    Date endDate;

    Long resourceId;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Long getResourceId() {
        return resourceId;
    }
}
