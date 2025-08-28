package test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.EssLoginTestNG;

public class RunEssTestNg {
  @Test
  public void f() throws IOException {
	  FileReader fr= new FileReader("C:\\Users\\gokulakrishnan.v\\Documents\\Changepond\\Maven_Demo1\\MavenProject\\utility\\config.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  WebDriver Driver = new ChromeDriver();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.get(p.getProperty("link"));
	  EssLoginTestNG objEss = new EssLoginTestNG(Driver);
	  objEss.username(p.getProperty("user"));
	  objEss.password(p.getProperty("pass"));
	  objEss.click();
	  
  }
}
