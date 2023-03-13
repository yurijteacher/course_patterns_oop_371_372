package patterns.structural_patterns.dao.abst_class;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends GeneralDao<Product>{


    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    void save(Product obj) {
        getProducts().add(obj);
    }

    @Override
    void update(Product obj) {
        getProducts().add(obj);
    }

    @Override
    void delete(Product obj) {
        products.remove(obj);
    }

    @Override
    List<Product> findAll() {
        return getProducts();
    }

    @Override
    Product findById(Long id) {
        Product product = (Product) getProducts().stream().filter(e->e.getId()==id);
        return product;
    }
}
