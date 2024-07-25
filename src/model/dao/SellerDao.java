package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	void insert(Seller s);
	void update(Seller s);
	void deletByID(Integer id);
	Seller findByID(Integer id);
	List<Seller>findAll();
	List<Seller>findByDepartment(Department dp);	
}
