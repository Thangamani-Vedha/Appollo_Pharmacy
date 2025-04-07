package in.Apollo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.Apollo.base.Utility;
import in.Apollo.locators.Locators;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BabyLotion1 extends Utility  {
	
	Utility utils = new Utility();
	Locators loc = new Locators();
	
	@Given("Launch the Apollo pharmacy Application {string}")
	public void launch_the_apollo_pharmacy_application(String string) {
		//applicationLaunch(string);
	    }
	

	@When("Validate user is on the home page")
	public void validate_user_is_on_the_home_page() {
		String Title1 = "Online Medical Store";
		if(utils.title().contains(Title1)) {
			System.out.println("User landed in Apollo webpage");
		}
		else {
			System.out.println("User not landed in Apollo webpage");
			
		}
		}

	@Then("User mouse over to Baby care")
	public void user_mouse_over_to_baby_care() {
		//WebElement baby_care = driver.findElement(By.xpath("//ul[@class='MegaMenu_mmList__VtxyI']/li[2]/a"));
		utils.mouseOverToElement(loc.getBabyCare());

	}

	@Then("User clicks on Baby lotions")
	public void user_clicks_on_baby_lotions() {
		WebElement baby_lotion = driver.findElement(By.xpath("//span[text()='Baby Lotions']"));
	    utils.actionClick(loc.getBabyLotion());
	    

	}

	@When("Validate the user able to see the baby care related menu")
	public void validate_the_user_able_to_see_the_baby_care_related_menu() {
		WebElement title = driver.findElement(By.xpath("//div[@class='PaginatedCategoryListing_cpHeader__pp_t2']/h1"));
		 if(utils.returnText(loc.getTitle()).equals("Baby Lotions")){
			 System.out.println("User select the correct product");
		 }
		 else {
			 System.out.println("Try to select relevent items");
		 }
	}
	@Then("User print the total item on web page")
	public void user_print_the_total_item_on_web_page() {
		WebElement title = driver.findElement(By.xpath("//p[contains(text(),'To')]"));	
		 System.out.println(utils.returnText(loc.getTotalItems()));		 
	
	}
	
	@Then("User clicks on Brand")
	public void user_clicks_on_brand() {
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
	    utils.actionClick(loc.getBrand());  
	
	}
	
	@Then("User clicks on sorted brand {string}")
	public void user_clicks_on_sorted_brand(String string) {
		WebElement checkbox= driver.findElement(By.xpath("//label[text()='"+string+"']"));
	    if(!checkbox.isSelected()) {
	    	utils.actionClick(checkbox);
	    }  
	}
	
	@Then("User clicks on Add button")
	public void user_clicks_on_add_button() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(lotion));
		 WebElement lotion = driver.findElement(By.xpath("//h2[text()=\"Johnson's Baby Lotion, 100 ml\"]/ancestor::div[@class='ProductCard_productCardGrid__NHfRH   ']/div/div/button"));
		    utils.actionClick(loc.getAddButton());    
	}

	@Then("User clicks on View Cart")
	public void user_clicks_on_view_cart() {
		WebElement cart = driver.findElement(By.xpath("//span[text()='View Cart']"));
	    utils.actionClick(loc.getViewCart());    

	}

	


}
