package model.dao.impl;

import java.util.List;

import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{

	@Override
	public void insert(Seller s) {
		System.out.println("insert");
		
	}

	@Override
	public void update(Seller s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletByID(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
