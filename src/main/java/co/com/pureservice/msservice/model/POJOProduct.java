package co.com.pureservice.msservice.model;

import java.util.UUID;

public class POJOProduct {
    private UUID id;
    private String name;
    private double cost;
    private int stock;
    private double totalCost;

    public UUID getId() {
        return id;
    }

    public POJOProduct setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public POJOProduct setName(String name) {
        this.name = name;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public POJOProduct setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public POJOProduct setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public POJOProduct setTotalCost(double totalCost) {
        this.totalCost = totalCost;
        return this;
    }
}
