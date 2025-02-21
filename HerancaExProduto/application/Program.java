package com.agibank.HerancaExProduto.application;
import com.agibank.HerancaExProduto.entities.ImportedProduct;
import com.agibank.HerancaExProduto.entities.UsedProduct;

import com.agibank.HerancaExProduto.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> prod = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantOfProducts = sc.nextInt();

        for (int i = 0; i < quantOfProducts; i++) {
            System.out.println("Product " + (i+1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(answer == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();

                prod.add(new ImportedProduct(name, price, customFee));
            }
            else if(answer == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manafacture = sc.next();
                Date date = sdf.parse(manafacture);

                prod.add(new UsedProduct(name, price, date));
            }
            else{
                prod.add(new Product(name, price));
            }

        }

        System.out.println("PRICE TAGS");
        for(Product products : prod){

            System.out.println(products.priceTag());

        }

    }
}
