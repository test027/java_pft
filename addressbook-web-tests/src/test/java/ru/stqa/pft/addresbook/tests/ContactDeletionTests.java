package ru.stqa.pft.addresbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {
      if (! app.getContactHelper().isContactPresent()){
        app.getContactHelper().createContact(new ContactData("Test", "User", "+10000000", "test@user.com"));
      }
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteSelectedContacts();
 //     app.getContactHelper().closeAlert();
      //     returnToHomePage();
    }

}
