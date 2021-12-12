package us.buyget.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import us.buyget.pages.PageBase;
import us.buyget.utilities.BrowserUtils;

public class MainPageBottomTabs extends PageBase {

    @When("I click on search tab")
    public void i_click_on_search_tab() {
     search.click();
        BrowserUtils.waitForPageToLoad(1);
    }
    @Then("I should be able to navigate to search page")
    public void i_should_be_able_to_navigate_to_search_page() {

        BrowserUtils.assertTitle("Search – Halalcart");
    }



    @When("I click on contact tab")
    public void i_click_on_contact_tab() {
        contact.click();
        BrowserUtils.waitForPageToLoad(1);

    }
    @Then("I should be able to navigate to contact page")
    public void i_should_be_able_to_navigate_to_contact_page() {
        BrowserUtils.assertTitle("Contact – Halalcart");
    }




    @When("I click on terms of service tab")
    public void i_click_on_terms_of_service_tab() {
     termsOfService.click();
        BrowserUtils.waitForPageToLoad(1);
    }
    @Then("I should be able to navigate to terms of service page")
    public void i_should_be_able_to_navigate_to_terms_of_service_page() {
       BrowserUtils.assertTitle("Terms of service – Halalcart");
    }




    @When("I click on refund policy tab")
    public void i_click_on_refund_policy_tab() {
      refundPolicy.click();
        BrowserUtils.waitForPageToLoad(1);
    }
    @Then("I should be able to navigate to refund policy page")
    public void i_should_be_able_to_navigate_to_refund_policy_page() {
     BrowserUtils.assertTitle("Refund policy – Halalcart");
    }



    @When("I click on privacy policy tab")
    public void i_click_on_privacy_policy_tab() {
       privacyPolicy.click();
        BrowserUtils.waitForPageToLoad(1);
    }
    @Then("I should be able to navigate to privacy policy page")
    public void i_should_be_able_to_navigate_to_privacy_policy_page() {
        BrowserUtils.assertTitle("Privacy policy – Halalcart");
    }

}
