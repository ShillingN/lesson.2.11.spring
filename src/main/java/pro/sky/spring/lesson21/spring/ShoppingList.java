package pro.sky.spring.lesson21.spring;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring.lesson21.spring.data.Product;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Repository
public class ShoppingList {

    private final List<List<Integer>> shoppingList;

    public ShoppingList() {
        this.shoppingList = new ArrayList<>();
    }

    public Product add(List<Integer> productId) {
        Product product = new Product(productId);
        shoppingList.add(productId);
        return product;
    }

    public List<List<Integer>> getShoppingList() {
        return shoppingList;
    }



}
