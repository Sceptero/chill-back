package booking.server.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

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
