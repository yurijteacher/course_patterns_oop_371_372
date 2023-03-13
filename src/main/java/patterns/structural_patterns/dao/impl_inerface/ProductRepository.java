package patterns.structural_patterns.dao.impl_inerface;

import patterns.structural_patterns.dao.abst_class.Product;

import java.util.List;

public class ProductRepository implements ProductDao{
    @Override
    public void save(Product obj) {

    }

    @Override
    public void update(Product obj) {

    }

    @Override
    public void delete(Product obj) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }
}
