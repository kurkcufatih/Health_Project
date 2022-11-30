package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Ignore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_017_TestItemCreationByAdminPositiveTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

public class MedunnaStepDefinition_US017 {
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    US_017_TestItemCreationByAdminPositiveTestPage testCreation = new US_017_TestItemCreationByAdminPositiveTestPage();

    @Then("Admin clicks the Test Item button")
    public void admin_clicks_the_test_item_button() {

        testCreation.testItemButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Admin clicks on Create a new test item button")
    public void admin_clicks_on_create_a_new_test_item_button() {

        testCreation.createNewTestItem.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Admin enters a name")
    public void admin_enters_a_name() {
        testCreation.name.clear();
        actions.click(testCreation.name).sendKeys("Vitamins").perform();
        ReusableMethods.waitFor(2);

    }

    @Then("Admin can write Default Min. Value")
    public void admin_can_write_default_min_value() {

        Random random = new Random();
        int min = random.nextInt(1000);
        int max = random.nextInt(1000);
        while (min > max) {
            min = max - min;
        }
        testCreation.defaultMinValue.clear();
        actions.click(testCreation.defaultMinValue).sendKeys(random.toString()).perform();
        ReusableMethods.waitFor(2);

    }

    @Then("Admin can write Default Max. Value")
    public void admin_can_write_default_max_value() {

        Random random = new Random();
        int min = random.nextInt(1000);
        int max = random.nextInt(1000);
        while (min > max) {
            min = max - min;
        }
        testCreation.defaultMaxValue.clear();
        actions.click(testCreation.defaultMaxValue).sendKeys(random.toString()).sendKeys(Keys.ENTER).perform();
        ReusableMethods.waitFor(2);
    }

    @Then("Admin clicks the view button of any test item which is already created before, and can see test item.")
    public void admin_clicks_the_view_button_of_any_test_item_which_is_already_created_before_and_can_see_test_item() {
        actions.click(testCreation.viewButton);
        ReusableMethods.waitFor(2);

    }

    @Then("Admin clicks Back button.")
    public void admin_clicks_back_button() {

        actions.click(testCreation.backButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Admin clicks Edit button of any test item which is already created before.")
    public void admin_clicks_edit_button_of_any_test_item_which_is_already_created_before() {
        ReusableMethods.jsExecutorClick(testCreation.editButton);


    }
    @Given("Admin clicks edit button of the first test item for edit")
    public void admin_clicks_edit_button_of_the_first_test_item_for_edit() {
        ReusableMethods.jsExecutorClick(testCreation.editButton);

    }

    @Then("Description part can be filled")
    public void description_part_can_be_filled() {

        ReusableMethods.jsExecutorClick(testCreation.description);
        testCreation.description.clear();
        testCreation.description.sendKeys(faker.demographic().maritalStatus());
        ReusableMethods.waitFor(2);
    }

    @Then("Price must be entered")
    public void price_must_be_entered() {
        testCreation.testPrice.clear();
        actions.click(testCreation.testPrice).sendKeys("100").perform();
        ReusableMethods.waitFor(2);
    }

    @And("Admin saves the new item")
    public void adminSavesTheNewItem() throws IOException {
        ReusableMethods.jsExecutorScrool(testCreation.date);
        ReusableMethods.jsExecutorClick(testCreation.saveButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("internal service error occurs when saving a new test item");
        //actions.click(testCreation.saveButton).perform();
    }

    @Given("admin clicks back button")
    public void adminClicksBackButton() {
        ReusableMethods.jsExecutorClick(testCreation.backbutton);
    }

    @Then("admin clicks delete button")
    public void adminClicksDeleteButton() {
        ReusableMethods.jsExecutorClick(testCreation.deletebutton);
    }

    @And("admin confirm delete")
    public void adminConfirmDelete() {
        ReusableMethods.jsExecutorClick(testCreation.confirmdelete);
    }

    @And("get screen shot")
    public void getScreenShot() throws IOException {
        ReusableMethods.getScreenshot("Internal Service Error when deleting a test item");
    }

    @And("Price must be filled")
    public void priceMustBeFilled() {
        ReusableMethods.jsExecutorClick(testCreation.testPrice);
        testCreation.testPrice.clear();
        testCreation.testPrice.sendKeys("100");
    }

    @And("Admin clicks the savebutton")
    public void adminClicksTheSavebutton() {
        ReusableMethods.jsExecutorClick(testCreation.savebutton);
    }
}