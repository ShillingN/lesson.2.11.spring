package pro.sky.spring.lesson21.spring.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pro.sky.spring.lesson21.spring.data.Product;
import pro.sky.spring.lesson21.spring.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/store/order", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public Product addProduct(@RequestParam List<Integer> productId) {
        return productService.add(productId);
    }

    @GetMapping("/get")
    public List<List<Integer>> getProduct() {
        return productService.get();
    }
}
