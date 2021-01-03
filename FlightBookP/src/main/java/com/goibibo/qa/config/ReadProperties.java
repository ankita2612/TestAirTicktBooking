package com.goibibo.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProperties {

//	public static void main(String[] args) throws IOException {
//		
//		WebDriver driver = null;
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\softs\\eclipse-workspace\\FlightBookP\\src\\main\\java\\com\\goibibo\\qa\\config\\config.properties");
//
//		prop.load(ip);
//		
//		System.out.println(prop.getProperty("browser"));  //Access those properties
//		String browserName = prop.getProperty("browser");
//		if(browserName.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver","C:/Users/softs/Automation/chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(browserName.equals("FF")) {
//			driver = new FirefoxDriver();
//		}
//		else if(browserName.equals("Safari")) {
//			driver = new SafariDriver();
//	}else {
//		System.out.println("no browser value is given");
//		}
//		driver.get(prop.getProperty("url")); //Read URL.
//		
//	}
}
