import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameForm;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameForm;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameForm;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordForm;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[5]/label")
    private WebElement confirmPasswordHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    public PersonalInformationPage (WebDriver driver) {
        super(driver);
    }

    public void completePersonalPageForms () {
        this.firstNameForm.sendKeys(Constants.NAME_TEXT);
        this.lastNameForm.sendKeys(Constants.SURNAME_TEXT);
        this.userNameForm.sendKeys(Constants.USERNAME_TEXT);
        this.passwordForm.sendKeys(Constants.PASSWORD_TEXT);
        this.confirmPasswordForm.sendKeys(Constants.PASSWORD_TEXT);
        Utils.scrollToElement(driver, confirmPasswordHeader);
        this.nextButton.click();
    }
}
