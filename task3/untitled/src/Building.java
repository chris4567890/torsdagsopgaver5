import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;

    private int numberOfBathrooms,numberOfFloors;
    boolean isOfficeBuilding;
    Building(ArrayList<Room> rooms,int numberOfBathrooms,int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }


}
