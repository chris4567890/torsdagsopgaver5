import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer c0 = new Customer("Bent","Bentsen","BentBentsen",0);
        Customer c1 = new Customer("Henrik","Henriksen","HenrikHenriksen",1);
        Customer c2 = new Customer("Jørgen","Jørgensen","JørgenJørgnsen",2);
        Customer c3 = new Customer("Mette","Frederiksen","MetteFrederiksen",3);
        Customer c4 = new Customer("Lars","Lykke","LarsLykke",4);
        Customer c5 = new Customer("Jakob","Elleman","JakobElleman",5);

        customers.add(c0);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        for(Customer c : customers){
            System.out.println(c.toString());
        }


    }
}