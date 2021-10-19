package model;

import java.io.Serializable;

public class Product implements Serializable {

    private long id;
    private String name;
    private double priceInCents;

    public Product(long id, String name, double priceInCents) {
        this.id = id;
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }
}
