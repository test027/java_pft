package ru.stqa.pft.addresbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addresbook.appmanager.ApplicationManager;

public class TestBase {


  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

  @BeforeMethod
  public void setUp() throws Exception { //тестовый ФВ выполняет в обьекте метод Сетап
    app.init();

  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
