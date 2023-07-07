package dao;

import dao.generic.GenericDAO;
import domain.Product;

public class ProductDAO extends GenericDAO<Product> implements IProductDAO {
    @Override
    public void editData(Product newEntity, Product entity) {
        
    }

    @Override
    public Class<Product> getClassType() {
        return null;
    }
}
