package patterns.structural_patterns.dao.abst_class;

import java.lang.management.LockInfo;
import java.util.List;

public abstract class GeneralDao<T> {
    abstract void save(T obj);
    abstract void update(T obj);
    abstract void delete(T obj);
    abstract List<T> findAll();
    abstract T findById(Long id);
}
