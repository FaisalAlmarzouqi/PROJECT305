package model;

/**
 * Represents a product in the shopping system
 */
public class Product {

    private int id;
    private String name;
    private double price;

    /**
     * Creates a product object
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Returns product ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns product name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns product price
     */
    public double getPrice() {
        return price;
    }
}