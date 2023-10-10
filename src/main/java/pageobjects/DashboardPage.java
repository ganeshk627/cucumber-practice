package pageobjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    WebDriver ldriver;

    public DashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public boolean verifyDashboard() {
      try {
          WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
          wait.until(ExpectedConditions.urlContains("dashboard"));
          return true;
      } catch (TimeoutException timeoutException) {
          return false;
      }
    }
}
