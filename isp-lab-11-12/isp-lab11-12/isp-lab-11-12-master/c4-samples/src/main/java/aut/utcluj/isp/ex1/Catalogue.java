/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aut.utcluj.isp.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ionic
 */
public class Catalogue {

    String name;
    ArrayList<Product> products = new ArrayList();
    int quantity;

    public Catalogue(String name, ArrayList<Product> products, int quantity) {
        this.name = name;
        this.products = products;
        this.quantity=quantity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
}
