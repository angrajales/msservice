package co.com.pureservice.msservice.model;

import java.util.List;
import java.util.UUID;

public class POJOPurchase {
    private UUID id;
    private int totalItems;
    private double totalCost;
    private List<POJOProduct> puchasedProducts;

    public List<POJOProduct> getPuchasedProducts() {
        return puchasedProducts;
    }

    public POJOPurchase setPuchasedProducts(List<POJOProduct> puchasedProducts) {
        this.puchasedProducts = puchasedProducts;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public POJOPurchase setId(UUID id) {
        this.id = id;
        return this;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public POJOPurchase setTotalItems(int totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public POJOPurchase setTotalCost(double totalCost) {
        this.totalCost = totalCost;
        return this;
    }
}
