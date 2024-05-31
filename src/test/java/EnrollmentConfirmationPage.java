import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentConfirmationPage extends PageObject{

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement successRegistrationAttribute;

    public EnrollmentConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void verifySuccessAttribute () {

        successRegistrationAttribute.findElement(By.xpath("//a[@href=\"../index.html\"]"));
    }
}
