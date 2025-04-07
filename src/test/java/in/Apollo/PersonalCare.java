package in.Apollo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.Apollo.base.Utility;
import in.Apollo.locators.Locators;

public class PersonalCare extends Utility {
	
	Utility utils = new Utility();
	Locators loc = new Locators();
	
	@Then("User mouse over to Personal care")
	public void user_mouse_over_to_Personal_care() {
		utils.mouseOverToElement(loc.getPersonalCare());
   
	}

	@Then("User clicks on Beauty")
	public void user_clicks_on_Beauty() {
		utils.mouseOverToElement(loc.getBeauty());
	    utils.actionClick(loc.getBeauty());

	}

	@When("Validate the user able to see the personal care related menu")
	public void validate_the_user_able_to_see_the_personal_care_related_menu() {
		 if(utils.returnText(loc.getTitle1()).equals("Beauty")){
			 System.out.println("User select the correct product");
		 }
		 else {
			 System.out.println("Try to select relevent items");
		 }    
	}

	@Then("User clicks on Add button in beauty")
	public void user_clicks_on_Add_button_in_beauty() {
	    utils.actionClick(loc.getProduct());    

	}

	@Then("User clicks on View Cart in beauty")
	public void user_clicks_on_View_Cart_in_beauty() {
	    utils.actionClick(loc.getCart());    

	}

	


}
