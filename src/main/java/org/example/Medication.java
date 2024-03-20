package org.example;

public class Medication {
    private String name;
    private double price;
    private int availability;

    public Medication(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
