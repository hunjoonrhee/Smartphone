package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void getContactsTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        ArrayList<Contact> actual = smartphone.getContacts();


        // THEN
        String expectedToString = "[Friend{" +
                "name='" + "Joon" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "Eunjoo" + '\'' +
                ", telefonnummer='" + "0123456789" + '\'' +
                ", spitzname='" + "Joo" + '\'' +
                '}'+"]";
        assertEquals(expectedToString, actual.toString());
    }

    @Test
    void getContactsTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        ArrayList<Contact> actual = smartphone.getContacts();


        // THEN
        String expectedToString = "[Friend{" +
                "name='" + "Joon" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "Eunjoo" + '\'' +
                ", telefonnummer='" + "0123456789" + '\'' +
                ", spitzname='" + "joo" + '\'' +
                '}'+"]";
        assertFalse(expectedToString.equals(actual.toString()));
    }

    @Test
    void getManufacturesTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getManufatures();


        // THEN
        assertEquals("Samsung", actual);

    }

    @Test
    void getManufacturesTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getManufatures();


        // THEN
        assertEquals(false, "samsung".equals(actual));
    }

    @Test
    void getModellsTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getModells();


        // THEN
        assertEquals("GalaxyS22", actual);

    }

    @Test
    void getModellsTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getModells();


        // THEN
        assertEquals(false, "GalaxyS21".equals(actual));
    }

    @Test
    void startRadioTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        boolean actual = smartphone.startRadio();


        // THEN
        assertTrue(actual);

    }

    @Test
    void stopRadioTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        boolean actual = smartphone.stopRadio();


        // THEN
        assertFalse(actual);
    }

    @Test
    void getPositionTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getPosition();


        // THEN
        assertTrue("Köln".equals(actual));

    }

    @Test
    void getPositionTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getPosition();


        // THEN
        assertFalse("Frankfurt".equals(actual));
    }

    @Test
    void addContactTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        Friend newFriend = new Friend("Bongsoo", "0123452123", "Soo");
        smartphone.addContact(newFriend);
        // WHEN
        ArrayList<Contact> actual = smartphone.getContacts();


        // THEN
        String expectedToString = "[Friend{" +
                "name='" + "Joon" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "Eunjoo" + '\'' +
                ", telefonnummer='" + "0123456789" + '\'' +
                ", spitzname='" + "Joo" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "Bongsoo" + '\'' +
                ", telefonnummer='" + "0123452123" + '\'' +
                ", spitzname='" + "Soo" + '\'' +
                '}' +"]";
        assertEquals(expectedToString, actual.toString());
    }

    @Test
    void addContactTestForFalse(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        Friend newFriend = new Friend("Bongsoo", "0123452123", "Soo");
        smartphone.addContact(newFriend);
        // WHEN
        ArrayList<Contact> actual = smartphone.getContacts();


        // THEN
        String expectedToString = "[Friend{" +
                "name='" + "Joon" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "Eunjoo" + '\'' +
                ", telefonnummer='" + "0123456789" + '\'' +
                ", spitzname='" + "Joo" + '\'' +
                '}' + ", " +
                "Friend{" +
                "name='" + "bongsoo" + '\'' +
                ", telefonnummer='" + "0123452123" + '\'' +
                ", spitzname='" + "Soo" + '\'' +
                '}' +"]";
        assertFalse(expectedToString.equals(actual.toString()));
    }

    @Test
    void getContactTestForTrue(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        Contact actual = smartphone.getContact(2);


        // THEN
        assertTrue(actual == null);
    }
    @Test
    void getContactTestForTrue1(){
        // GIVEN

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Friend("Joon", "017612345678", "Joonie"));
        contacts.add(new Friend("Eunjoo", "0123456789", "Joo"));
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        Contact actual = smartphone.getContact(1);


        // THEN
        String expectedToString =
                "Friend{" +
                "name='" + "Eunjoo" + '\'' +
                ", telefonnummer='" + "0123456789" + '\'' +
                ", spitzname='" + "Joo" + '\'' +
                '}';
        assertEquals(expectedToString, actual.toString());
    }
}