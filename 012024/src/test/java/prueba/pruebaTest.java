package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pruebaTest {
  @Test // lo que esta abajo es un caso de prueba 
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
