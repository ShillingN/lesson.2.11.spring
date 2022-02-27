package pro.sky.spring.lesson21.spring.service;

import org.springframework.stereotype.Service;
import pro.sky.spring.lesson21.spring.ShoppingList;
import pro.sky.spring.lesson21.spring.data.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ShoppingList shoppingList;

    public ProductServiceImpl(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public Product add(List productId) {
        return shoppingList.add(productId);
    }

    public List<List> get() {
        return shoppingList.getShoppingList();
    }
}
