package model.dao;

import java.util.List;

import model.entitites.Department;
import model.entitites.Seller;

public interface DepartmentDAO {
    
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
