package pro.sky.spring.lesson21.spring.service;

import pro.sky.spring.lesson21.spring.data.Product;

import java.util.List;

public interface ProductService {
    Product add(List productId);

    List<List> get();
}
