package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department dp = new Department(2, null);
		
		Integer id = 1;
		System.out.println("===== findById =====");

		System.out.println("Id: " + id);
		sellerDao.findByID(id);
		System.out.println("");
		
		if(sellerDao.findByID(id) != null) {
			System.out.println(sellerDao.findByID(id));
		} else {
			System.out.println("404 - Not Found");			
		}
	
		System.out.println("===== findByDepartment =====");
		List<Seller> list = sellerDao.findByDepartment(dp);
		System.out.println("Department: " + dp.getId());
		System.out.println("");
		for(Seller s : list) {
			System.out.println(s);	
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("===== findAll =====");
		System.out.println("");
		list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);	
			System.out.println("");
		}
		
		Seller newSeller = new Seller(null, "Jim Halpert", "jim@gmail.com", new Date(), 2789.00, dp);
		sellerDao.insert(newSeller);
		System.out.println("Status 200. New id: " + newSeller.getId());
		
		Seller sellerUpdated = sellerDao.findByID(9);
		sellerUpdated.setName("Jim Halpert");
		sellerUpdated.setEmail("jim@gmail.com");
		sellerDao.update(sellerUpdated);
		System.out.println("Update completed");

		
		sellerDao.deletByID(12);
		
	}
}
