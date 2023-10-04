package application;



import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		
		System.out.println("=== Teste 1 : Seller findById ===");
	    Seller seller = sellerDAO.findById(3);
			
		System.out.println(seller);
	}

}
