package Application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Employe;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Employe> list = new ArrayList<>();
		
		System.out.println("Quanto funcionarios registrados: ");
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Funcionario #"+ (i+1)+" :");
		System.out.println("Id: ");
		int id = in.nextInt();
		
		System.out.println("Name");
		String name = in.next();
		
		System.out.println("Salary: ");
		double sal = in.nextDouble();
		
		Employe emp = new Employe(id, name, sal);
		
		list.add(emp);
		}

		System.out.println("Melhore salario fornecendo Id: ");
		int idSal = in.nextInt();
		Integer pos = posicao(list, idSal);
		if(pos == null) {
			System.out.println("O id não existe");
	}else {
		System.out.println("Entre com porcentagem");
		double per = in.nextDouble();
		list.get(pos).incSalary(per);
	}
		System.out.println();
		System.out.println("Funcionarios: ");
		for(Employe emp : list) {
			System.out.println(emp);
		}
		}
	
	
	
	public static Integer posicao(List<Employe> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
				return null;
		}
			
		
	}
