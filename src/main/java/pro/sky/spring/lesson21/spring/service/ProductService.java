package pro.sky.spring.lesson21.spring.service;

import pro.sky.spring.lesson21.spring.data.Product;

import java.util.List;

public interface ProductService {
    Product add(List<Integer> productId);

    List<List<Integer>> get();
}
