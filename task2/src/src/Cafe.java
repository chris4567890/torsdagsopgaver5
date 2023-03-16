import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<String>();



    Cafe(){
        this.coffeeMenu = coffeeMenu;
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    public void loadMenuData(){
        File file = new File("coffees.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



}
