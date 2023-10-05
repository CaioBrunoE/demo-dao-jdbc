package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {
		
	SellerDAO sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller SellerInsert =====");
		Seller  newSeller = new Seller(null , "Greg", "Greg@greg.com.br", new Date() , 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller SellerUpdate =====");
		seller = sellerDao.findById(1);
		seller.setName("Marta Wayne");
		sellerDao.update(seller);
		System.out.println("update completed");
	}

}
