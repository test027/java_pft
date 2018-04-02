package ru.stqa.pft.addresbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbook.model.ContactData;

public class ContactModificationTests extends TestBase {

@Test
  public void testContactModification(){
  app.getNavigationHelper().gotoHomePage();
  if (! app.getContactHelper().isContactPresent()){
    app.getContactHelper().createContact(new ContactData("Test", "User", "+10000000", "test@user.com"));
  }
  app.getContactHelper().initContactModification();
  app.getContactHelper().fillContactForm(new ContactData("Test", "User", "+10000000", "test@user.com"));
  app.getContactHelper().submitContactModification();
  app.getNavigationHelper().gotoHomePage();
}


}
