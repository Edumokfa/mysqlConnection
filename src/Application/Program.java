package Application;

import entities.Department;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program {

    public static void main(String[] args) {

        //SellerDao sellerDao = DaoFactory.createSellerDao();
//        System.out.println("--- Teste 1: Seller findById ---");
//        System.out.println();
//
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//        System.out.println();
//        System.out.println("--- Teste 2: Seller findByDepartment ---");
//        System.out.println();
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//        System.out.println();
//        System.out.println("--- Teste 3: Seller findAll ---");
//        System.out.println();
//        list = sellerDao.findAll();
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//        System.out.println();
//        System.out.println("--- Teste 4: Seller insert ---");
//        System.out.println();
//        Seller newSeller = newSeller = new Seller(9, "teste", "teste@gmail.com", new Date(10 / 06 / 2021), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserido! Novo id: " + newSeller.getId());
//
//        System.out.println();
//        System.out.println("--- Teste 5: Seller update ---");
//        System.out.println();
//        seller = sellerDao.findById(1);
//        seller.setName("Jorge teste");
//        sellerDao.update(seller);
//        System.out.println("Atualizado");
//
//        System.out.println();
//        System.out.println("--- Teste 6: Seller delete ---");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Deletado com sucesso");
//        sc.close();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("--- Teste 1: Department findById ---");
        System.out.println();

        Department department = departmentDao.findById(1);
        System.out.println(department);
        System.out.println();

        System.out.println();
        System.out.println("--- Teste 2: Department findAll ---");
        System.out.println();
        List<Department> listDep = departmentDao.findAll();
        for (Department obj : listDep) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println("--- Teste 3: Department update ---");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Atualizado com sucesso");

        System.out.println();
        System.out.println("--- Teste 4: Department insert ---");
        System.out.println();
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido! id: " + newDepartment.getId());

        System.out.println();
        System.out.println("--- Teste 5: Department delete ---");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deletado com sucesso");

        sc.close();

    }

}
