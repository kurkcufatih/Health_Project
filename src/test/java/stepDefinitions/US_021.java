package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MehmetPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US_021 {
    MehmetPage mehmetPage = new MehmetPage();
    WebElement dropdownEl = mehmetPage.profilesDropdownEl;
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
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


    @Then("Logins as Staff")
    public void loginsAsStaff() {
        Driver.waitAndClick(mehmetPage.userItemTop);
        Driver.waitAndClick(mehmetPage.signinEl);
        Driver.waitAndSendText(mehmetPage.usernameBox, "PersonelMhmt");
        Driver.waitAndSendText(mehmetPage.passwordBox, "22382238Aa1.");
        Driver.waitAndClick(mehmetPage.signinButton);
    }

    @And("Staff clicks my pages, search patient")
    public void staffClicksMyPagesSearchPatient() throws InterruptedException {
        Driver.waitAndClick(mehmetPage.myPagesIconStaff);
        Driver.waitAndClick(mehmetPage.searchPatientEl);
        Thread.sleep(3000);
    }

    @Then("Staff sends a patient ssn for the search box")
    public void staffSendsAPatientSsnForTheSearchBox() throws InterruptedException {
        mehmetPage.findPatientBySsnBox.sendKeys("222-22-2229");
        Thread.sleep(3000);
    }

    @Then("Staff clicks show appointments button")
    public void staffClicksShowAppointmentsButton() {
        Driver.waitAndClick(mehmetPage.showAppointmentsButton);
    }

    @And("Staff clicks edit button")
    public void staffClicksEditButton() {
        Driver.waitAndClick(mehmetPage.editAppointmentButton);
    }

    @Then("Staff asserts the visibility of appointment page")
    public void staffAssertsTheVisibilityOfAppointmentPage() {
        Assert.assertTrue(mehmetPage.createOrEditAppointmentTextForPatient.isDisplayed());
    }

    @Then("Staff selects unapproved as status and takes ss")
    public void staffSelectsUnapprovedAsStatusAndTakesSs() throws InterruptedException, IOException {
        WebElement dropdownEl = mehmetPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("UNAPPROVED");
        getScreenshot("UNAPPROVED");

    }

    @Then("Staff selects pending as status and takes ss")
    public void staffSelectsPendingAsStatusAndTakesSs() throws InterruptedException, IOException {
        WebElement dropdownEl = mehmetPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("PENDING");
        getScreenshot("PENDING");

    }

    @Then("Staff selects cancelled as status and takes ss")
    public void staffSelectsCancelledAsStatusAndTakesSs() throws InterruptedException, IOException {
        WebElement dropdownEl = mehmetPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("CANCELLED");
        getScreenshot("CANCELLED");

    }

    @Then("Staff clicks anamnesis box without writing anything")
    public void staffClicksAnamnesisBoxWithoutWritingAnything() {
        Driver.waitAndClick(mehmetPage.anamnesisTextArea);
    }

    @Then("Staff clicks treatment box without writing anything")
    public void staffClicksTreatmentBoxWithoutWritingAnything() {
        Driver.waitAndClick(mehmetPage.treatmentTextArea);
    }

    @Then("Staff clicks diagnosis box without writing anything")
    public void staffClicksDiagnosisBoxWithoutWritingAnything() {
        Driver.waitAndClick(mehmetPage.diagnosisTextArea);
    }

    @Then("Staff clicks save button")
    public void staffClicksSaveButton() {
        Driver.waitAndClick(mehmetPage.saveChangesForEdittingPatient);
    }

    @Then("Staff goes to physician dropdown and chooses  a doctor")
    public void staffGoesToPhysicianDropdownAndChoosesADoctor() throws InterruptedException {
        Driver.wait(10);
        jse.executeScript("arguments[0].scrollIntoView(true);", mehmetPage.physicianNamesDropdownEl);

        WebElement ddPhysician = mehmetPage.physicianNamesDropdownEl;
        Driver.waitAndClick(dropdownEl, 15);
        Select select = new Select(ddPhysician);
        select.selectByIndex(2);


        Driver.waitAndClick(mehmetPage.saveChangesForEdittingPatient);
        //Driver.wait(3);
    }

    @And("Staff asserts that changes have been saved")
    public void staffAssertsThatChangesHaveBeenSaved() {

        String toasterText = mehmetPage.appointmentUpdatedToastContainer.getText();
        System.out.println("alert warning= " + toasterText);
        String expectedData = "The Appointment is updated with identifier 49681";
        Assert.assertTrue(expectedData.contains("updated"));

    }


    @Then("Staff clicks show tests button")
    public void staff_clicks_show_tests_button() {
        Driver.waitAndClick(mehmetPage.showTestsButton);
    }

    @Then("Staff chooses a test and clicks on view results")
    public void s_user_chooses_a_test_and_clicks_on_view_results() {
        Driver.waitAndClick(mehmetPage.viewTestResultsButton);
    }

    @Then("Staff asserts the visibility of test results")
    public void s_user_asserts_the_visibility_of_test_results() {
        Assert.assertTrue(mehmetPage.testResultsTextEl.isDisplayed());
    }


}
