package de.ait.homework37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

class InventoryManagerTest {
    private MobilePhone samsungGalaxyS23Ultra;

    @BeforeEach
    void setUp() {
        samsungGalaxyS23Ultra = new MobilePhone("Samsung", "S23 Ultra", "Android", 1399.99);
    }

    @Test
    void addMobilePhone() {
        Assertions.assertTrue(InventoryManager.addMobilePhone(samsungGalaxyS23Ultra));
        Assertions.assertEquals(1, InventoryManager.getAllMobilePhones().size());
    }

    @Test
    void getMobilePhoneSuccess() {
        InventoryManager.addMobilePhone(samsungGalaxyS23Ultra);
        UUID idSearchMobilePhone = samsungGalaxyS23Ultra.getId();
        Assertions.assertNotNull(InventoryManager.getMobilePhone(idSearchMobilePhone));
        Assertions.assertEquals(samsungGalaxyS23Ultra, InventoryManager.getMobilePhone(idSearchMobilePhone));
    }

    @Test
    void getMobilePhoneFail() {
        UUID fakeUuid = UUID.randomUUID();
        Assertions.assertNull(InventoryManager.getMobilePhone(fakeUuid));
    }

    @Test
    void updateMobilePhone() {
        InventoryManager.addMobilePhone(samsungGalaxyS23Ultra);

        samsungGalaxyS23Ultra.setPrice(1000);

        UUID id = samsungGalaxyS23Ultra.getId();

        Assertions.assertTrue(InventoryManager.updateMobilePhone(id, samsungGalaxyS23Ultra));
        MobilePhone result = InventoryManager.getMobilePhone(id);
        Assertions.assertEquals(1000, result.getPrice());
    }

    @Test
    void updateMobilePhoneFail() {
        UUID fakeUuid = UUID.randomUUID();

        Assertions.assertFalse(InventoryManager.updateMobilePhone(fakeUuid, samsungGalaxyS23Ultra));
    }

    @Test
    void deleteMobilePhone() {
        InventoryManager.addMobilePhone(samsungGalaxyS23Ultra);
        UUID idToDelete = samsungGalaxyS23Ultra.getId();

        boolean result = InventoryManager.deleteMobilePhone(idToDelete);

        Assertions.assertTrue(result);

        MobilePhone deletedPhone = InventoryManager.getMobilePhone(idToDelete);

        Assertions.assertNull(deletedPhone);
    }

    @Test
    void getAllMobilePhones() {
        InventoryManager.addMobilePhone(samsungGalaxyS23Ultra);
        UUID idToDelete = samsungGalaxyS23Ultra.getId();
        InventoryManager.deleteMobilePhone(idToDelete);

        List<MobilePhone> allPhones = InventoryManager.getAllMobilePhones();

        Assertions.assertTrue(allPhones.isEmpty());
    }
}