/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenInventaris {
    private ArrayList<Barang> itemList; // Menggunakan ArrayList untuk menyimpan barang
    private static int totalItems = 0; // Static keyword untuk melacak total barang
    private String namaGudang;

    // Constructor
    public ManajemenInventaris() {
        this.itemList = new ArrayList<>();
        this.namaGudang = namaGudang;
    }

    // Menambah item baru ke dalam inventaris
    public void addItem(Barang item) {
        itemList.add(item);
        totalItems++; // Static field untuk melacak total item bertambah
        System.out.println("Item berhasil ditambahkan: " + item.getName());
    }

    public String getNamaGudang() {  // Getter untuk namaGudang
        return namaGudang;
    }

    public void setNamaGudang(String namaGudang) {  // Setter untuk namaGudang
        this.namaGudang = namaGudang;
    }
    
    // Menghapus item berdasarkan nama
    public void removeItem(String itemName) {
        Iterator<Barang> iterator = itemList.iterator(); // Gunakan iterator untuk menghindari ConcurrentModificationException
        boolean found = false;

        while (iterator.hasNext()) {
            Barang item = iterator.next();
            if (item.getName().equalsIgnoreCase(itemName)) {
                iterator.remove(); // Menghapus item menggunakan iterator
                totalItems--; // Kurangi total item
                found = true;
                System.out.println("Item berhasil dihapus: " + itemName);
                break;
            }
        }

        if (!found) {
            System.out.println("Item tidak ditemukan: " + itemName);
        }
    }

    // Menampilkan semua item dalam inventaris
    public void displayAllItems() {
        if (itemList.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("Daftar Barang di Inventaris:");
            for (Barang item : itemList) {
                item.displayItemInfo(); // Memanggil metode displayItemInfo dari kelas Item
            }
        }
    }

    // Mendapatkan total barang dalam inventaris
    public static int getTotalItems() {
        return totalItems;
    }
    
    // Fitur update barang berdasarkan nama
    public void updateItem(String itemName, int newQuantity, double newPrice) {
        boolean found = false;

        for (Barang item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);
                found = true;
                System.out.println("Item berhasil diperbarui: " + itemName);
                item.displayItemInfo(); // Menampilkan info barang setelah update
                break;
            }
        }

        if (!found) {
            System.out.println("Item tidak ditemukan: " + itemName);
        }
    }

}