package in.Apollo.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Apollo.base.Utility;

public class Locators extends Utility {
	public Locators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='MegaMenu_mmList__VtxyI']/li[2]/a")
	private WebElement babyCare;
	
	@FindBy(xpath = "//span[text()='Baby Lotions']")
	private WebElement babyLotion;
	
	@FindBy(xpath = "//div[@class='PaginatedCategoryListing_cpHeader__pp_t2']/h1")
	private WebElement title;
	
	@FindBy(xpath = "//p[contains(text(),'To')]")
	private WebElement totalItems;
	
	@FindBy(xpath = "//div[text()='Brands']")
	private WebElement brand;
	
	@FindBy(xpath = "//h2[text()=\"Johnson's Baby Lotion, 100 ml\"]/ancestor::div[@class='ProductCard_productCardGrid__NHfRH   ']/div/div/button")
	private WebElement addButton;
	
	@FindBy(xpath = "//span[text()='View Cart']")
	private WebElement viewCart;
	
	@FindBy(xpath = "//ul[@class='MegaMenu_mmList__VtxyI']/li/a[text()='Personal Care']")
	private WebElement personalCare;
	
	@FindBy(xpath = "//span[text() = 'Beauty']")
	private WebElement beauty;
	
	@FindBy(xpath = "//div[@class='PaginatedCategoryListing_cpHeader__pp_t2']/h1")
	private WebElement title1;
	
	@FindBy(xpath = "//h2[text()='Himalaya Kajal, 2.6 gm']/ancestor::div[@class='ProductCard_productCardGrid__NHfRH   ']/div/div/button")
	private WebElement product;
	
	@FindBy (xpath = "//span[text()='View Cart']")
	private WebElement cart;

	public WebElement getBabyCare() {
		return babyCare;
	}

	public WebElement getBabyLotion() {
		return babyLotion;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getTotalItems() {
		return totalItems;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getViewCart() {
		return viewCart;
	}

	public WebElement getPersonalCare() {
		return personalCare;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getTitle1() {
		return title1;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getCart() {
		return cart;
	}


}
