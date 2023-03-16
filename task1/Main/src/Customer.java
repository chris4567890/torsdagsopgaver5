public class Customer {
    private String firstName,lastName,username;
    private static int id;
    Customer(String firstName, String lastName, String username, int id){
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "first name : "+ firstName + ", last name: " + lastName+ ", username: "+ username;
    }


}
