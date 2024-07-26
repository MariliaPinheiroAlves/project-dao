package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {
	public static void main(String[] args) {
		DepartmentDao dp = DaoFactory.createDepartmentdao();
		
		Department newDepartment = new Department(null, "Movies");
		//dp.insert(newDepartment);
		//System.out.println("Successful! New Department: " + newDepartment.getName());
		
		//newDepartment.setName("Others");
		//dp.update(newDepartment);
		
		Department sales = dp.findByID(1);

		Department accounting = dp.findByID(2);
		
		Department customerService = dp.findByID(3);
		
		Department regionalManagement = dp.findByID(4);
		
		Department humanResources = dp.findByID(5);
		
		sales.setName("Sales");
		accounting.setName("Accounting");
		customerService.setName("Customer Service");		
		regionalManagement.setName("Regional Management");
		humanResources.setName("Human Resources");

		dp.update(accounting);
		dp.update(customerService);
		dp.update(regionalManagement);
		dp.update(humanResources);

		System.out.println("All departments");
		List<Department> list = dp.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
	}
}
