package com.test.project.service;




import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Implement the Service interface for models with Hibernate annotations
 */
public abstract class AbstractService<T> implements Service<T> {
	
	protected CrudRepository<T, Long> tDao;

    public AbstractService(String daoClassName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		tDao = (CrudRepository<T, Long>) Class.forName(daoClassName).newInstance();
    }
    
    public T save(T model) {
        return tDao.save(model);
    }
    
    
    public List<T> save(List<T> models) {
        return (List<T>)tDao.save(models);
    }

    public void deleteById(Long id) {
        tDao.delete(id);
    }


    public T findById(Long id) {
        return tDao.findOne(id);
    }
  

    public List<T> findAll() {
        return (List<T>)tDao.findAll();
    }
}
