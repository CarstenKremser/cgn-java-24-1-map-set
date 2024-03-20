package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

    private Map<String,Medication> medications = new HashMap<>();

    int getCount() {
        return medications.size();
    }

    void save(Medication medication) {
        medications.put(medication.getName(),medication);
    }

    Medication find (String medicationName) {
        return medications.get(medicationName);
    }

    void delete(String medicationName) {
        medications.remove(medicationName);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                '}';
    }
}
