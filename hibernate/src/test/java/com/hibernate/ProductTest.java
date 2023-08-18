package com.hibernate;

import com.hibernate.dao.IProductDAO;
import com.hibernate.dao.ProductDAO;
import com.hibernate.domain.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    private IProductDAO productDAO;

    public ProductTest(){
        productDAO = new ProductDAO();
    }
    @Test
    public void create(){
        Product product = new Product();
        product.setName("Celular");
        product.setPrice(2000D);

        Product productReturn = productDAO.create(product);

        Assert.assertNotNull(productReturn);
        Assert.assertNotNull(productReturn.getId());


    }
}
