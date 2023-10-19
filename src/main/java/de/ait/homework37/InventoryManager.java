package de.ait.homework37;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class MobilePhoneStore {
    private ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public boolean addMobilePhone(MobilePhone phone) {
        return mobilePhones.add(phone);
    }

    public MobilePhone getMobilePhone(int id) {
        for (MobilePhone mobilePhone : mobilePhones) {
            if (mobilePhone.getId().equals(id)) {
                return mobilePhone;
            }
        }
        return null;
    }

    public boolean updateMobilePhone(int id, MobilePhone newMobilePhone) {
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

    public boolean deleteMobilePhone(int id) {
        MobilePhone phone = getMobilePhone(id);
        if (phone != null) {
            mobilePhones.remove(phone);
            return true;
        }
        return false;
    }

    public List<MobilePhone> getAllMobilePhones() {
        return mobilePhones;
    }
}