package interfac.crud;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {
	
	void save(T obj) throws Exception;
	
	void persist(T obj) throws Exception;
	
	void saveOrUpdate(T obj) throws Exception;
	
	void update(T obj) throws Exception;
	
	void delete(T obj) throws Exception;
	
	T merge(T obj) throws Exception;
	
	List<T> findList(Class<T> objs) throws Exception;
	
	T findById(Class<T> entidade, Long id) throws Exception;
	
	List<T> findListByQuery(String s) throws Exception;
	
	void executeUpdateQuery(String s) throws Exception;
	
	void executeUpdateSql(String s) throws Exception;
	
	// Limpa sessão do hibernate
	void clearSession() throws Exception;
	
	// Retira um objeto da sessão do hibernate
	void evic(Object objs) throws Exception;
	
	Session getSession() throws Exception;
	
	List<?> getListSql(String s) throws Exception;
	
	// JDBC Spring
	JdbcTemplate getJdbcTemplate();
	
	SimpleJdbcTemplate getSimpleJdbcTemplate();
	
	SimpleJdbcInsert getSimpleJdbcInsert();
	
	Long totalRegistro(String table) throws Exception;
	
	Query obterQuery(String query) throws Exception;
	
	// Paginação com JSF + Primefaces
	List<T> findListByQuery(String query, int iniciaNoRegistro, int maximoResultado) throws Exception;

}
