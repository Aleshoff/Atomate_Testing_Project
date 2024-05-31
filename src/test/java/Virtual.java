import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Virtual extends PageObject{
    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualText;

    public Virtual (WebDriver driver) {
        super(driver);
    }
    public String verifyVirtualText () {
        return this.virtualText.getText();
    }
}
