import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fundamentals extends PageObject{
    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalsPageText;

    public Fundamentals (WebDriver driver) {
        super(driver);
    }
    public String fundamentalsPageText () {
        return this.fundamentalsPageText.getText();
    }
}
