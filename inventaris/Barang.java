/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */
public class Barang {
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Barang(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method untuk menampilkan informasi barang
    public void displayItemInfo() {
        System.out.println("Nama Barang: " + name);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Harga: " + price);
        System.out.println("----------------------");
    }
}

    
