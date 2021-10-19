package dao;

import model.Products;

public class DaoFactory {

    private static Products productsDao;

    public static  Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ProductInMemoryDao();
        }
        return productsDao;
    }
}
