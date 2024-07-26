package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDao seller = DaoFactory.createSellerDao();
		
//		Integer id = 10;
//		System.out.println("===== findById =====");
//		System.out.println("Id: " + id);
//		System.out.println("");
//		
//		if(seller.findByID(id) != null) {
//			System.out.println(seller.findByID(id));
//		} else {
//			System.out.println("404 - Not Found");			
//		}
//		
		Department dp = new Department(2, null);
		List<Seller> list = seller.findByDepartment(dp);
//		
//		System.out.println("");
//		System.out.println("===== findByDepartment =====");
//		System.out.println("Department: " + dp.getId());
//		System.out.println("");
//		
//		for(Seller s : list) {
//			System.out.println(s);	
//			System.out.println("");
//		}
//		
//		System.out.println("");
		System.out.println("===== findAll =====");
		System.out.println("");
		
		list = seller.findAll();
		for(Seller s : list) {
			System.out.println(s);	
			System.out.println("");
		}
		
//		Seller newSeller = new Seller(null, "Jim Halpert", "jim@gmail.com", new Date(), 2789.00, dp);
//		seller.insert(newSeller);
//		System.out.println("Status 200. New id: " + newSeller.getId());
	}
}
