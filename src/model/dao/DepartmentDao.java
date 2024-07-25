package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	void insert(Department dp);
	void update(Department dp);
	void deletByID(Integer id);
	Department findByID(Integer id);
	List<Department>findAll();
}
