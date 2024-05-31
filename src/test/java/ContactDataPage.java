import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDataPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailForm;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneForm;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryForm;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityForm;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postecodeForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/label")
    private WebElement postecodeHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton1;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[1]")
    private WebElement backButton;

    public ContactDataPage (WebDriver driver) {super(driver);}

    public void completeContactDataForms () {

        this.emailForm.sendKeys(Constants.EMAIL_TEXT);
        this.phoneForm.sendKeys(Constants.TELEFONENUMBER_TEXT);
        this.countryForm.sendKeys(Constants.COUNTRY_TEXT);
        this.cityForm.sendKeys(Constants.CITY_TEXT);
        this.postecodeForm.sendKeys(Constants.POSTINDEX_TEXT);
        Utils.scrollToElement(driver, postecodeHeader);

        this.nextButton1.click();
    }

    public void unCompleteContactDataForms () {

        this.phoneForm.sendKeys(Constants.TELEFONENUMBER_TEXT);
        this.countryForm.sendKeys(Constants.COUNTRY_TEXT);
        this.cityForm.sendKeys(Constants.CITY_TEXT);
        this.postecodeForm.sendKeys(Constants.POSTINDEX_TEXT);
        Utils.scrollToElement(driver, postecodeHeader);
        this.nextButton1.click();

        this.emailForm.findElement(By.xpath("//*[@class=\"error-message\"]"));
    }
}
