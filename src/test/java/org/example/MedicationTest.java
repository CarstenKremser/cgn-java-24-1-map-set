package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedicationTest {

    @Test
    void testEquals_shouldReturnFalse_whenMedicationsHaveDifferentPrices() {
        Medication med1 = new Medication("med", 1.23, 45);
        Medication med2 = new Medication("med", 2.34, 45);

        boolean actual = med1.equals(med2);

        Assertions.assertFalse(actual);
    }
    @Test
    void testEquals_shouldReturnFalse_whenMedicationsHaveDifferentNames() {
        Medication med1 = new Medication("med1", 1.23, 45);
        Medication med2 = new Medication("med2", 1.23, 45);

        boolean actual = med1.equals(med2);

        Assertions.assertFalse(actual);
    }

    @Test
    void testEquals_shouldReturnFalse_whenMedicationsHaveDifferentAvailability() {
        Medication med1 = new Medication("med", 1.23, 45);
        Medication med2 = new Medication("med", 1.23, 55);

        boolean actual = med1.equals(med2);

        Assertions.assertTrue(actual);
    }

    @Test
    void testHashCode_shouldReturnSameHashcode_whenMedicationsHaveDifferentNames() {
        Medication med1 = new Medication("med1", 1.23, 45);
        Medication med2 = new Medication("med2", 1.23, 45);

        int med1hashCode = med1.hashCode();
        int med2hashCode = med2.hashCode();

        Assertions.assertNotEquals(med1hashCode, med2hashCode);
    }
    @Test
    void testHashCode_shouldReturnSameHashcode_whenMedicationsHaveDifferentPrices() {
        Medication med1 = new Medication("med", 1.23, 45);
        Medication med2 = new Medication("med", 2.34, 45);

        int med1hashCode = med1.hashCode();
        int med2hashCode = med2.hashCode();

        Assertions.assertNotEquals(med1hashCode, med2hashCode);
    }
    @Test
    void testHashCode_shouldReturnSameHashcode_whenMedicationsHaveDifferentAvailability() {
        Medication med1 = new Medication("med", 1.23, 45);
        Medication med2 = new Medication("med", 1.23, 55);

        int med1hashCode = med1.hashCode();
        int med2hashCode = med2.hashCode();

        Assertions.assertEquals(med1hashCode, med2hashCode);
    }
}