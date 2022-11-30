package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_016_RoomCreationByAdminPositiveTestPage {

    public US_016_RoomCreationByAdminPositiveTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //US016_TC001 Admin creates a room
    //Admin navigates the signIn page
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginPage;

    //Admin signs in
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-sign-in-alt fa-w-16 fa-fw '])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement name;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInSubmit;

    //Admin clicks on Items&Titles button to click room option
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement itemAndTitle;

    //Admin clicks the room button
    @FindBy(xpath = "(//*[@href='/room'])[1]")
    public WebElement roomButton;

    //Admin clicks on Create a new room button
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewRoom;

    //Admin enters a room number
    @FindBy(xpath = "//*[@id='room-roomNumber']")
    public WebElement roomNumber;

    //Admin choose a room type (TWIN, DELUXE, PREMIUM_DELUXE, SUIT and DAYCARE)
    @FindBy(xpath = "//*[@id='room-roomType']")
    public WebElement selectRoomType;

    //Status option can be choosable for the room
    @FindBy(xpath = "//*[@id='room-status']")
    public WebElement roomStatus;

    //Price should be entered
    @FindBy(xpath = "//*[@id='room-price']")
    public WebElement roomPrice;

    //Description part can be fillable
    @FindBy(xpath = "//*[@id='room-description']")
    public WebElement roomDescription;

    //The past date cannot be selected.
    @FindBy(xpath = "//*[@id='room-createdDate']")
    public WebElement roomCreatedDate;

    //Admin clicks the save button
    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButton;

    //Admin clicks the room types to see same type of rooms.
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[3]")
    public WebElement roomTypes;

    //US016_TC002 Admin edits a room
    //Admin clicks edit button of the first room for edit
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement editButton;

    //US016_TC003 Admin deletes a room
    //Admin clicks the delete button of the first room
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement deleteButton;

}
