package ru.stqa.pft.addresbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTestes extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}
