package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbdullahPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class AbdullahStepDefinitions_UI {
    AbdullahPage medunnaPage = new AbdullahPage();

    @Given("Staff goes to Medunna url")
    public void staff_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Given("Staff navigates the sign in page")
    public void staff_navigates_the_sign_in_page() {
        medunnaPage.loginAndRegisterIcon.click();
        medunnaPage.signInButton.click();

    }

    @And("Staff signs in with valid credentials")
    public void staffSignsInWithValidCredentials() {
        medunnaPage.usernameInput.sendKeys(ConfigReader.getProperty("validUsernameStaff"));
        medunnaPage.passwordInput.sendKeys(ConfigReader.getProperty("validPasswordStaff"), Keys.ENTER);

    }

    @Given("Staff navigates My Pages")
    public void staff_navigates_my_pages() {
        medunnaPage.staffMyPagesBtn.click();

    }
    @Given("Staff clicks Search Patient")
    public void staff_clicks_search_patient() {
        medunnaPage.staffSearchPatientBtn.click();
    }
    @When("Staff enters a valid SSN id of a patient into Patient SSN input")
    public void staff_enters_a_valid_ssn_id_of_a_patient_into_input() {

        medunnaPage.staffMyPagePatientSSNsearch.sendKeys(ConfigReader.getProperty("validPatientSSN"));

    }
    @Then("Staff verifies the patient with relevant SSN is found")
    public void staff_verifies_the_patient_with_relevant_ssn_is_found() {
        String expectedPatientSSN = ConfigReader.getProperty("validPatientSSN");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualPatientSSN = medunnaPage.patientSSNfromTableByStaff.getText();

        System.out.println("actualPatientSSN = " + actualPatientSSN);
        assertEquals(expectedPatientSSN,actualPatientSSN);

    }

    @And("Staff clicks the Show Tests then clicks View Results")
    public void staffClicksTheShowTests() {

        medunnaPage.showTestsBtnOfPatientByStaff.click();
        medunnaPage.viewResultsBtnOfPatientByStaff.click();

    }

    @Then("Staff confirms that each test result provides a number")
    public void staffConfirmsThatEachTestResultProvidesANumber() {
        List<WebElement> testResults = Driver.getDriver().findElements(By.xpath("//td[3]"));

        boolean flag = true;

        for (WebElement w: testResults  ) {

            if(w.getText().isEmpty()){
                flag=false;
                break;
            }

        }

        assertTrue(flag);



    }

    @Then("user logs out")
    public void userLogsOut() {

        medunnaPage.loggedInProfileBtn.click();
        medunnaPage.signOutBtn.click();

    }


    @And("Staff clicks the Show Appointments")
    public void staffClicksTheShowAppointments() {
        medunnaPage.myMethod(ConfigReader.getProperty("validPatientSSN")).click();
    }



    //----------------------------------------------------------İLK DENEME KODLARI BELKİ İÇİNDE LAZIM OLAN OLUR SİLME-----------------------
    // WebElement loginIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login-item']")));

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(Driver.getDriver());
    Wait<WebDriver> waitFluent = new FluentWait<>(Driver.getDriver())
            .withTimeout( Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

    @Given("user is in medunna web page")
    public void userIsInMedunnaWebPage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("user clicks the registration page")
    public void userClicksTheRegistrationPage() {
        medunnaPage.loginAndRegisterIcon.click();
        medunnaPage.registerBtn.click();




    }

    @Then("user registers with valid credentials")
    public void user_entered_a_valid_ssn() {


        actions.sendKeys(medunnaPage.registerSSNInput,ConfigReader.getProperty("medunnaValidRegisterSSN"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterFirstName"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterLastName"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterUserName"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterEmail"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterPassword"),Keys.TAB).
                sendKeys(ConfigReader.getProperty("medunnaValidRegisterPassword"),Keys.ENTER)
                .perform();

        WebElement registrationSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Registration Saved']")));

        assertTrue(registrationSuccess.isDisplayed());

    }





    @Then("SSN includes a - after 3rd and 5th number")
    public void ssn_includes_a_after_3rd_and_5th_number() {



    }

    @Then("SSN should consist of {int} numbers")
    public void ssn_should_consist_of_numbers(Integer int1) {

    }

    @Then("user closes the page")
    public void user_closes_the_page() {

    }


    @And("Staff  verifies he can update each result in Test Results section")
    public void staffVerifiesHeCanUpdateEachResultInTestResultsSection() {
        medunnaPage.editBtnViewTestReults.click();

        String expectedTestId = "1a2b3c4d";
        medunnaPage.editIdSectionInTestResult.sendKeys(expectedTestId);

        assertEquals(expectedTestId,medunnaPage.editIdSectionInTestResult.getAttribute("value") );
    }



    @And("Staff clicks Payment Invoice Process")
    public void staffClicksPaymentInvoiceProcess() {
        medunnaPage.paymentInvoiceProcessBtn.click();
    }

    @And("Staff verifies there is Payment Invoice process button")
    public void staffVerifiesThereIsPaymentInvoiceProcessButton() {

        Integer expectedSize = 3;
        Integer actualSize =medunnaPage.verifyPaymentIfStatusCancelledOrCompleted.size();



        assertEquals(expectedSize,actualSize);

    }



    @And("Staff enters a SSN id of patient with invoice")
    public void staffEntersASSNIdOfPatientWithInvoice() {
        medunnaPage.staffMyPagePatientSSNsearch.sendKeys(ConfigReader.getProperty("PatientSSNstatusCompleted"));
    }

    @And("Staff verifies there is a button named Create Invoice")
    public void staffVerifiesThereIsAButtonNamedCreateInvoice() {
        String expectedBtnName = "Create Invoice";
        String actualBtnName = medunnaPage.showInvoiceBtn.getText();

        try {
            ReusableMethods.getScreenshot("Show_Invoice_Button");
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(expectedBtnName,actualBtnName);
    }

    @And("Staff clicks the Show Appointments of Invoiced patient")
    public void staffClicksTheShowAppointmentsOfInvoicedPatient() {
        medunnaPage.myMethod(ConfigReader.getProperty("PatientSSNstatusCompleted")).click();
    }

    @And("Staff clicksShow Invoice button")
    public void staffClicksShowInvoiceButton() {

        medunnaPage.showInvoiceBtn.click();


    }

    @Then("Staff verifies the SSN number belgons to the relevant patient")
    public void staffVerifiesTheSSNNumberBelgonsToTheRelevantPatient() {

        ReusableMethods.waitFor(2);
        String expectedSSN = ConfigReader.getProperty("PatientSSNstatusCompleted");
        ReusableMethods.waitFor(2);
        String actualSSN =(String)medunnaPage.invoiceSSN.getAttribute("innerHTML");
        ReusableMethods.waitFor(2);




        assertEquals(expectedSSN,actualSSN);
    }

    @Given("User\\(Patient) signs in with correct credentials")
    public void user_patient_signs_in_with_correct_credentials() {

        medunnaPage.usernameInput.sendKeys(ConfigReader.getProperty("validUsernamePatient"));
        medunnaPage.passwordInput.sendKeys(ConfigReader.getProperty("validPasswordPatient"), Keys.ENTER);



    }


    @And("User\\(Patient) clicks the My Appointments")
    public void userPatientClicksTheMyAppointments() {

        medunnaPage.patientMyPagesBtn.click();
        medunnaPage.myAppointmentsPatient.click();

        medunnaPage.patientAppointmentsFromDate.sendKeys("16.11.2022");

        medunnaPage.patientAppointmentsToDate.sendKeys("18.11.2022");




    }



    @And("User\\(Patient) clicks Show Tests")
    public void userPatientClicksShowTests() {
        medunnaPage.showTestsBtnPatient.click();

    }

    @And("User\\(Patient) clicks View Results")
    public void userPatientClicksViewResults() {

        medunnaPage.viewResultsBtnPatient.click();

    }

    @Then("User\\(Patient) verifies that it can see the result fields  id, name for test, default max and min value, test date and description")
    public void userPatientVerifiesThatItCanSeeTheResultFieldsIdNameForTestDefaultMaxAndMinValueTestDateAndDescription() {

        List<WebElement> list = medunnaPage.testReultSections;
        boolean flag = true;

        for (int i = 0; i <6 ; i++) {
            if(list.get(i).getText().isEmpty()){
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }

    @And("User\\(Patient) clicks Show Invoice Button")
    public void userPatientClicksShowInvoiceButton() {
        medunnaPage.showInvoiceBtn.click();
    }


    @Then("User\\(Patient) verifies the SSN no on invoice belongs to him or her")
    public void userPatientVerifiesTheSSNNoOnInvoiceBelongsToHimOrHer() {

        String expectedSSN= ConfigReader.getProperty("validPasswordPatient"); //password and SSN no are the same




        Boolean flag= waitFluent.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//tr[4]/th[2]"),expectedSSN));

        System.out.println("expectedSSN = " + expectedSSN);
        assertTrue(flag);
    }

}
