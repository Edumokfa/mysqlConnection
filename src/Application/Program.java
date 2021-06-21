package Application;

import entities.Department;
import entities.Seller;
import java.sql.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "bob", "email@dobob.com", new Date(05 / 05 / 2001), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
        System.out.println(obj);

    }

}
