package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessContactTest {
    @Test
    void toStringTestForTrue(){
        // GIVEN
        BusinessContact Mustermann = new BusinessContact("Mustermann", "091112320", "MusterITGmbH");

        // WHEN
        String actual = Mustermann.toString();

        // THEN
        String expectedToString = "BusinessContact{" +
                "name='" + "Mustermann" + '\'' +
                ", telefonnummer='" + "091112320" + '\'' +
                ", companyName='" + "MusterITGmbH" + '\'' +
                '}';

        assertEquals(expectedToString, actual);
    }

    @Test
    void toStringTestForFalse(){
        // GIVEN
        BusinessContact Mustermann = new BusinessContact("Mustermann", "091112320", "MusterITGmbH");

        // WHEN
        String actual = Mustermann.toString();

        // THEN
        String expectedToString = "BusinessContact{" +
                "name='" + "mustermann" + '\'' +
                ", telefonnummer='" + "091112320" + '\'' +
                ", companyName='" + "MusterITGmbH" + '\'' +
                '}';

        assertFalse(expectedToString.equals(actual));
    }

    @Test
    void getCompanyNameTestForTrue(){
        // GIVEN
        BusinessContact Mustermann = new BusinessContact("Mustermann", "091112320", "MusterITGmbH");

        // WHEN
        String actual = Mustermann.getCompanyName();

        // THEN
        assertEquals("MusterITGmbH", actual);
    }

    @Test
    void getCompanyNameTestForFalse(){
        // GIVEN
        BusinessContact Mustermann = new BusinessContact("Mustermann", "091112320", "MusterITGmbH");

        // WHEN
        String actual = Mustermann.getCompanyName();

        // THEN
        assertEquals(false, "musterITGmbH".equals(actual));
    }

}