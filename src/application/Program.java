package application;

import java.sql.Connection;

import db.DB;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
//		Connection conn = DB.getConnection();
//		DB.closeConnection();
		
		Department dp = new Department(1, "Financeiro");
		System.out.println(dp);

	}

}
