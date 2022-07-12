package heranca_sobreposicao.exercise.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_sobreposicao.exercise.entities.Employee;
import heranca_sobreposicao.exercise.entities.OutsourceEmployee;

public class Main 
{

    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        Integer n = in.nextInt();
    
        for(int i=1; i<=n; i++) 
        {
            Employee employee;
            System.out.printf("\nEmployee %d data:", i);

            System.out.print("\nOutsourced (y/n)");
            char outSource = in.next().charAt(0);
            System.out.print("Name:");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Hour:");
            Integer hour = in.nextInt();
            System.out.print("Value per hour:");
            Double valuePerHour = in.nextDouble();

            if(outSource == 'y') 
            {
                System.out.print("Additional charge:");
                Double additionalCharge = in.nextDouble();
                employee = new OutsourceEmployee(name, hour, valuePerHour, additionalCharge);
                employeeList.add(employee);
            }
            else if(outSource == 'n') 
            {
                employee = new Employee(name, hour, valuePerHour);
                employeeList.add(employee);
            }
            else
            {
                employee = new Employee();
            }
        }

        System.out.println("\nPayments:");

        for (Employee emp : employeeList) 
        {
            System.out.println(emp.toString());   
        }
        in.close();
    }
}
