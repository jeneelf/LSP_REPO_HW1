package org.howard.edu.lsp.assignment2;
//File for extracytion and modification 
import java.io.*;
import java.util.*;

public class ETLPipeline {
    public static void main(String[] args){
        String inputFile = "data/products.csv"; //input file provided
        String outputFile = "data/transformed_products.csv"; //output fill created

        //Extract from products.csv, transform, and load to transformedProducts
        List<String[]> products = extract(inputFile);
        List<String[]> transformedProducts = transform(products);
        load(outputFile, transformedProducts);
    }
    //read and store new product info in new csv file
    public static List<String[]> extract(String filePath){
        List<String[]> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            reader.readLine(); //ignore header 
            while ((line = reader.readLine())!= null){
                products.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return products;
    }

public static List<String[]> transform(List<String[]> products) {
    List<String[]> transformedProducts = new ArrayList<>();

    // Add header
    transformedProducts.add(new String[] {"ProductID", "Name", "Price", "Category", "PriceRange"});

    for (String[] product : products) {
        String id = product[0];
        String name = product[1].toUpperCase();
        double price = Double.parseDouble(product[2]);
        String category = product[3];
        if (product.length != 4) {
            continue;
        }
        //10% discount on electronics
        if (category.equalsIgnoreCase("Electronics")) {
            price = Math.round(price * 0.9 * 100) / 100.0; // 10% discount
            if (price > 500) category = "Premium Electronics";
        }

        // Add product to the list
        String priceRange = getPriceRange(price);
        transformedProducts.add(new String[] {id, name, String.format("%.2f", price), category, priceRange});
        }
        return  transformedProducts;
 
}

// Load to CSV

public static void load(String filePath, List<String[]> products) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        for (String[] product : products) {
            writer.write(String.join(",", product));
            writer.newLine();
        }
        System.out.println("File saved to: " + filePath);
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }
}

public static String getPriceRange(double price) {
    if (price <= 10) return "Low";
    if (price <= 100) return "Medium";
    if (price <= 500) return "High";
    return "Premium";
}
}