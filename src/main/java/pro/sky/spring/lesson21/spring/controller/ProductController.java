//package pro.sky.spring.lesson21.spring.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import pro.sky.spring.lesson21.spring.data.Product;
//import pro.sky.spring.lesson21.spring.service.ProductService;
//
//@RestController
//@RequestMapping("/store/order")
//public class ProductController {
//
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/add")
//    public Product addProduct(@RequestParam Integer productId) {
//        return productService.add(productId);
//    }
//
//    @GetMapping("/get")
//    public Product getProduct(@RequestParam Integer productId) {
//        return productService.get(productId);
//    }
//}
