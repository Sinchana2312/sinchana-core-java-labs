package com.deloitte.lab09.ex04;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
  
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

interface Factory {
    Product create(String name, double price);
}

public class Lab9Ex4 {
    public static void main(String[] args) {
       
        Factory product = Product::new;

       
        Product p1 = product.create("Laptop", 40000);
        Product p2 = product.create("Smartphone", 20000);

       
        System.out.println(p1);
        System.out.println(p2);
    }
}
