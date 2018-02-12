package ru.stqa.pft.addresbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Testgroup1", "Testgroup2", "Testgroup3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
