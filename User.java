import java.util.Scanner;
import java.util.Vector;
public abstract class User {
    private String name;
    private String surname;
    private String password;
    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }
    public String viewInfo(){
        return "Name: " + name + "\nSurname: " + surname ;
    }
}
