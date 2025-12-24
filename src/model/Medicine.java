/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Medicine {

    // Attributes
    private int medicineId;
    private String medicineName;
    private String manufacturer;
    private double price;
    private int quantity;
    private String expiryDate;

    // Constructor
    public Medicine(int medicineId, String medicineName, String manufacturer,
            double price, int quantity, String expiryDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    // Getters
    public int getMedicineId() {
        return medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Setters
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Utility Methods
    public void addStock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public boolean reduceStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            this.quantity -= amount;
            return true;
        }
        return false;
    }

    public double calculateStockValue() {
        return price * quantity;
    }

}
