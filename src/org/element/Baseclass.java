package org.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public	static WebDriver a;
	public	static WebDriver b;
	

	public static void fill(WebElement element,String text) {
		element.sendKeys(text);
		
	}
	
	public static void Browser(String site) {
		if (site.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 a = new ChromeDriver();
		
			
			
		}
		else if (site.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 a = new FirefoxDriver();
		}
		
		
		
	}
	
	
	public static void url(WebDriver a,String link) {
		
			a.get(link);
			a.manage().window().maximize();
		
	}
	
	
	public static void moveelement(WebElement WebElement) {
		
		Actions i = new Actions(a);
		i.moveToElement(WebElement).perform();
	     
}
	
public static void rightclick(WebElement element) {
		
		Actions i = new Actions(a);
		i.contextClick(element).perform();
	     
}
public static void doubleclick(WebElement element) {
	
	Actions i = new Actions(a);
	i.doubleClick(element).perform();
     
}
	
public static  void amzlogin() {
		Detail s = new Detail();
		fill(s.getAmzemail(), "9941472587");
		s.getLogin().click();
		fill(s.getAmzpassword(), "dpk@7010");
		s.getSignin().click();
		

	}
	

	
	
}
