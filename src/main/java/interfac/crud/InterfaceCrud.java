package interfac.crud;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {
	
	void save(T obj) throws Exception;
	
	void persist(T obj) throws Exception;
	
	void saveOrUpdate(T obj) throws Exception;

}
