package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_018_PhysicianCreationByAdminPositiveTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MedunnaStepDefinition_US018 {

    US_018_PhysicianCreationByAdminPositiveTestPage physician = new US_018_PhysicianCreationByAdminPositiveTestPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("Admin can edit the name of a physician")
    public void admin_can_edit_the_name_of_a_physician() {

        physician.name.clear();
        physician.name.sendKeys(faker.name().name());
        ReusableMethods.waitFor(2);

    }

    @Then("Admin can edit the lastname of a physician")
    public void admin_can_edit_the_lastname_of_a_physician() {
        physician.lastName.clear();
        physician.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
    }

    @Then("Admin can edit the date of a physician")
    public void admin_can_edit_the_date_of_a_physician() {
        physician.birthday.click();
        actions.sendKeys("2002").sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB).sendKeys("28").perform();
        ReusableMethods.waitFor(1);
        /*
        LocalDateTime ldt = LocalDateTime.now();
        String formattedDateStr = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH)
                .format(ldt);
        physician.birthday.sendKeys(formattedDateStr);
        */
    }

    @Then("Admin can edit the phone number of a physician")
    public void admin_can_edit_the_phone_number_of_a_physician() {
        physician.phone.clear();
        physician.phone.sendKeys("566-566-566");
        ReusableMethods.waitFor(1);
        //physician.phone.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @Then("Admin can edit the address of a physician")
    public void admin_can_edit_the_address_of_a_physician() {
        physician.address.clear();
        physician.address.sendKeys(faker.address().fullAddress());
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Admin can choose gender of a physician")
    public void admin_can_choose_gender_of_a_physician() {
        Select select = new Select(physician.gender);
        List<WebElement> genderOpt = select.getOptions();
        for (WebElement each : genderOpt) {
            String gender = each.getText();
            physician.gender.sendKeys(gender);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();
        }
    }

    @Then("Admin can choose blood group of a physician")
    public void admin_can_choose_blood_group_of_a_physician() {
        Select select = new Select(physician.bloodGroup);
        List<WebElement> bloodOpt = select.getOptions();
        for (WebElement each : bloodOpt) {
            String blood = each.getText();
            physician.bloodGroup.sendKeys(blood);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();
        }
    }

    @Then("Admin can edit description")
    public void admin_can_edit_description() {
        physician.description.clear();
        physician.description.sendKeys(faker.toString());
        ReusableMethods.waitFor(1);
    }

    @Then("Admin can choose a user")
    public void admin_can_choose_a_user() {
        Select select = new Select(physician.physicianUser);
        List<WebElement> userOpt = select.getOptions();
        for (WebElement each : userOpt) {
            String user = each.getText();
            physician.physicianUser.sendKeys(user);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();
        }
    }


    @Then("Admin can choose a country")
    public void admin_can_choose_a_country() {
        Select select = new Select(physician.country);
        List<WebElement> countryOpt = select.getOptions();
        for (WebElement each : countryOpt) {
            String country = each.getText();
            physician.country.sendKeys(country);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();

        /*
        Select select = new Select(physician.country);
        Random random = new Random();
        select.selectByIndex(random.nextInt(190));
         */
        }
    }

    @Then("Admin can choose a state")
    public void admin_can_choose_a_state() {
        Select select = new Select(physician.state);
        List<WebElement> stateOpt = select.getOptions();
        for (WebElement each : stateOpt) {
            String state = each.getText();
            physician.state.sendKeys(state);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();
        }

    }

    @Then("Admin saves the new edit")
    public void admin_saves_the_new_edit() {
        ReusableMethods.jsExecutorClick(physician.saveButton);
        ReusableMethods.waitFor(1);
    }

    @Then("Admin clicks the physician button")
    public void adminClicksThePhysicianButton() {
        ReusableMethods.jsExecutorClick(physician.physician);
        ReusableMethods.waitFor(2);
    }

    @And("Admin clicks on Items&Titles button to click physician option")
    public void adminClicksOnItemsTitlesButtonToClickPhysicianOption() {
        physician.itemAndTitle.click();

    }

    @And("Admin clicks on Create a new physician button")
    public void adminClicksOnCreateANewPhysicianButton() {
        ReusableMethods.jsExecutorClick(physician.createNewPhysician);
        ReusableMethods.waitFor(1);
    }

    @And("Admin clicks on Use Search")
    public void adminClicksOnUseSearch() {
        ReusableMethods.jsExecutorClick(physician.useSearch);
        ReusableMethods.waitFor(1);
    }

    @And("Admin enters SNN number of any physician")
    public void adminEntersSNNNumberOfAnyPhysician() {
        physician.SSNnumber.clear();
        physician.SSNnumber.sendKeys("555-666-0557");
        ReusableMethods.waitFor(1);
    }

    @And("Admin clicks on Search User button")
    public void adminClicksOnSearchUserButton() {
        ReusableMethods.jsExecutorClick(physician.searchUserButton);
        ReusableMethods.waitFor(1);
    }

    @And("Admin clicks edit button to edit any of physician")
    public void adminClicksEditButtonToEditAnyOfPhysician() {
        ReusableMethods.jsExecutorClick(physician.editButton);
        ReusableMethods.waitFor(1);
    }

    @And("Admin can choose a speciality of a physician")
    public void adminCanChooseASpecialityOfAPhysician() {
        Select select = new Select(physician.speciality);
        List<WebElement> specialityOpt = select.getOptions();
        for (WebElement each : specialityOpt) {
            String speciality = each.getText();
            physician.speciality.sendKeys(speciality);
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.TAB).perform();
        }
    }

    @And("Admin can change a photo of a physician")
    public void adminCanChangeAPhotoOfAPhysician() {
    }

    @And("Admin can enter examination fee of a physician")
    public void adminCanEnterExaminationFeeOfAPhysician() {
        String fee = String.valueOf(faker.number().randomNumber());
        physician.examFee.sendKeys(fee);
        ReusableMethods.waitFor(1);
    }

    @And("Admin can choose any physician")
    public void adminCanChooseAnyPhysician() {
        Random random = new Random();
        Select select = new Select(physician.editButton);
        List<WebElement> physicianOpt = select.getOptions();
        for (WebElement each : physicianOpt) {
            String choosephysician = each.getText();
            choosephysician.indexOf(random.nextInt(physician.editButton.getSize().width));
            ReusableMethods.waitFor(1);
        }
    }

    @And("Admin can delete any physician")
    public void adminCanDeleteAnyPhysician() {
        ReusableMethods.jsExecutorClick(physician.deleteButton);
        ReusableMethods.waitFor(2);
    }

    @And("Admin enters the name of a physician")
    public void adminEntersTheNameOfAPhysician() {
        physician.name.clear();
        physician.name.sendKeys(faker.name().name());
        ReusableMethods.waitFor(1);

    }

    @And("Admin enters the lastname of a physician")
    public void adminEntersTheLastnameOfAPhysician() {
        physician.lastName.clear();
        physician.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
    }

    @And("Admin enters the phone number of a physician")
    public void adminEntersThePhoneNumberOfAPhysician() {
        physician.phone.clear();
        physician.phone.sendKeys("1234567899");
        ReusableMethods.waitFor(1);
    }

    @And("Admin enters the address of a physician")
    public void adminEntersTheAddressOfAPhysician() {
        physician.address.clear();
        physician.address.sendKeys(faker.address().fullAddress());

    }

    @And("Admin enters the date of a physician")
    public void adminEntersTheDateOfAPhysician() {
        physician.birthday.click();
        actions.sendKeys("2002").sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB).sendKeys("28").perform();
        ReusableMethods.waitFor(1);


    }

    @And("Admin can add a description")
    public void adminCanAddADescription() {
        physician.description.clear();
        physician.description.sendKeys(faker.internet().emailAddress());

    }

    @And("confirm deletion")
    public void confirmDeletion() throws IOException {
        physician.deleteConfirm.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Internal Server Error When Deleting A Physician");
    }
}