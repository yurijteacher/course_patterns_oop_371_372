package patterns.structural_patterns.dao.impl_inerface;

import java.util.List;

public interface GeneralDao<T> {

  void save(T obj);
  void update(T obj);
  void delete(T obj);
  List<T> findAll();
  T findById(Long id);
}
