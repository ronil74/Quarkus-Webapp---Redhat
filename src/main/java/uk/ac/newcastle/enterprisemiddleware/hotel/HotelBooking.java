package uk.ac.newcastle.enterprisemiddleware.hotel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * <p>Simple POJO representing HotelBooking objects</p>
 *
 * @author Ronil
 */

public class HotelBooking implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private int hotelId;
    private int customerId;

    //    public String getHotelName() {
//        return hotelName;
//    }
//
//    public void setHotelName(String hotelName) {
//        this.hotelName = hotelName;
//    }
//
//    private String hotelName;
    private Date booking_Date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getBooking_Date() {
        return booking_Date;
    }

    public void setBooking_Date(Date booking_Date) {
        this.booking_Date = booking_Date;
    }

}
