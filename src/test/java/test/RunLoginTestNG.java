package test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.login_testNG;

public class RunLoginTestNG {
  @Test
  public void f() throws InterruptedException, IOException {
	
	  
		
		 FileReader fr = new FileReader("C:\\Users\\gokulakrishnan.v\\Documents\\Changepond\\Maven_Demo1\\MavenProject\\utility\\config.properties");
		  Properties p = new Properties();
		  p.load(fr);
		  WebDriver Driver = new ChromeDriver();
		  Driver.get(p.getProperty("link1"));
		
		login_testNG Runobj1 = new login_testNG(Driver);
		Thread.sleep(5000);
		
	    Runobj1.uname(p.getProperty("uname"));
		
		Runobj1.pwd(p.getProperty("pwd"));
		Thread.sleep(5000);
		Runobj1.Click();
		
		
  }
}
