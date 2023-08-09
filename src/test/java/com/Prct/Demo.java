package com.Prct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.orangedatamining.com");
		
		driver.findElement(By.xpath("//a[text()='Screenshots']")).click();
		
		driver.findElement(By.className("screenshot-image")).click();
		WebElement icon=driver.findElement(By.className("lg-next lg-icon"));
		Actions act=new Actions(driver);
		act.moveToElement(icon).click().perform();
	}

}
