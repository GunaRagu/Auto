package Guna.Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sort {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\GG\\chromedriver-win64\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.saucedemo.com/v1/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click();
		 driver.findElement(By.className("bm-burger-button")).click();
		  
	  List <WebElement> menu = driver.findElements(By.className("product_sort_container"));
		  
		  Iterator<WebElement> i = menu.iterator();	  
		while(i.hasNext())
		{
			
			String p = i.next().getText();
			System.out.println(p);
		}

		driver.close();
		}

	}

