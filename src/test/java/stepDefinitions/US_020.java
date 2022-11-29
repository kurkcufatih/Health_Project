package stepDefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MehmetPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US_020 {
    MehmetPage mehmetPage =new MehmetPage();
    Select select;
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    @And("Logins as Admin")
    public void loginsAsAdmin() {
        Driver.waitAndClick(mehmetPage.accountMenu);
        Driver.waitAndClick(mehmetPage.signInButton);
        Driver.waitAndSendText(mehmetPage.usernameBox, ConfigReader.getProperty("MedValidUsernameAdmin"));
        Driver.waitAndSendText(mehmetPage.passwordBox, ConfigReader.getProperty("MedValidPasswordAdmin"));
        Driver.waitAndClick(mehmetPage.signinButton);

    }

    @Then("Clicks view button for a registered person")
    public void clicksViewButtonForARegisteredPerson() throws InterruptedException {
        Driver.waitAndClick(mehmetPage.userViewButton);
        Thread.sleep(3000);
    }
    @And("Asserts the visibility of info page")
    public void assertsTheVisibilityOfInfoPage() throws IOException {
        getScreenshot("UserInfo");
    }
    @Then("Closes driver")
    public void thenNavigatesBack() {

        Driver.closeDriver();

    }

    @Then("Clicks edit  button for a registered person")
    public void clicksEditButtonForARegisteredPerson() {
        Driver.waitAndClick(mehmetPage.userEditButton);

    }
    @Then("Clicks activate checkbox to activate the person")
    public void clicksActivateCheckboxToActivateThePerson() {
        Driver.waitAndClick(mehmetPage.activatedCheckBox);
    }
    @And("Gives the person admin role from the profiles")
    public void givesThePersonAdminRoleFromTheProfiles() {
        WebElement dropdownEl= mehmetPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_ADMIN");

    }
    @Then("Saves the changes")
    public void savesTheChanges() {
        Driver.waitAndClick(mehmetPage.saveUserChangesButton);

    }

    @And("Gives the person user role from the profiles")
    public void givesThePersonUserRoleFromTheProfiles() {
        WebElement dropdownEl= mehmetPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_USER");
    }

    @And("Gives the person patient role from the profiles")
    public void givesThePersonPatientRoleFromTheProfiles() {
        WebElement dropdownEl= mehmetPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_PATIENT");
    }

    @And("Gives the person staff role from the profiles")
    public void givesThePersonStaffRoleFromTheProfiles() {
        WebElement dropdownEl= mehmetPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_STAFF");
    }

    @And("Gives the person physician role from the profiles")
    public void givesThePersonPhysicianRoleFromTheProfiles() {
        WebElement dropdownEl= mehmetPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_PHYSICIAN");
    }

    @Then("Clicks delete button for a registered person")
    public void s_user_clicks_delete_button_for_a_registered_person() {
        Driver.waitAndClick(mehmetPage.deleteUserButton);
    }
    @Then("Confirms the delete operation")
    public void s_user_confirms_the_delete_operation() {
    Driver.waitAndClick(mehmetPage.deleteUserConfirmationButton);
    }
    @Then("Asserts that he cannot delete the user")
    public void s_user_asserts_that_he_can_delete_the_user() {
        String expectedData="Internal server error.";
        Assert.assertTrue(expectedData.contains("error"));

    }




}
