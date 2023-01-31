package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//Declaration
	@FindBy(xpath = "//a[contains(text(),'ECommerce')]") private WebElement pageHeader;
	@FindBy(id = "course") private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/descendant::a[text()='Selenium Training']") private WebElement seleniumTrainingLink;
	@FindBy(name="addresstype") private WebElement catogoryDropdown;
	@FindBy(xpath ="//a[text()='Contact Us']") private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void mouseHoverToCourseTab(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}

	public  void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(catogoryDropdown, index);
	}
	
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	public void clickContactUs() {
		contactUsLink.click();
	}
}
