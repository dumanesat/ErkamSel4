package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class SearchPage extends MainPage{
    @FindBy(xpath ="//div[@class='grid grid-cols-1 gap-4 md:gap-7 lg:grid-cols-[repeat(3,26.2rem)] md:grid-cols-[repeat(2,26.2rem)]']/div" )
    public List<WebElement> phoneList;
    @FindBy(xpath = "//a[@class='!w-full _1xMx-RYw _3jgXaWY4']")

    public WebElement searchLink;

    //  public ElementsCollection conditionsPrice = $$x("//li[@data-qa='grade-0']/../li/a/div/div[2]");

    @FindBy(xpath = "(//ul[@class='grid gap-2 list-none grid-cols-3'])[1]/li/a/div/div[2]")
    public List<WebElement> conditionsPrice;


    public WebElement modelCheckBox(String model) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='" + model + "']"));
    }

    public WebElement storageCheckBox(String storage) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='" + storage + "']"));
    }

    public WebElement conditionCheckBox(String condition) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='" + condition + "']"));
    }

    // public ElementsCollection unlockedPhoneList=$$x("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'Unlocked')]/../../../..");
    //public ElementsCollection unlockedPhoneList=$$x("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'Unlocked')] | //div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(text(),'Unlocked')]");
    public List<WebElement> phoneListCarrier(String carrier) {
        return Driver.getDriver().findElements(By.xpath("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'" + carrier + "')] | //div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(text(),'" + carrier + "')]"));
    }
    @FindBy(xpath = "//div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(.,'Unlock')]/../../../.. | //div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(text(),'Unlocked')]")
    public List<WebElement> unlockedPhoneList;


    public List<WebElement> returnCellular(String wifiOrCellular) {
        return Driver.getDriver().findElements(By.xpath("//h2[contains(text(),'" + wifiOrCellular + "')]"));
    }
    @FindBy(xpath = "(//div[.='Out of stock'])[2]")
    public WebElement outOfStock;

    @FindBy(xpath = "(//ul[@class='grid gap-2 list-none grid-cols-3'])[1]/li/a/div/div/span")
    public List<WebElement> conditionsName;

    @FindBy(xpath = "//p[normalize-space(text())='Condition']")
    public WebElement condition;
    @FindBy(xpath = "//input[@id='facet-filter-storage']")
    public WebElement filterStorage;
    @FindBy(xpath = "//input[@id='model']")
    public WebElement filterModel;
    @FindBy(xpath = "//h3[@data-selector='total-products']")
    public WebElement totalProductsText;
}

