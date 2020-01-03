package co.adddrop;

import java.util.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hack {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PURUSHOTTAM\\Desktop\\AddDrophack\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://vtopreg.vit.ac.in/adddrop");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#page-wrapper > div > section > div > div > div > div.panel-body > div > form > button")).click();
		
		TimeUnit.SECONDS.sleep(3);

		
		driver.findElement(By.id("registerNo")).sendKeys("17BCL0287");
		driver.findElement(By.id("password")).sendKeys("dixit.s1999");
		
		TimeUnit.SECONDS.sleep(12);

  
		driver.findElement(By.cssSelector("#checkRegistration > div > div.login-reset-btn > button.btn-success.w3-btn.w3-btn-green.w3-round-large")).click();
		
		TimeUnit.SECONDS.sleep(2);
		  
		driver.findElement(By.cssSelector("input[value='UC']")).click();
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("#regForm > div > div.bottom-header > button")).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		driver.findElement(By.cssSelector("#searchValue")).sendKeys("FRE1001");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.cssSelector("#findBtn")).click();
				
		
		while(true) {
			
			TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[@id=\"registerbtn\"]")).click();
		TimeUnit.SECONDS.sleep(3);		
		
		System.out.print("Size is: ");
		System.out.println(driver.findElements(By.cssSelector("#classnbr2[value='GEN/VL2019205001991']")).size());
		
		
		
		if(driver.findElements(By.cssSelector("#classnbr2[value='GEN/VL2019205003636']")).size() > 0 ) {
			
			
			WebElement theory = driver.findElement(By.cssSelector("#classnbr1[value='GEN/VL2019205003636']"));  //theory
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", theory);
			Thread.sleep(500); 
			theory.click();
			TimeUnit.SECONDS.sleep(2);		

		
//			if(driver.findElements(By.cssSelector("#classnbr2[value='GEN/VL2019205001991']")).size() > 0) {		
//		    WebElement lab = driver.findElement(By.cssSelector("#classnbr2[value='GEN/VL2019205001991']"));  //lab
//		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lab);
//			Thread.sleep(500); 
//			lab.click();
		    
		    
		    WebElement regular = driver.findElement(By.xpath("//*[@id=\"CourseOption\"]"));  //regular
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", regular);
			Thread.sleep(500); 
			regular.click();
			
			TimeUnit.SECONDS.sleep(1);
			
			//Submit
			WebElement submit = driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/table/thead/tr[18]/td/div/button[1]"));  //submit
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
			Thread.sleep(500); 
			submit.click();
			
//			}
		
		}
		else
		{
			WebElement back = driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/table/thead/tr[18]/td/div/button[2]"));  //back
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", back);
			Thread.sleep(500); 
			back.click();
		}
		}
	}
}
