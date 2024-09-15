package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * 
		 * SellerDao sellerDao = DaoFactory.createSellerDao();
		 * 
		 * System.out.println("=== TEST 1: seller findById ===="); Seller seller =
		 * sellerDao.findbyId(3); System.out.println(seller);
		 * 
		 * System.out.println("=== TEST 2: seller findByDepartment ===="); Department
		 * department = new Department(2, null); List<Seller> list =
		 * sellerDao.findByDepartment(department); for (Seller obj : list) {
		 * System.out.println(obj); }
		 * 
		 * System.out.println("=== TEST 3: seller findAll ===="); list =
		 * sellerDao.findAll(); for (Seller obj : list) { System.out.println(obj); }
		 * 
		 * System.out.println("=== TEST 4: seller insert ===="); Seller newSeller = new
		 * Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		 * sellerDao.insert(newSeller); System.out.println("Inserted! New id = " +
		 * newSeller.getId());
		 * 
		 * System.out.println("=== TEST 5: seller update ===="); seller =
		 * sellerDao.findbyId(1); seller.setName("Martha Waine");
		 * sellerDao.update(seller); System.out.println("Update completed");
		 * 
		 * System.out.println("=== TEST 6: seller delete ====");
		 * System.out.println("Enter id for delete test: "); int id = sc.nextInt();
		 * sellerDao.deleteById(id); System.out.println("Delete completed");
		 * 
		 */

		// Departamentos
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		 * System.out.println("=== TEST 1: department findById ===="); Department dp =
		 * departmentDao.findbyId(6); System.out.println(dp);
		 * 
		 * // Testando a inserção de um novo departamento
		 * System.out.println("=== Test 2: insert ==="); Department newDepartment = new
		 * Department(null, "Marketing"); departmentDao.insert(newDepartment);
		 * System.out.println("Inserido! Novo ID: " + newDepartment.getId());
		 * 
		 * List<Department> listDp = new ArrayList<>();
		 * System.out.println("=== TEST 3: department findAll ===="); listDp =
		 * departmentDao.findAll(); for (Department obj : listDp) {
		 * System.out.println(obj); }
		 * 
		 * System.out.println("=== TEST 4: department update ===="); Department dp =
		 * departmentDao.findbyId(4); dp.setName("News"); departmentDao.update(dp);
		 * System.out.println("Update completed");
		 * 
		 * * System.out.println("=== TEST 5: department delete ====");
		 * System.out.println("Enter id for delete test: "); int id = sc.nextInt();
		 * departmentDao.deleteById(id); System.out.println("Delete completed");
		 */

		sc.close();
	}
}
