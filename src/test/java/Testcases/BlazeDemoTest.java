package Testcases;

import Base.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.*;
import Utilities.ExcelUtils;
import Utilities.DataProviders;
import Utilities.ScreenshotUtils;

public class BlazeDemoTest extends Base {

    String file = "src/test/resources/TestData.xlsx";

    @Test(
            dataProvider = "flightData",
            dataProviderClass = DataProviders.class
    )
    public void fullFlowTest(

            String name,
            String country,
            String city,
            String state,
            String zip,
            String cardNo,
            String month,
            String year,
            String cardName

    ) throws Exception {

        try {

            System.out.println("-----TEST STARTED ------");

           
            driver.get("https://blazedemo.com/");
            HomePage hp = new HomePage(driver);

            System.out.println("Searching Flights");

            hp.selectFromCity("Boston");
            hp.selectToCity("London");

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "Cities Selected" + name);

            hp.clickFindFlights();

            Thread.sleep(2000);

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "Flights Found " + name);

          

            System.out.println("Selecting Flight");

            FlightSearchPage fp =
                    new FlightSearchPage(driver);

            fp.highlightAndSelectFlight(name);

            Thread.sleep(2000);

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "Purchase Page " + name);

            

            System.out.println("Filling Purchase Details");

          

            PurchasePage pp =
                    new PurchasePage(driver);

            pp.fillForm(
                    name,
                    country,
                    city,
                    state,
                    zip,
                    cardNo,
                    month,
                    year,
                    cardName
            );

            Thread.sleep(3000);

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "Form Filled" + name);

            pp.clickPurchase();

            System.out.println("Final Confirmation Page");

            Thread.sleep(3000);

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "Confirmation " + name);

           

            System.out.println("Writing Excel Data");

            if (name.equals("Ritika")) {

                ExcelUtils.setCellData(
                        file,
                        "PurchaseData",
                        1,
                        9,
                        "SUCCESS");
            }

            else if (name.equals("Yashi")) {

                ExcelUtils.setCellData(
                        file,
                        "PurchaseData",
                        2,
                        9,
                        "SUCCESS");
            }

            else if (name.equals("Navya")) {

                ExcelUtils.setCellData(
                        file,
                        "PurchaseData",
                        3,
                        9,
                        "SUCCESS");
            }

            System.out.println(
                    "----- TEST COMPLETED SUCCESSFULLY ------");

        }

        catch (Exception e) {

            System.out.println(
                    "------- TEST FAILED -------");

            e.printStackTrace();

            ScreenshotUtils.captureScreenshot(
                    driver,
                    "FAILED TEST " + name);

            throw new RuntimeException(e);
        }
    }
}