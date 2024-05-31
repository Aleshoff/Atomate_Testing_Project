import org.openqa.selenium.WebDriver;

public class NavigateEnrollmentPages extends PageObject{

    public enum EnrollmentPages {
        personalInformationPage,
        contactDataPage,
        studyOptionPage,
        paymentInformationPage,
        enrollmentConfirmationPage,
    }

    public NavigateEnrollmentPages (WebDriver driver) {
        super(driver);
    }

    public void navigateToPage (EnrollmentPages page) {
        switch (page) {
            case personalInformationPage -> NavigateToPersonalInformation();
            case contactDataPage -> NavigateToContactInformation();
            case studyOptionPage -> NavigateToStudyOptionPage();
            case paymentInformationPage -> NavigateToPaymentInformationPage();
            case enrollmentConfirmationPage -> NavigateToEnrollmentConfirmationPage();
        }
    }

    public void NavigateToPersonalInformation() {
        var homePage = new Homepage(driver);
        homePage.ClickOnStartEnrolmentButton();
    }

    public void NavigateToContactInformation() {
        NavigateToPersonalInformation();
        var personalInformation = new PersonalInformationPage(driver);
        personalInformation.completePersonalPageForms();
    }

    public void NavigateToStudyOptionPage() {
        NavigateToContactInformation();
        var data = new ContactDataPage(driver);
        data.completeContactDataForms();
    }

    public void NavigateToPaymentInformationPage() {
        NavigateToStudyOptionPage();
        var option = new StudyOptionPage(driver);
        option.selectStudyOption();
    }

    public void NavigateToEnrollmentConfirmationPage() {
        NavigateToPaymentInformationPage();
        var paymentPage = new PaymentInformationPage(driver);
        paymentPage.completePaymentForms();
    }
}
