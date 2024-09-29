/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.program;

/**
 *
 * @author rifqi
 */
import inventaris.ManajemenInventaris;
import inventaris.Barang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManajemenInventaris manager = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan data item langsung ke dalam program (hardcoded data)
        Barang item1 = new Barang("Buku", 50, 30000.0);
        Barang item2 = new Barang("Seragam", 200, 90000.0);
        Barang item3 = new Barang("Kertas A4", 150, 60000.0);

        // Menambahkan item ke dalam inventory secara langsung
        manager.addItem(item1);
        manager.addItem(item2);
        manager.addItem(item3);

        // Menampilkan semua item setelah ditambahkan
        System.out.println("Inventaris setelah penambahan otomatis:");
        manager.displayAllItems();

        boolean running = true;

        while (running) {
            System.out.println("===== Sistem Inventaris Gudang =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Tampilkan Total Barang");
            System.out.println("5. Perbarui Barang");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah nextInt()

            if (choice == 1) {
                // Tambah Barang
                System.out.print("Nama Barang: ");
                String name = scanner.nextLine();
                System.out.print("Jumlah: ");
                int quantity = scanner.nextInt();
                System.out.print("Harga: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Konsumsi newline

                Barang newItem = new Barang(name, quantity, price); // Membuat objek Item baru
                manager.addItem(newItem); // Menambahkan item ke dalam inventory
            } else if (choice == 2) {
                // Hapus Barang
                System.out.print("Nama Barang yang akan dihapus: ");
                String removeName = scanner.nextLine();
                manager.removeItem(removeName);
            } else if (choice == 3) {
                // Tampilkan Semua Barang
                manager.displayAllItems();
            } else if (choice == 4) {
                // Tampilkan Total Barang
                System.out.println("Total barang di inventaris: " + ManajemenInventaris.getTotalItems());
            } else if (choice == 5) {
                // Perbarui Barang
                System.out.print("Nama Barang yang akan diperbarui: ");
                String updateName = scanner.nextLine();
                System.out.print("Jumlah baru: ");
                int newQuantity = scanner.nextInt();
                System.out.print("Harga baru: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Konsumsi newline

                manager.updateItem(updateName, newQuantity, newPrice);
            } else if (choice == 6) {
                // Keluar
                running = false;
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }

        scanner.close();
    }
}
