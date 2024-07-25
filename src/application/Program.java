package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
//		Connection conn = DB.getConnection();
//		DB.closeConnection();
		
		Department dp = new Department(1, "Financeiro");
		System.out.println(dp);
		
		Seller s = new Seller(1, "Maria", "maria@gmail.com", new Date(), 1789.00, dp);
		System.out.println(s);
		
		SellerDao sD = DaoFactory.createSellerDao();
		sD.insert(s);
	}

}
