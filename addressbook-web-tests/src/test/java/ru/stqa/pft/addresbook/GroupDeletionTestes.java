package ru.stqa.pft.addresbook;

import org.testng.annotations.Test;

public class GroupDeletionTestes extends TestBase {

  @Test
  public void testGroupDeletion() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
