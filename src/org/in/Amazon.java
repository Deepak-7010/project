package org.in;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.element.Baseclass;
import org.element.Detail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

public class Amazon extends Baseclass {
	
	
	@BeforeClass
	public void browse() {
	  Browser("chrome");
      
	}
	
	@Test(priority=0,groups="pay")
	private void addloaction() throws InterruptedException {
		Detail d = new Detail();
		WebElement all = a.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		doubleclick(all);
		a.findElement(By.xpath("(//a[@class='hmenu-item'])[25]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("(//div[@class='a-box-inner'])[4]")).click();
		amzlogin();
		d.getAddaddress().click();
		
		a.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).click();
		fill(d.getFullname(),"Deepak R");
		fill(d.getMobilenumber(),"7010834676");
		fill(d.getPincode(),"600100");
		fill(d.getFlatno(), "4\1");
		fill(d.getArea(),"Immanuvel street");
		fill(d.getLandmark(), "church opposite");
		a.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
		
		WebElement type = a.findElement(By.xpath("//span[@class='a-button a-button-dropdown address-ui-widgets-desktop-form-field-full-width']"));
		 type.click();
		 a.findElement(By.id("dropdown1_1")).click();
		 Thread.sleep(3000);
		a.findElement(By.xpath("(//input[@class='a-button-input'])[3]")).click();
		
	
	}
		
	
	
	@Parameters({"shop"})
	@Test(priority=1,groups= "addcart")
	private void addcart(@Optional("Creatine")String x) throws InterruptedException {
		
		Detail d = new Detail();
		PageFactory.initElements(a, Detail.class);
	    fill(d.getSearch(),x);
	    d.getSearchbutton().click();
	    a.findElement(By.xpath("(//img[@class='s-image'])[6]")).click();
	    Set<String> windowHandles = a.getWindowHandles();
		System.out.println(windowHandles);
		List<String> l = new ArrayList<>();
		l.addAll(windowHandles);
		a.switchTo().window(l.get(1));
		Thread.sleep(2000);
		d.getAddcart().click();
		
		
		
	}
	@Parameters({"search"})
	@Test(priority=2,groups="cart2")
	private void Buy(@Optional("BCCA")String y) throws InterruptedException {
		Detail d = new Detail();
		PageFactory.initElements(a, Detail.class);
		fill(d.getSearch(),y);
		d.getSearchbutton().click();
		d.getBcaa().click();
		String parent = a.getWindowHandle();
		System.out.println(parent);
		Set<String> windowHandle = a.getWindowHandles();
		System.out.println(windowHandle);
		for (String window : windowHandle) {
			if (!parent.equals(window)) {
				a.switchTo().window(window);
				
			}
			
		}
		a.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		d.getFinalcart().click();
		d.getProceedbuy().click();
	
		
	}
	
	

	
			
		
	

		
		
	
	
	
	
	
	@BeforeMethod
	private void link() {
		url(a, "https://www.amazon.in/");
		
	}
	

}
