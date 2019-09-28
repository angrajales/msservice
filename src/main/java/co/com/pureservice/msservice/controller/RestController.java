package co.com.pureservice.msservice.controller;

import co.com.pureservice.msservice.model.POJOProduct;
import co.com.pureservice.msservice.model.POJOPurchase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/v1/purchase")
public class RestController {
    private final static String BASE_STRING = "products";
    @GetMapping("/{simpleId}")
    public POJOPurchase getPurchase(@Valid @PathVariable String simpleId){
        List<POJOProduct> productList = new ArrayList<POJOProduct>();
        POJOProduct product1 = new POJOProduct()
                .setId(UUID.nameUUIDFromBytes(String.valueOf(BASE_STRING + "1").getBytes()))
                .setCost(10)
                .setName("Product 1")
                .setStock(10)
                .setTotalCost(10 * 10);
        POJOProduct product2 = new POJOProduct()
                .setId(UUID.nameUUIDFromBytes(String.valueOf(BASE_STRING + "2").getBytes()))
                .setCost(12)
                .setName("Product 2")
                .setStock(10)
                .setTotalCost(10 * 12);
        productList.add(product1);
        productList.add(product2);
        double totalPrice = productList.stream().mapToDouble(p -> p.getTotalCost()).sum();
        POJOPurchase pojoPurchase = new POJOPurchase()
                .setId(UUID.randomUUID())
                .setTotalCost(totalPrice)
                .setTotalItems(productList.size())
                .setPuchasedProducts(productList);
        return pojoPurchase;
    }
}
