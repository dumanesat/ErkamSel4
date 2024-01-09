package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class MainPage {


    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@type='button' and @data-qa='accept-cta']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@data-qa='search-bar-input']")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@data-test='icon-avatar']")
    private WebElement iconLogin;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;

    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordBox;

    @FindBy(xpath ="//a[@href='/en-us']" )
    private WebElement mainPage;

    public void login(String email, String password){
       /* BrowserUtils.waitForClickablility(iconLogin,5);
        iconLogin.click();
        BrowserUtils.waitForVisibility(emailBox,5);
        emailBox.sendKeys(email);
        BrowserUtils.waitForClickablility(submitButton,5);
        submitButton.click();
        passwordBox.sendKeys(password);
        BrowserUtils.waitForClickablility(submitButton,5);
        submitButton.click();
        BrowserUtils.waitForClickablility(mainPage,5);
        mainPage.click();*/
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



    // Add methods to interact with page elements if needed
}
