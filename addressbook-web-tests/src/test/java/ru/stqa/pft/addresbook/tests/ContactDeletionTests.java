package ru.stqa.pft.addresbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteSelectedContacts();
 //     returnToHomePage();
    }

}
