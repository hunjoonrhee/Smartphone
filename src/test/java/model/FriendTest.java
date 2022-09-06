package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    void toStringTestForTrue(){
        // GIVEN
        Friend Joon = new Friend("Joon", "017612345678", "Joonie");

        // WHEN
        String actual = Joon.toString();

        // THEN
        String expectedToString = "Friend{" +
                "name='" + "Joon" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}';

        assertEquals(expectedToString, actual);
    }

    @Test
    void toStringTestForFalse(){
        // GIVEN
        Friend Joon = new Friend("Joon", "017612345678", "Joonie");

        // WHEN
        String actual = Joon.toString();

        // THEN
        String expectedToString = "Friend{" +
                "name='" + "Joonie" + '\'' +
                ", telefonnummer='" + "017612345678" + '\'' +
                ", spitzname='" + "Joonie" + '\'' +
                '}';

        assertFalse(expectedToString.equals(actual));
    }

}