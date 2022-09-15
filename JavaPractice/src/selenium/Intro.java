package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


public class Intro {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Personal Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@class='select_CTXT']")).click();
		driver.findElement(By.cssSelector("[class='mapbg'] [value ='BLR']")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));
		System.out.println(ele);
		int a= ele.size();
		for(int h = 0; h<a;h++)
		{
			String name =ele.get(h).getText();
			System.out.println("For Loop");
			if(name.equalsIgnoreCase("India"))
			{
				System.out.println("IF Loop");
				ele.get(h).click();
			}
		}
		
		for (WebElement i : ele) {
			if (i.getText().equalsIgnoreCase("India")) {
				System.out.println("IF Loop");
				i.click();
			}
		} 
		File fil = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fil, new File("C:\\Users\\gowsi\\screenshot.png"));
		driver.close(); 
		
		
		

	}
}
