package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void getContactsTestForTrue(){
        // GIVEN

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        Contact[] actual = smartphone.getConstacts();


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
        assertEquals(expectedToString, Arrays.toString(actual));
    }

    @Test
    void getContactsTestForFalse(){
        // GIVEN

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        Contact[] actual = smartphone.getConstacts();


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
        assertFalse(expectedToString.equals(Arrays.toString(actual)));
    }

    @Test
    void getManufacturesTestForTrue(){
        // GIVEN

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
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

        Contact[] contacts = {new Friend("Joon", "017612345678", "Joonie"),
                new Friend("Eunjoo", "0123456789", "Joo")};
        String modells = "GalaxyS22";
        String manufatures = "Samsung";
        Smartphone smartphone = new Smartphone(modells, manufatures, contacts);
        // WHEN
        String actual = smartphone.getPosition();


        // THEN
        assertFalse("Frankfurt".equals(actual));
    }
}