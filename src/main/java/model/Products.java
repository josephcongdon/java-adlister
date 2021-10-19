package model;

import java.util.List;

public interface Products {

    List<Product> findAll();
    Product findById(long id);
    void deleteById(long id);
    long insert (Product product);
    void editProduct(Product product);
}
