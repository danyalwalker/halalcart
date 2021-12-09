package us.buyget.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import us.buyget.pages.MainPage;
import us.buyget.utilities.BrowserUtils;

public class MainPageHeaders {
    MainPage mainPage = new MainPage();

    @When("I click on the NEMA - Best Prices header")
    public void i_click_on_the_nema_best_prices_header() {
        mainPage.nemaDiscount2_1Header.click();
    }
    @Then("I should be able to navigate to NEMA - Best Prices page")
    public void i_should_be_able_to_navigate_to_nema_best_prices_page() {
        BrowserUtils.assertTitle("NEMA - Best Prices – Halalcart");
    }




    @When("I click on the Fresh & Frozen Halal Meat header")
    public void i_click_on_the_fresh_frozen_halal_meat_header() {
        mainPage.frozenHeader.click();
    }
    @Then("I should be able to navigate to Fresh & Frozen Halal Meat page")
    public void i_should_be_able_to_navigate_to_fresh_frozen_halal_meat_page() {
        BrowserUtils.assertTitle("Frozen – Halalcart");
    }




    @When("I click on the Best Selling Title")
    public void i_click_on_the_best_selling_title() {
        mainPage.bestSellingHeader.click();
    }
    @Then("I should be able to navigate to Best Selling page")
    public void i_should_be_able_to_navigate_to_best_selling_page() {
        BrowserUtils.assertTitle("Best Selling – Halalcart");
    }



    @When("I click on the Homemade header")
    public void i_click_on_the_homemade_header() {
        mainPage.homemadeHeader.click();
    }




    @When("I click on the Dairy Products header")
    public void i_click_on_the_dairy_products_header() {
        mainPage.dairyHeader.click();
    }
    @Then("I should be able to navigate to Dairy Products page")
    public void i_should_be_able_to_navigate_to_dairy_products_page() {
        BrowserUtils.assertTitle("Dairy Products – Halalcart");
    }




    @When("I click on the Deli Meat header")
    public void i_click_on_the_deli_meat_header() {
        mainPage.deliMeatHeader.click();
    }
    @Then("I should be able to navigate to Deli Meat page")
    public void i_should_be_able_to_navigate_to_deli_meat_page() {
        BrowserUtils.assertTitle("Deli Meat – Halalcart");
    }




    @When("I click on the Pantry header")
    public void i_click_on_the_pantry_header() {
        mainPage.pantryHeader.click();
    }
    @When("I click on the Beverages header")
    public void i_click_on_the_beverages_header() {
        mainPage.beveragesHeader.click();
    }




    @When("I click on the Chocolate, Candy & Snacks header")
    public void i_click_on_the_chocolate_candy_snacks_header() {
        mainPage.cccSnacksHeader.click();
    }




    @When("I click on the Coffee & Tea header")
    public void i_click_on_the_coffee_tea_header() {
        mainPage.coffeeTeaHeader.click();
    }




    @When("I click on the Dried Fruits & Nuts header")
    public void i_click_on_the_dried_fruits_nuts_header() {
        mainPage.fruitNutHeader.click();
    }




    @When("I click on the Breads & Pastries header")
    public void i_click_on_the_breads_pastries_header() {
        mainPage.breadPastriesHeader.click();
    }



    @When("I click on the Frozen header")
    public void i_click_on_the_frozen_header() {
        mainPage.frozenHeader.click();
    }


}
