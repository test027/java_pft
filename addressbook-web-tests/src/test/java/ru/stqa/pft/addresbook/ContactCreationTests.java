package ru.stqa.pft.addresbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    initContactCreation();
    fillContactForm(new ContactData("Test", "User", "+10000000", "test@user.com"));
    submitContactCreation();
    returnToHomePage();
  }

}
