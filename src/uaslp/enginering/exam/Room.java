package uaslp.enginering.exam;

import uaslp.enginering.exam.model.RoomStatus;

public class Room {
    private int number;
    private RoomStatus roomStatus;
    private String type;
    public Room(int number, String type, RoomStatus Status){
        this.type = type;
        this.number=number;
        this.roomStatus=Status;
    }

    public int getNumber() {
        return number;
    }

    public RoomStatus getStatus() {
        return roomStatus;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public void setType(String type) {
        this.type = type;
    }

}
