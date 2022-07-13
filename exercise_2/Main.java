package heranca_sobreposicao.exercise.exercise_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args) throws ParseException 
    {
        SimpleDateFormat spdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the numbers of products:");
        Integer num_products = in.nextInt();

        for(int i=1; i<=num_products; i++)
        {
            System.out.printf("Product #%d data:", i);
            System.out.print("\nCommon, used or imported (c/u/i)? ");
            char type = in.next().charAt(0);

            if(type == 'c') 
            {
                System.out.print("Name:");
                in.nextLine();
                String name = in.nextLine();
                System.out.print("Price:");
                Double price = in.nextDouble();

                Product product = new Product(name, price);
                products.add(product);
            }
            else if(type == 'u') 
            {
                System.out.print("Name:");
                in.nextLine();
                String name = in.nextLine();
                System.out.print("Price:");
                Double price = in.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY):");
                String manufactureDate = in.next();

                Product product = new UsedProduct(name, price,spdf.parse(manufactureDate));
                products.add(product);
            }
            else if(type == 'i') 
            {
                System.out.print("Name:");
                in.nextLine();
                String name = in.nextLine();
                System.out.print("Price:");
                Double price = in.nextDouble();
                System.out.print("Customs fee:");
                Double customsFee = in.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }
        }

        System.out.println("\nPrice tags:");
        for (Product p : products) 
        {
            System.out.println(p.priceTag());
        }

        in.close();
    }
}
