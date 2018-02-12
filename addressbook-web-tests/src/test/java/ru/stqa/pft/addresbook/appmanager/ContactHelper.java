package ru.stqa.pft.addresbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addresbook.model.ContactData;

public class ContactHelper extends HelperBase{
  private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type("firstname", contactData.getFirstname());
    type("lastname", contactData.getLastname());
    type("home", contactData.getPhone());
    type("email", contactData.getEmail());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }
}
