package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Cadastro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();

            while(Employee.idExiste(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            list.add(new Employee(id, nome, salario));

        }


        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {

            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            emp.aumentarSalario(porcentagem);
        }

        System.out.println("List of employees: ");
        for(Employee emp1 : list) {
            System.out.println(emp1);
        }


        sc.close();


    }
}

