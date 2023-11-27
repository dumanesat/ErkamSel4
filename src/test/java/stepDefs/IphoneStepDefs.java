package stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;
import pages.SearchPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class IphoneStepDefs {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("User is on search page")
    public void user_is_on_search_page() {
        Driver.getDriver().get(ConfigurationReader.get("url"));
        searchPage.login(ConfigurationReader.get("email"),ConfigurationReader.get("password"));
       // mainPage.searchBar.waitUntil(visible, 10000);
/*try {


        if (mainPage.acceptCookies.isDisplayed()) {
            actions.moveToElement(mainPage.acceptCookies).click().perform();

        }}catch (Exception e){

        }*/
    }

String model1;
    @When("User enters Iphone model with storage {string}")
    public void user_enters_Iphone_model_with_storage(String model) throws InterruptedException {
        this.model1=model;
        mainPage.searchBar.sendKeys(model+ Keys.ENTER);

        searchPage.phoneList.get(searchPage.phoneList.size() - 1);


    }

String model;
    @When("User click model checkboxes {string}")
    public void user_click_model_checkboxes(String string) {
model=string;
       actions.moveToElement(searchPage.modelCheckBox(string)).click();


    }
String carrier2;
    @When("User clicks condition check box {string}")
    public void user_clicks_condition_check_box(String string) {
        carrier2=string;
        //searchPage.conditionCheckBox(string).shouldBe(exist);
        if (searchPage.filterModel.isDisplayed()) {
            //BrowserUtils.waitForVisibility(searchPage.filterModel,10);
           actions.moveToElement(searchPage.filterModel).perform();
            searchPage.filterModel.sendKeys(string);
            //BrowserUtils.waitForVisibility(searchPage.conditionCheckBox(string),10);
            searchPage.conditionCheckBox(string).click();



            try {
                if(string.contains("Galaxy")&string.contains("Galaxy")){
                    searchPage.conditionCheckBox(string.replace(" Plus","+")).click();
                    searchPage.conditionCheckBox(string.replace("Plus","+")).click();

                }
            }catch (Exception e){

            }

        } else {
            //BrowserUtils.waitForClickablility(searchPage.conditionCheckBox(string),10);
            actions.moveToElement(searchPage.conditionCheckBox(string)).click().perform();


        }
    }

    String url;
String storage;
    @When("User click storage check box {string}")
    public void user_click_storage_check_box(String string) {
        storage=string;
      /*  if(searchPage.filterStorage.isDisplayed()){
            actions.moveToElement(searchPage.filterStorage).sendKeys(searchPage.filterStorage).perform();
           BrowserUtils.waitForClickablility(searchPage.storageCheckBox(string),10);
           BrowserUtils.waitForClickablility(searchPage.storageCheckBox(string),10);
           actions.moveToElement(searchPage.storageCheckBox(string)).click().perform();

        }else {*/
            //System.out.println("searchPage.storageCheckBox(string).isDisplayed() = " + searchPage.storageCheckBox(string).isDisplayed());
           actions.moveToElement(searchPage.storageCheckBox(string)).click().perform();

            //searchPage.unlockedPhoneList.get(0).shouldBe(exist);
            url = Driver.getDriver().getCurrentUrl();
       // }

    }

String carrier1;
    @When("User inconsistent prices according to condition {string}")
    public void user_eliminates_inconsistent_prices_according_to_condition(String carrier) throws InterruptedException {
        this.carrier1 = carrier;
        //Thread.sleep(500);
        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        Thread.sleep(500);
        List<WebElement> newUnlocked = searchPage.phoneListCarrier(carrier);
        //System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.phoneListCarrier(carrier);
           // BrowserUtils.waitForVisibility(newUnlocked.get(i),10);
           actions.moveToElement( newUnlocked.get(i)).click().perform();

           // Thread.sleep(500);


            try {
                if (searchPage.outOfStock.isDisplayed()) {
                    Driver.getDriver().navigate().back();

                    // $x("//h3[@data-selector='total-products']").shouldBe(visible);
                    continue;
                }
               // BrowserUtils.waitForVisibility(searchPage.condition,10);

            } catch (Exception e) {

            }

            Double fair;
            Double good;
            Double excellent;
            if (searchPage.conditionsPrice.size() == 3) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                //Thread.sleep(500);
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Good"))) {


                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                //Thread.sleep(500);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Excellent"))) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
              // Thread.sleep(500);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.conditionsName.get(0).getText().contains("Good") && searchPage.conditionsName.get(1).getText().contains("Excellent"))) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                //Thread.sleep(500);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                i--;
                Driver.getDriver().navigate().back();

                continue;
            }
            //webdriver().driver().getWebDriver().navigate().back();
            //open(url);
            Driver.getDriver().navigate().back();
            //BrowserUtils.waitForVisibility(searchPage.totalProductsText,10);


        }
        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);

        try {
            System.out.println(model1 + " fair = " + fairPriceList);
            System.out.println(model1 + " good = " + goodPriceList);
            System.out.println(model1 + " excellent = " + excellentPriceList);
           // System.out.println(model1 + " The cheapest fair = " + Collections.min(fairPriceList));
            //System.out.println(model1 + " The cheapest good " + Collections.min(goodPriceList));
          //  System.out.println(model1 + " The cheapest excellent " + Collections.min(excellentPriceList));
        } catch (Exception e) {
        }

    }

    @When("User inconsistent prices according to condition.. {string}")
    public void user_inconsistent_prices_according_to_condition(String carrier) {
        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        //Thread.sleep(500);
        List<WebElement> newUnlocked = searchPage.unlockedPhoneList;
        System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.unlockedPhoneList;
            BrowserUtils.waitForClickablility(newUnlocked.get(i),10);
            actions.moveToElement(newUnlocked.get(i)).click().perform();

            try {
                BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//p[normalize-space(text())='Condition']")),10);
                
            }catch (Exception e){

            }

            Double fair;
            Double good;
            Double excellent;
            if (searchPage.conditionsPrice.size() == 3) {
                Double []prices = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Good")) {


                Double[] prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Excellent")) {
                Double[] prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Good") && searchPage.conditionsName.get(1).getText().contains("Excellent")) {
                Double[] prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                continue;
            }
            // webdriver().driver().getWebDriver().navigate().back();
           // open(url);
            Driver.getDriver().navigate().back();
            BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//h3[@data-selector='total-products']")),10);

           // if(!searchPage.modelCheckBox(model).isSelected()){
             //   searchPage.modelCheckBox(model).hover().click();
            }

        //    if (!searchPage.conditionCheckBox(cond).isSelected()){
           //     searchPage.conditionCheckBox(cond).hover().click();
           // }



        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);
        System.out.println("fair = " + fairPriceList);
        System.out.println("good = " + goodPriceList);
        System.out.println("excellent = " + excellentPriceList);
        System.out.println("The cheapest fair = " + Collections.min(fairPriceList));
        System.out.println("The cheapest good " + Collections.min(goodPriceList));
        System.out.println("The cheapest excellent " + Collections.min(excellentPriceList));
    }


    @And("User click storage check box {string}.")
    public void userClickStorageCheckBox(String arg0) {
        actions.moveToElement(searchPage.storageCheckBox(arg0)).click().perform();



    }

    @And("User inconsistent prices according to {string}")
    public void userInconsistentPricesAccordingTo(String arg0) {
        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        //Thread.sleep(500);
        List<WebElement> newUnlocked = searchPage.returnCellular(arg0);
        System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.returnCellular(arg0);
            BrowserUtils.waitForClickablility(newUnlocked.get(i),10);
            actions.moveToElement(newUnlocked.get(i)).click().perform();
            BrowserUtils.waitForVisibility(searchPage.condition,10);


            Double fair;
            Double good;
            Double excellent;
            if (searchPage.conditionsPrice.size() == 3) {
                Double []prices = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Good")) {


                Double []prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Fair") && searchPage.conditionsName.get(1).getText().contains("Excellent")) {
                Double []prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.conditionsName.get(0).getText().contains("Good") && searchPage.conditionsName.get(1).getText().contains("Excellent")) {
                Double[] prices = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.conditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                continue;
            }
            // webdriver().driver().getWebDriver().navigate().back();
            //open(url);
             Driver.getDriver().navigate().back();

            //    if (!searchPage.conditionCheckBox(cond).isSelected()){
            //     searchPage.conditionCheckBox(cond).hover().click();
            // }


        }
        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);
        System.out.println("fair = " + fairPriceList);
        System.out.println("good = " + goodPriceList);
        System.out.println("excellent = " + excellentPriceList);
        System.out.println("The cheapest fair = " + Collections.min(fairPriceList));
        System.out.println("The cheapest good " + Collections.min(goodPriceList));
        System.out.println("The cheapest excellent " + Collections.min(excellentPriceList));
    }





    }

