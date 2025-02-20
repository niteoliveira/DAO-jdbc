package application;



import java.util.Date;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "book");
		
		Seller seller = new Seller(21, "Bob","kl",new Date(), 3000.0,obj);
		System.out.println(obj);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
