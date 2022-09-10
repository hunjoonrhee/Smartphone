import model.Contact;
import model.Friend;
import model.Smartphone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        Contact Bongsoo = new Friend("Bongsoo", "0123452123", "Soo");
        smartphone.addContact(Bongsoo);
        System.out.println(smartphone.startRadio());
        System.out.println(smartphone.stopRadio());
        System.out.println(smartphone.getPosition());
        System.out.println(smartphone);
        System.out.println(smartphone.getContact(2));
        smartphone.removeContactByName("Joon");
        System.out.println(smartphone);

    }
}
