import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformationPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardnumberForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cardCvcForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[1]/label")
    private WebElement expiryDateHeader;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement monthForm;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButton3;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[1]")
    private WebElement backButton;

    public PaymentInformationPage (WebDriver driver) {super(driver);}

    public void completePaymentForms () {

        this.cardHolderForm.sendKeys(Constants.SURNAME_TEXT + " " + Constants.NAME_TEXT);
        this.cardnumberForm.sendKeys(Constants.CARDNUMBER_TEXT);
        this.cardCvcForm.sendKeys(Constants.CVCCODE_TEXT);
        Utils.scrollToElement(driver, expiryDateHeader);
        this.monthForm.sendKeys(Constants.EXPIRYMONTH_TEXT);
        this.yearForm.sendKeys(Constants.EXPIRYYEAR_TEXT);
        this.nextButton3.click();
    }
}
