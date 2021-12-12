package us.buyget.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.Test;
import us.buyget.pages.MainPage;

import us.buyget.pages.PageBase;
import us.buyget.utilities.BrowserUtils;
import us.buyget.utilities.ConfigurationReader;
import us.buyget.utilities.Driver;

public class mainPageTopTabs extends PageBase {


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("qa_environment"));
    }
    @When("I click on the Homemade tab")
    public void i_click_on_the_homemade_tab() {
        homemade.click();


    }
    @Then("I should be able to navigate to Homemade page")
    public void i_should_be_able_to_navigate_to_homemade_page() {
        String expectedTitle = "Homemade – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }





    @When("I click on the Dairy tab")
    public void i_click_on_the_dairy_tab() {
       dairy.click();
    }
    @Then("I should be able to navigate to Dairy page")
    public void i_should_be_able_to_navigate_to_dairy_page() {
        String expectedTitle = "Dairy Products – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @When("I click on the Pantry tab")
    public void i_click_on_the_pantry_tab() {
       pantry.click();
    }
    @Then("I should be able to navigate to Pantry page")
    public void i_should_be_able_to_navigate_to_pantry_page() {
        String expectedTitle = "Pantry – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }





    @When("I click on the Canned Food tab")
    public void i_click_on_the_canned_food_tab() {
       cannedFood.click();
    }
    @Then("I should be able to navigate to canned-food page")
    public void i_should_be_able_to_navigate_to_canned_food_page() {
        String expectedTitle = "Canned Food – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }



    @When("I click on the Confectionary tab")
    public void i_click_on_the_confectionary_tab() {
       confectionary.click();
    }
    @Then("I should be able to navigate to Chocolate, Candy & Snacks page")
    public void i_should_be_able_to_navigate_to_confectionary_page() {
        String expectedTitle = "Chocolate, Candy & Snacks – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }



    @When("I click on the Coffee & Tea tab")
    public void i_click_on_the_coffee_tea_tab() {
      coffeeTea.click();
    }
    @Then("I should be able to navigate to coffee-tea page")
    public void i_should_be_able_to_navigate_to_coffee_tea_page() {
        String expectedTitle = "Coffee & Tea – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @When("I click on the Dried Fruit & Nuts tab")
    public void i_click_on_the_dried_fruit_nuts_tab() {
        dryFruitsNuts.click();
    }
    @Then("I should be able to navigate to dried-fruit-nuts page")
    public void i_should_be_able_to_navigate_to_dried_fruit_nuts_page() {
        String expectedTitle = "Dried Fruits & Nuts – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @When("I click on the Beverages  tab")
    public void i_click_on_the_beverages_tab() {
        beverages.click();
    }
    @Then("I should be able to navigate to beverages page")
    public void i_should_be_able_to_navigate_to_beverages_page() {
        String expectedTitle = "Beverages – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }



    @When("I click on the Breads & Pastries tab")
    public void i_click_on_the_breads_pastries_tab() {
       breadsPastries.click();
    }
    @Then("I should be able to navigate to breads-pastries page")
    public void i_should_be_able_to_navigate_to_breads_pastries_page() {
        String expectedTitle = "Breads & Pastries – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @When("I click on the Brands tab")
    public void i_click_on_the_brands_tab() {
       brands.click();
    }
    @Then("I should be able to navigate to brands page")
    public void i_should_be_able_to_navigate_to_brands_page() {
        String expectedTitle = "Brands – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @When("I click on the Frozen tab")
    public void i_click_on_the_frozen_tab() {
    frozen.click();
    }
    @Then("I should be able to navigate to frozen page")
    public void i_should_be_able_to_navigate_to_frozen_page() {
        String expectedTitle = "Frozen – Halalcart";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }



    @When("I click on the Enjoying Halalcart tab")
    public void i_click_on_the_enjoying_halalcart_tab() {
       enjoyHalalCart.click();
    }
    @Then("I should be able to navigate to invite  page")
    public void i_should_be_able_to_navigate_to_invite_page() {
        String expectedTitle = "Enjoying Halalcart?";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }
}
