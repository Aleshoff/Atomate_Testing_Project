import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudyOptionPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement autManOption;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButton2;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[1]")
    private WebElement backButton;

    public StudyOptionPage (WebDriver driver) {super(driver);}

    public void selectStudyOption () {
        this.autManOption.click();
        this.nextButton2.click();
    }
}
