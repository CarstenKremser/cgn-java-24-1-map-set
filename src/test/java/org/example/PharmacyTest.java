package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PharmacyTest {

    @Test
    void getCount_shouldReturn5_whenCalledOnTestPharmacy() {
        Pharmacy testPharmacy = new Pharmacy();
        testPharmacy.save(new Medication("Med1",1.23,45));
        testPharmacy.save(new Medication("Med2",99.99,0));
        testPharmacy.save(new Medication("Med3",10,2));
        testPharmacy.save(new Medication("Med4",0.01,22222));
        testPharmacy.save(new Medication("Med5",-8,1));
        int expected = 5;

        int actual = testPharmacy.getCount();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void save_shouldHave1Member_whenCalledAfterInitialisation() {
        Pharmacy testPharmacy = new Pharmacy();
        testPharmacy.save(new Medication("Med1",1.23,45));
        int expected = 1;

        int actual = testPharmacy.getCount();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void find_shouldReturnMedication3_whenCalledWithMed3() {
        Pharmacy testPharmacy = new Pharmacy();
        Medication expected = new Medication("Med3",10,2);
        testPharmacy.save(new Medication("Med1",1.23,45));
        testPharmacy.save(new Medication("Med2",99.99,0));
        testPharmacy.save(expected);
        testPharmacy.save(new Medication("Med4",0.01,22222));
        testPharmacy.save(new Medication("Med5",-8,1));

        Medication actual = testPharmacy.find("Med3");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void delete_shouldHave4Members_whenInitializedWith5Members() {
        Pharmacy testPharmacy = new Pharmacy();
        testPharmacy.save(new Medication("Med1",1.23,45));
        testPharmacy.save(new Medication("Med2",99.99,0));
        testPharmacy.save(new Medication("Med3",10,2));
        testPharmacy.save(new Medication("Med4",0.01,22222));
        testPharmacy.save(new Medication("Med5",-8,1));
        int expected = 4;

        testPharmacy.delete("Med3");
        int actual = testPharmacy.getCount();

        Assertions.assertEquals(expected,actual);

    }
}