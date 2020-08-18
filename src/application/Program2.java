package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== TEST 1: Department Insert =====");

		Department newDepto = new Department(null, "Portateis");
		departmentDao.insert(newDepto);

		System.out.println("Inserido Novo Departamento! Id = " + newDepto.getId() + "\n");

		System.out.println("========TESTE 2 : Department FINDBY ID ========");

		Department depto = departmentDao.findById(6);

		System.out.println(depto);

		System.out.println("\n=== TEST 3: Department Update =====");

		depto = departmentDao.findById(6);
		depto.setName("Cozinha");
		departmentDao.update(depto);
		System.out.println("Update Realizado");

		System.out.println("\n=== TEST 4: Department Delete=====");
		System.out.println("Digite o ID a ser deletado : ");

		int id = sc.nextInt();

		departmentDao.deleteById(15);

		departmentDao.deleteById(id);

		System.out.println("Delete completo");
		sc.close();

		System.out.println("\n=== TEST 5: Department findAll =====");

		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
