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
