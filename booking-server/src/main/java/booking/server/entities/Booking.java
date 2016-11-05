package booking.server.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    @Embedded
    Long userId;

    Date startDate;

    Date endDate;

    Long resourceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}
