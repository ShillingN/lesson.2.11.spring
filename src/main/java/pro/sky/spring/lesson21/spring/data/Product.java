package pro.sky.spring.lesson21.spring.data;

import java.util.List;
import java.util.Objects;


public class Product {
    private final List productId;

    public Product(List productId) {
        this.productId = productId;
    }

    public List getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                '}';
    }
}
