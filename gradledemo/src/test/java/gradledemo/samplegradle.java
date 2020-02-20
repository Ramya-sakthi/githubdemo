package gradledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class samplegradle {
  @Test
  public void testCase() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLTuser-PC\\Downloads\\chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.get("https://www.linkedin.com/");
      driver.manage().window().maximize();
  }
}
