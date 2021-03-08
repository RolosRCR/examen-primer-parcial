package uaslp.enginering.exam.model;

import uaslp.enginering.exam.Guest;

import java.util.ArrayList;

import uaslp.enginering.exam.Room;
import uaslp.enginering.exam.model.RoomStatus;
public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList <Room> rooms;
    private String name;


    public Hotel(String name) {
        this.name=name;
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();
        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);
        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    }

