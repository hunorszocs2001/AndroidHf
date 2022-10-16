package com.example.homework32;

public class Product {

    String Code;
    String Name;
    Double Price;

    public Product(String Code, String Name, Double Price) {
        this.Code = Code;
        this.Name = Name;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "\n"+ "Product Code: " + Code + "\n" +
                " Product Name: " + Name + "\n" +
                "Product Price: " + Price +"\n" ;
    }
}
