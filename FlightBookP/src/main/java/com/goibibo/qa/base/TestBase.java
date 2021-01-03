package com.goibibo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.goibibo.qa.util.TestUtil;

public class TestBase {
	//Basic properties Initialization Webdrivers,WebObjects,ActionsMethod
	
	public static WebDriver driver;
	static Properties prop;
	
	public TestBase() {		//constrcuctor
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\HP\\git\\TestAirwayFramewrk\\FlightBookP\\src\\main\\java\\com\\goibibo\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	public static String getCellValue(String xl, String Sheet, int r, int c)

    {

        try

              {
                           FileInputStream fis = new FileInputStream(xl);

                           Workbook wb = WorkbookFactory.create(fis);

                           Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

                            return cell.getStringCellValue();

                              }

                              catch (Exception e)

                              {

                                              return "";

                              }

              }

              public static int getRowCount (String xl, String Sheet)

              {

                  try

                       {

                           FileInputStream fis = new FileInputStream(xl);

                           Workbook wb = WorkbookFactory.create(fis);

                           return wb.getSheet(Sheet).getLastRowNum();

                              }

                              catch (Exception e)

                              {

                                return 0;

                              }

              }
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else {
			System.out.println("no browser value is given");
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
				
	}
	
	}
