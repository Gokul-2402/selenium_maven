package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginOrangeHrm;


public class RunloginOrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		loginOrangeHrm Runobj = new loginOrangeHrm(Driver);
		
		Runobj.UName("Admin");
		Thread.sleep(2000);
		Runobj.pass("admin123");
		
		
		
		

	}

}
