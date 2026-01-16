/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Medicine;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;

public class MedicineControl {

    // LinkedList to store medicines
    private LinkedList<Medicine> medicineList;

    // Constructor
    public MedicineControl() {
        medicineList = new LinkedList<>();
        loadPredefinedObj();
    }

    private void loadPredefinedObj() {
        Medicine m1 = new Medicine(1, "Paracetamol", "IntPharma", 200, 30, "2025-12-11");
        Medicine m2 = new Medicine(2, "Neko", "Nepal private LTD", 250, 10, "2026-12-11");
        Medicine m3 = new Medicine(3, "Fraction", "IntPharma", 200, 30, "2025-12-11");
        Medicine m4 = new Medicine(4, "Decol", "IntPharma", 200, 30, "2025-12-11");
        Medicine m5 = new Medicine(5, "Codobar", "IntPharma", 200, 30, "2025-12-11");

        medicineList.add(m1);
        medicineList.add(m2);
        medicineList.add(m3);
        medicineList.add(m4);
        medicineList.add(m5);

    }

    // Add medicine to LinkedList
    public void addItem(Medicine medicine) {
        if (medicine != null) {
            medicineList.add(medicine);
        }
    }

    // Optional: return all medicines
    public LinkedList<Medicine> getAllMedicines() {
        return medicineList;
    }

    // Optional: find medicine by ID
    public Medicine findById(int id) {
        for (Medicine m : medicineList) {
            if (m.getMedicineId() == id) {
                return m;
            }
        }
        return null;
    }

    // Optional: delete medicine by ID
    public boolean removeById(int id) {
        Medicine m = findById(id);
        if (m != null) {
            return medicineList.remove(m);
        }
        return false;
    }
}
