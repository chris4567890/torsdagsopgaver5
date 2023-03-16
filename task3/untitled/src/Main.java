import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Room bedroom = new Room(1,1,0);
        Room kitchen = new Room(3,5,4);
        Room foyer = new Room(2,1,0);

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(bedroom);
        rooms.add(kitchen);
        rooms.add(foyer);

        Building building1 = new Building(rooms,0,1,false);

        System.out.println(countLampsInBuilding(building1));
        System.out.println(isNormal(building1));

    }
    static Building countLampsInBuilding(Building building){
        int lampCounter  = 0;
        for(Room room : building.getRooms()){
            lampCounter += room.getNumberOfLamps();
        }

        return building;
    }
    static boolean isNormal(Building building){
        int roomCounter = 0;
        int floorCounter = building.getNumberOfFloors();
        for(Room room : building.getRooms()){
            ++roomCounter;
        }

        if(floorCounter > roomCounter){
            return true;
        }else{
            System.out.println("This is an odd building");
            return false;
        }


    }
}