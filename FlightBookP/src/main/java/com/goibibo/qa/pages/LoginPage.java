package com.goibibo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goibibo.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	@FindBy (id="flying_from_N")
    private WebElement FLyingFromClick;
	@FindBy (id = "flying_from")
	private WebElement FlyngFrmVlu; 
	@FindBy (xpath = "//*[contains(text(),'BOM-Chhatrapati Shivaji International Airport')]")
	private WebElement FrmValue;
	@FindBy (id = "flying_to_N")
	private WebElement FlyingToClick;
	@FindBy (id = "flying_to")
	private WebElement FlyngToVlu; 
	@FindBy (xpath = "//*[contains(text(),'DEL-Indira Gandhi International Airport')]")
	private WebElement ToValue;
	@FindBy (id = "Fly_depdate_val")
	private WebElement DeprtrDD;
	@FindBy (xpath = "//*[@id='ui-datepicker-div']/div[2]//tr[4]/td[2]/a")
	private WebElement DateVlue; 
	@FindBy (id = "cabin_id")
	private WebElement TrvlrClck;
	@FindBy (id = "sub1plus")
	WebElement AdulctClk;
	@FindBy (id = "sub2plus")
	private WebElement ChldrnClk;	
    @FindBy (id="searchengine_btn")
    private WebElement SearchBtn;
    @FindBy (xpath = "/html/body/section[2]/div/div[1]/div/div[2]/div[1]/div[2]/button")
    private WebElement SelclClck;
    @FindBy (id = "Email")
    private WebElement EmailFld;
    @FindBy (id = "MobNo")
    private WebElement MobnmrFld;
    @FindBy (id = "divfirstname0")
    private WebElement FirstNameFld;
    @FindBy (id = "divlastname0")
    private WebElement LastNameFld;
    
    
    @FindBy (id = "Process1_btn")
    private WebElement ContnueBtn;

    //Initializing the Objects

    public LoginPage(WebDriver driver)

    {
                PageFactory.initElements(driver, this);

    }
    //Specifiying email and psswd
    public void SelectVlue (String FrmVlue,String ToVlue) throws InterruptedException

    {
    	
    	FLyingFromClick.click();
    	Thread.sleep(2000);
    	FlyngFrmVlu.sendKeys(FrmVlue);
                Thread.sleep(1000);    
                FrmValue.click();
                Thread.sleep(2000);
                FlyingToClick.click();
                Thread.sleep(1000);
                FlyngToVlu.sendKeys(ToVlue);
                Thread.sleep(2000);
                ToValue.click();
                Thread.sleep(2000);
                DeprtrDD.click();
                Thread.sleep(2000);
                DateVlue.click();
                Thread.sleep(1000);
                TrvlrClck.click();
                Thread.sleep(2000);
                AdulctClk.click();
                System.out.println("clicked Adult 1 Successfully");
                Thread.sleep(2000);
//                AdulctClk.click();
//                System.out.println("Click Adult 2 Successfully");
//                Thread.sleep(2000);
                ChldrnClk.click();
                System.out.println("Click Children 1 Successfully");
                Thread.sleep(2000);
                ChldrnClk.click();
                System.out.println("Click Children 2 Successfully");
    }

    //Clicking on Login button
    public void clickSearchBtn()
    {

    	SearchBtn.click();
    }
    
    public void WaitforPopupandselectFlight() throws InterruptedException
    {
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SG 951')]")));
    	System.out.println("Screen Loaded Successfully");
    	Thread.sleep(1000);
    	SelclClck.click();
    	
    }
    
    public void ContinueAfterentringDetails(String EmailID,String MpbileNumber,String FirstName, String LastName) throws InterruptedException {
    	WebDriverWait wait1 = new WebDriverWait(driver,30);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Process1_btn")));
    	System.out.println("Screen Loaded Successfully to Continue flight booking");
    	Thread.sleep(2000);
    	EmailFld.sendKeys(EmailID);
    	Thread.sleep(1000);
    	MobnmrFld.sendKeys(MpbileNumber);
    	Thread.sleep(2000);;
    	Select DrpDn = new Select (driver.findElement(By.id("_ViewModel[0]._AdultM[0].Gender.ID")));
    	DrpDn.selectByVisibleText("Miss");
    	Thread.sleep(2000);
    	FirstNameFld.sendKeys(FirstName);;
    	System.out.println("First Name Entered");
    	Thread.sleep(1000);
    	LastNameFld.sendKeys(LastName);
    	System.out.println("Last Name Entered");
    	Thread.sleep(1000);
    	ContnueBtn.click();
    }
    
    

}
