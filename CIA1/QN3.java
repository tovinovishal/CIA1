package com.example.demo.CIA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QN3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(2000);
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		txtBoxl.sendKeys("8760158450");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		Thread.sleep(2000);
		txtBox2.sendKeys("Zarah1018");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ordersInPackage-container\"]/div/div/a[1]")).click();
	}
}

