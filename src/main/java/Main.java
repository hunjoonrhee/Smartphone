import model.Contact;
import model.Friend;
import model.Smartphone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);

        System.out.println(smartphone.startRadio());
        System.out.println(smartphone.stopRadio());
        System.out.println(smartphone.getPosition());
        System.out.println(smartphone);

    }
}
