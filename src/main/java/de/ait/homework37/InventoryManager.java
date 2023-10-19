package de.ait.homework37;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class InventoryManager {

    private static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public static boolean addMobilePhone(MobilePhone phone) {
        return mobilePhones.add(phone);
    }

    public static MobilePhone getMobilePhone(UUID id) {
        for (MobilePhone mobilePhone : mobilePhones) {
            if (mobilePhone.getId().equals(id)) {
                return mobilePhone;
            }
        }
        return null;
    }

    public static boolean updateMobilePhone(UUID id, MobilePhone newMobilePhone) {
        MobilePhone mobilePhone = getMobilePhone(id);
        if (mobilePhone != null) {
            mobilePhone.setId(newMobilePhone.getId());
            mobilePhone.setBrand(newMobilePhone.getBrand());
            mobilePhone.setModel(newMobilePhone.getModel());
            mobilePhone.setOperatingSystem(newMobilePhone.getOperatingSystem());
            mobilePhone.setPrice(newMobilePhone.getPrice());
        }
        return true; // Return true to indicate a successful update.
    }

    public static boolean deleteMobilePhone(UUID id) {
        MobilePhone phone = getMobilePhone(id);
        if (phone != null) {
            mobilePhones.remove(phone);
            return true;
        }
        return false;
    }

    public static List<MobilePhone> getAllMobilePhones() {
        return mobilePhones;
    }
}