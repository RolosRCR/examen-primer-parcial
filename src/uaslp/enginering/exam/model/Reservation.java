package uaslp.enginering.exam.model;

import uaslp.enginering.exam.Guest;

public class Reservation {
    private int roomNumber;
    private String arrivalDate;
    private Guest Currentguest;
    private int nights;
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setGuest(Guest guest) {
        Currentguest = guest;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public Guest getGuest() {
        return Currentguest;
    }

    public int getNights() {
        return nights;
    }


}
