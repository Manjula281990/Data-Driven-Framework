package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sorting {
	
	public static void applySorting(WebDriver driver, String sort) {
		driver.findElement(By.linkText("Laptops")).click();
	}

}



