package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {		
		SellerDao seller = DaoFactory.createSellerDao();
		
		Integer id = 100;
		
		if(seller.findByID(id) != null) {
			System.out.println(seller.findByID(id));
		} else {
			System.out.println("404 - Not Found");			
		}
	}

}
