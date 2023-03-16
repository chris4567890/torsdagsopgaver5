public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        System.out.println(cafe.getCoffeeMenu());


    }
}