package condoapp.models;

public class Room {
    private String roomNo,resident1,building,floor,type,resident2="-";


    public Room(String building,String floor,String roomNo, String type,String resident1,String resident2) {
        this.roomNo = roomNo;
        this.resident1 = resident1;
        this.building = building;
        this.floor = floor;
        this.type = type;
        this.resident2 = resident2;
    }

    public boolean isRoomNoMatch(String roomNo){
        if(this.roomNo.equals(roomNo)) return true;
        return false;
    }

    public void setResident1(String resident1) {
        this.resident1 = resident1;
    }

    public void setResident2(String resident2) {
        this.resident2 = resident2;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getResident1() {
        return resident1;
    }

    public String getBuilding() {
        return building;
    }

    public String getFloor() {
        return floor;
    }

    public String getType() {
        return type;
    }

    public String getResident2() {
        return resident2;
    }
}
