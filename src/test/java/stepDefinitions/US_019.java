package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MehmetPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class US_019 {
    MehmetPage locator=new MehmetPage();
    Actions action=new Actions(Driver.getDriver());
    static String staffNewID;


    @Given("Admin goes to Medunna url")
    public void adminGoesToMedunnaUrl()  {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Click Account Menu sign and click Signin button")
    public void clickAccountMenuSignAndClickSigninButton() {
        Driver.waitAndClick(locator.accountMenu, 1);
        Driver.wait(1);
        locator.signInButton.click();
        Driver.wait(1);
    }

    @And("Click User Name textbox and enter admin user name {string}")
    public void clickUserNameTextboxAndEnterAdminUserName(String adminUsername) {
        locator.signInUsername.sendKeys(adminUsername);
    }

    @And("Click Password textbox and enter admin password {string}")
    public void clickPasswordTextboxAndEnterAdminPassword(String adminPassword) {
        locator.signInPassword.sendKeys(adminPassword);
    }

    @And("Click Sign In button")
    public void clickSignInButton() {
        Driver.wait(1);
        locator.signInSubmit.click();
    }
    @Given("Staff goes to Medunna url")
    public void staffGoesToMedunnaUrl()  {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Click Account Menu sign and click Register button")
    public void clickAccountMenuSignAndClickRegisterButton() {
        Driver.waitAndClick(locator.accountMenu,2);
        Driver.wait(1);
        Driver.waitAndClick(locator.accountRegisterButton);
        Driver.wait(1);
    }

    @And("Fill in all informations for a new user {string},{string},{string},{string},{string},{string},{string}")
    public void fillInAllInformationsForANewUser(String ssn, String firstname, String lastname, String username, String email, String newpassword, String confirmpassword) {
        Driver.wait(1);
        //Driver.clickWithJS(locator.registrationSsn);
        locator.registrationSsn.sendKeys(ssn);
        Driver.wait(1);
        Driver.clickWithJS(locator.registrationFirstname);
        locator.registrationFirstname.sendKeys(firstname);
        //Driver.wait(1);
        locator.registrationLastname.sendKeys(lastname);
        Driver.wait(1);
        locator.registrationUsername.sendKeys(username);
        Driver.wait(1);
        locator.registrationEmail.sendKeys(email);
        Driver.wait(1);
        locator.registrationNewPassword.sendKeys(newpassword);
        Driver.wait(1);
        locator.registrationConfirmPassword.sendKeys(confirmpassword);
        Driver.wait(1);
    }

    @And("Click  Register button and verify created")
    public void clickRegisterButtonAndVerifyCreated() {
        Driver.wait(1);
        //action.moveToElement(locator.registrationRegisterButton).perform();
        Driver.clickWithJS(locator.registrationRegisterButton);
        //Driver.waitAndClick(locator.registrationRegisterButton,2);
        // Driver.wait(1);
        // Driver.waitForVisibility(locator.savedToastContainer,2);
        // Assert.assertTrue(locator.savedToastContainer.getText().contains("Saved"));
        Driver.wait(1);
    }


    @And("Click Account Menu dropbox sign and click Sign In Text after sign out")
    public void clickAccountMenuDropboxSignAndClickSignInTextAfterSignOut() {
            Driver.waitForClickablility(locator.accountMenuAfterSignout,2);
            locator.accountMenuAfterSignout.click();
            locator.signInButton.click();
    }
    @And("Click Administration and User Management button and activate new user")
    public void clickAdministrationAndUserManagementButtonAndActivateNewUser() {
        Driver.wait(1);
        Driver.waitAndClick(locator.administrationButton,2);
        Driver.wait(1);
        locator.userManagementButton.click();
        Driver.wait(1);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
        action.moveToElement(locator.deactivatedActivatedButton);
        Driver.wait(2);
        Driver.waitAndClick(locator.deactivatedActivatedButton,2);
            Driver.wait(1);

        Driver.closeDriver();
    }

    // TC01902
    @And("Admin Clicks Create  A New Staff  button and search your SSN number {string}")
    public void adminClicksCreateANewStaffButtonAndSearchYourSSNNumber(String staffssn) {
        Driver.wait(1);
        locator.itemsTitlesMenuButton.click();
        Driver.wait(1);
        locator.itemsTitlesStaff.click();
        Driver.wait(1);
        locator.createANewStaffButton.click();
        Driver.wait(1);
        locator.useSearchSsnCheckbox.click();
        locator.staffSsnInput.sendKeys(staffssn);
        Driver.wait(1);
        locator.ssnSearchUserButton.click();
        Driver.wait(1);
    }

    @And("Admin Selects Birth Date and Enter Phone number {string}, {string}")
    public void adminSelectsBirthDateAndEnterPhoneNumber(String birthdate, String staffphone) {
            locator.newBirthDateInput.sendKeys(birthdate);
            Driver.wait(1);
            locator.newPhoneInput.sendKeys(staffphone);
            Driver.wait(1);
    }

    @And("Admin Selects Gender and Blood Group")
    public void adminSelectsGenderAndBloodGroup() {
        Select selectGender = new Select(locator.newGenderSelect);
        selectGender.selectByVisibleText("FEMALE");
        Driver.wait(1);
        Select selectBlood = new Select(locator.newBloodSelect);
        selectBlood.selectByVisibleText("B+");
        Driver.wait(1);
    }

    @Then("Admin Enters Address and Description {string},{string}")
    public void adminEntersAddressAndDescription(String staffaddress, String staffdescription) {
        locator.newAddressInput.sendKeys(staffaddress);
        Driver.wait(1);
        locator.descriptionInput.sendKeys(staffdescription);
        Driver.wait(1);
    }

    @And("Admin Selects User, Country and State City")
    public void adminSelectsUserCountryAndStateCity() {
        Driver.wait(1);
        Select selectCountry = new Select(locator.newCountrySelect);
        selectCountry.selectByVisibleText("USA");
        Driver.wait(1);
        Select selectState = new Select(locator.newStateSelect);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
        locator.newSaveButton.click();
    }

    @And("Admin Clicks Save button.")
    public void adminClicksSaveButton() {
        Driver.waitAndClick(locator.newSaveButton,2);
        Driver.wait(1);
    }

    @And("Admin Verifies created successfully message with new ID")
    public void adminVerifiesCreatedSuccessfullyMessageWithNewID() {
        Assert.assertTrue(locator.createdContainer.getText().contains("created"));
        List<String> toastcontainer= Arrays.asList(locator.createdContainer.getText().split("\\s"));
        System.out.println("staffNewID = " + toastcontainer);
        staffNewID=toastcontainer.get(7);
        System.out.println("lastItemID = " + staffNewID);
    }


    @And("Admin Clicks Created Date from List Row")
    public void adminClicksCreatedDateFromListRow() {
            Driver.waitAndClick(locator.itemsTitlesMenuButton,3);
            Driver.wait(1);
            locator.itemsTitlesStaff.click();
            Driver.wait(1);
            Driver.waitAndClick(locator.staffCeratedDate,2);
            Driver.wait(1);
    }

    @Then("Admin Clicks first row and last new user and verify data")
    public void adminClicksFirstRowAndLastNewUserAndVerifyData() {
        Driver.wait(1);
        locator.firstPatientID.click();
        //System.out.println("First id "+ locator.firststaffIDCheck.getText());
        Driver.wait(1);
        //Assert.assertTrue(locator.firststaffIDCheck.isDisplayed());
        System.out.println("Staff New id " +staffNewID);
        System.out.println("Staff id "+locator.staffPageIDCheck.getText());
        Assert.assertEquals(staffNewID,locator.staffPageIDCheck.getText());
        //Assert.assertEquals(staffNewID,locator.firststaffIDCheck.getText());
    }

    // TC01903 User (Admin) can select a user from the existing users (registered people)
    @And("Admin  clicks on Administration button text")
    public void adminClicksOnAdministrationButtonText() {
        Driver.wait(1);
        Driver.waitAndClick(locator.administrationButton,4);
    }

    @Then("Admin Clicks on User Management button text from dropdown box")
    public void adminClicksOnUserManagementButtonTextFromDropdownBox() {
        Driver.wait(1);
        Driver.waitAndClick(locator.userManagementButton,2);
        Driver.wait(1);
    }

    @Given("Admin Select any user.")
    public void admin_select_any_user() {
        Driver.wait(1);
        Driver.waitAndClick(locator.staffCeratedDate,3);
        Driver.wait(3);
        locator.firststaffIDCheck.click();
        Driver.wait(1);
        System.out.println("staffnewid "+staffNewID);
    }

    @Then("Admin Verifies selected users all information is visible.")
    public void admin_verifies_selected_users_all_information_is_visible() {
//        System.out.println("locator.staffPageIDCheck.getText() = " + locator.staffPageIDCheck.getText());
//        Assert.assertEquals(staffNewID,locator.staffPageIDCheck.getText());
        Assert.assertTrue(locator.idCansee.isDisplayed());
        //Assert.assertTrue(login );
        Assert.assertTrue(locator.firstnameCanSee.isDisplayed());
        Assert.assertTrue(locator.lastnameCanSee.isDisplayed());
        //Assert.assertTrue(locator.cansee);
    }

    // TC01904 - User can edit their info
    @Given("Click Items Titles button and Staff button from dropdown box")
    public void click_items_titles_button_and_staff_button_from_dropdown_box() {
        Driver.wait(1);
        Driver.waitAndClick(locator.itemsTitlesMenuButton,2);
        Driver.waitAndClick(locator.itemsTitlesStaff,2);
        Driver.wait(1);
    }

    @Given("Find my new staff and click to Edit button")
    public void find_my_new_staff_and_click_to_edit_button() {
        Driver.wait(2);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
        //locator.firststaffIDCheck.click();
        action.moveToElement(locator.staffEditButton);
        Driver.wait(1);
        Driver.waitAndClick(locator.staffEditButton,2);
        Driver.wait(1);
    }

    @Given("Change First name, Last name, Phone and Description {string},{string},{string},{string}")
    public void change_first_name_last_name_phone_and_description (String firstname, String lastname, String phone, String description) {
        Driver.wait(1);
        locator.firstNameInputBox.clear();
        Driver.wait(1);
        locator.firstNameInputBox.sendKeys(firstname);
        Driver.wait(1);
        locator.lastNameInputBox.clear();
        Driver.wait(1);
        locator.lastNameInputBox.sendKeys(lastname);
        Driver.wait(1);
        locator.phoneInputBox.clear();
        Driver.wait(1);
        locator.phoneInputBox.sendKeys(phone);
        Driver.wait(1);
        locator.descriptionInput.clear();
        Driver.wait(1);
        locator.descriptionInput.sendKeys(description);
        Driver.wait(1);
    }

//    @Then("mb Verify activated is selected.")
//    public void mb_verify_activated_is_selected() {
//
//        if(locator.staffEditActivatedCehckbox.getAttribute("value")!="true"){
//            locator.staffEditActivatedCehckbox.click();
//        }
//        Assert.assertEquals("true",locator.staffEditActivatedCehckbox.getAttribute("value"));
//
//    }

    @Then("Click Save button")
    public void click_save_button() {
        Driver.wait(1);
        Driver.clickWithJS(locator.staffEditSaveButton);
        Driver.wait(1);
    }

    @Then("mb Verify that succesfully message is A user is updated identifier-changed item")
    public void mb_verify_that_succesfully_message_is_a_user_is_updated_identifier_changed_item() {
        System.out.println("Updated Toast = "+locator.updatedContainer.getText());
        Driver.wait(1);
        Assert.assertTrue(locator.updatedContainer.getText().contains("updated"));
        Driver.wait(1);
    }


    // TC01905 - User can delete their info

    @Given("Find my new Staff and click Delete button from Staff Page")
    public void mb_find_my_new_staff_and_click_delete_button_from_staff_page() {
        Driver.wait(1);
        locator.staffCeratedDate.click();
        Driver.wait(1);
        action.moveToElement(locator.staffDeleteButton);
        Driver.wait(1);
        locator.staffDeleteButton.click();
        Driver.wait(1);
        locator.deleteButtonFromAlert.click();
        Driver.wait(1);
        String deletedToast=locator.deletedContainer.getText();
        System.out.println("locator.deletedToastContainer.getText() = "+deletedToast);
        Assert.assertTrue(deletedToast.contains("deleted"));

        List<String> deletedList= Arrays.asList(locator.deletedContainer.getText().split("\\s"));
        System.out.println("deletedList = " + deletedList);
        System.out.println("idkeep " + staffNewID+"  deleted staff id  " +deletedList.get(6));
        Assert.assertEquals(staffNewID,deletedList.get(6));
        Driver.wait(1);

    }

    @Given("Click Administration and User Management button text from dropdown box")
    public void click_administration_and_user_management_button_text_from_dropdown_box() {
        Driver.waitAndClick(locator.administrationButton,2);
        Driver.waitAndClick(locator.userManagementButton,2);
    }

    @Then("Verify user see deleted successfully message A user is deleted identifier - deleted item")
    public void verify_user_see_deleted_successfully_message_a_user_is_deleted_identifier_deleted_item() {
        System.out.println("Administration user deleted = "+locator.deletedContainer.getText());
        Assert.assertTrue(locator.deletedContainer.getText().contains("deleted"));
        Driver.wait(1);
    }

    @Given("Find my new Staff and click Delete button from Users Page")
    public void find_my_new_staff_and_click_delete_button_from_users_page() {
        Driver.wait(1);
        action.moveToElement(locator.administrationCreatedDateColumn);
        Driver.waitAndClick(locator.administrationCreatedDateColumn,1);
        Driver.waitAndClick(locator.administrationUserDeleteButton,2);
        Driver.wait(1);
    }

}
