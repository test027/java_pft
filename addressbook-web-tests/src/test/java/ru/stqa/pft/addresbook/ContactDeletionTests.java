package ru.stqa.pft.addresbook;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {
      selectContact();
      deleteSelectedContacts();
 //     returnToHomePage();
    }

}
