package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class ReusableMethods {

    //========ScreenShot(Sayfanın resmini alma)=====//
    public static String getScreenshot(String name) throws IOException {

        // yinelemeyi önlemek için ekran görüntüsünü geçerli tarihle adlandırma
        String date = new SimpleDateFormat("yyyy-MM-dd-HHmm").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        //ekran görüntüsü konumunun tam yolu
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + "_" + date + ".png";
        File finalDestination = new File(target);

        //ekran görüntüsünü verilen yola kaydedin
        FileUtils.copyFile(source, finalDestination);
        return target;
    }//

    //========ScreenShot Web Element(Bir webelementin resmini alma)=====//
    public static String getScreenshotWebElement(String name, WebElement element) throws IOException {
        String date = new SimpleDateFormat("yyyy-MM-dd-hhmm").format(new Date());

        // TakesScreenshot, ekran görüntüsünü alan bir selenyum arayüzüdür.
        File source = element.getScreenshotAs(OutputType.FILE);

        // ekran görüntüsü konumunun tam yolu
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + "_" + date + ".png";
        File finalDestination = new File(wElementSS);

        // ekran görüntüsünü verilen yola kaydedin
        FileUtils.copyFile(source, finalDestination);
        return wElementSS;
    }//

    //========Switching Window(Pencereler arası geçiş)=====//
    public static void switchToWindow(String targetTitle) {

        String origin = getDriver().getWindowHandle();

        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
            if (getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        getDriver().switchTo().window(origin);
    }//


    //========Hover Over(Elementin üzerinde beklemek)=====//
    public static void hover(WebElement element) {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(element).perform();

    }//

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }//

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = getDriver().findElements(locator);

        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {

            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }//

    //   HARD WAIT WITH THREAD.SLEEP
    //   waitFor(5);  => waits for 5 second


    //===============Explicit Wait==============//
    public static void waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }//

    public static WebElement waitForClickable(By locator, int timeout) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));

        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }//


    public static void waitForPageToLoad(long timeout) { // method
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);

        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }//

    public static Faker getFaker() {

        Faker faker;
        return faker = new Faker();
    }//

    public static Actions getActions() {

        Actions actions;
        return actions = new Actions(getDriver());
    }//

    public static Select select(WebElement ddm) {

        Select select;

        return select = new Select(ddm);
    }//

    public static void jsScrollClick(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        try {
            webElement.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);
        }
    }

    public static void waitFor(int sec) {

        try {
            Thread.sleep(sec * 1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public static Random random() { //

        Random random;
        return random = new Random();
    }

    public static void jsScroll(WebElement webElement) {  //

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }


    public static void toBeClickableWait(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void visibilityOfWait(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void visibilityOfElementLocatedWait(By located) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(located));
    }

    public static void scrollDownJs() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public static void enterField(String fieldName, String fieldValue) {
        By locator = By.xpath("//*[.='" + fieldName + "']//following-sibling::input");
        driver.findElement(locator).sendKeys(fieldValue);
    }

    public static void sayfaKucult() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.
        }
    }

    public static String setTheDate(String format, int atMostDay, int atMostMonth, int atMostYear) {
        // verilen gun ay yıl kadar oncesine gidip tarih olusturur
        // verilen gun ay yıl kadar sonrasına gidip tarih olusturur
        // Date date = new Date();
        // DateFormat tarih = new SimpleDateFormat("dd-MM-yyy");
        // hangi class'i kullanarak formatlama yaparsan yap, formatlanan date Stringe donusur
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        date = date.plusYears(atMostYear).plusMonths(atMostMonth).plusDays(atMostDay);
        String dateF = formatter.format(date);

        return dateF;
    }

    public static String setTheDateByRandom(String format, int atMostYear, String direction) {

        int day = (int) (Math.random() * 366 + 1);
        int month = (int) (Math.random() * 13 + 1);
        int year = (int) (Math.random() * atMostYear + 1);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        direction = direction.toUpperCase(Locale.ROOT);
        String dateF;

        switch (direction) {
            case "FEATURE":
                date = date.plusYears(year).plusMonths(month).plusDays(day);
                dateF = formatter.format(date);
                return dateF;

            case "PAST":
                date = date.minusYears(year).minusMonths(month).minusDays(day);
                dateF = formatter.format(date);
                return dateF;

            default:
                dateF = formatter.format(date);
                return dateF;

        }
    }

    public static String setTheDateByRandomWithTime(String format, int atMostYear, String direction) {

        int day = (int) (Math.random() * 366 + 1);
        int month = (int) (Math.random() * 13 + 1);
        int year = (int) (Math.random() * atMostYear + 1);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        direction = direction.toUpperCase(Locale.ROOT);
        String dateF;

        switch (direction) {
            case "FEATURE":
                dateTime = dateTime.plusYears(year).plusMonths(month).plusDays(day);
                dateF = formatter.format(dateTime);
                return dateF;

            case "PAST":
                dateTime = dateTime.minusYears(year).minusMonths(month).minusDays(day);
                dateF = formatter.format(dateTime);
                return dateF;

            default:
                dateF = formatter.format(dateTime);
                return dateF;

        }
    }

    public static String stringDateFormat(String date) {
        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        String year = date.substring(6);

        String formatDateString = year + "-" + month + "-" + day;

        return formatDateString;

        // buraya gelen  gun ay yil gg.aa.yyyy
        // 2030-01-01  yıl ay gun olmalı

    }

    public static void voidClickByAction(String fieldName, int id) {

        By locator = By.xpath("//label[text()='" + fieldName + "']//following-sibling::input");
        By locator2 = By.xpath("//*[text()='The Appointment is updated with identifier " + id + "']");

        Actions actions = new Actions(getDriver());

        actions.click(getDriver().findElement(locator)).perform();
    }

    public static void selectDropDown(WebElement element) {

        List<WebElement> list = select(element).getOptions();

        int index = random().nextInt(list.size());

        while (index == 0) {

            index = random().nextInt(list.size());
        }
        select(element).selectByIndex(index);
    }

    public static void selectDdmIndex(WebElement element) {

        List<WebElement> list = select(element).getOptions();

        int index = random().nextInt(list.size());

        select(element).selectByIndex(index);
    }

    public static void addToCart(int product) {

        By locator = By.xpath("//div[@class='overlay-content']/a[@data-product-id='" + (product + 1) + "']");
        Driver.getDriver().findElement(locator).click();
    }

    public static WebElement productsInCart(int product) {

        By locator = By.cssSelector("#product-" + product + "");
        return getDriver().findElement(locator);
    }

    public static String dateMonth() {

        String month;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
        return month = dateTime.format(formatter);
    }

    public static String dateYear() {

        String year;
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        return year = localDateTime.format(formatter);
    }

    public static void pageDown(int pageDown) {

        Actions actions = new Actions(Driver.getDriver());
        switch (pageDown) {
            case 1:
                actions
                        .sendKeys(Keys.PAGE_DOWN)
                        .perform();
                break;
            case 2:
                actions
                        .sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN)
                        .perform();
                break;
            default:
                actions
                        .sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN)
                        .perform();
                break;
        }
    }

    public static String jsGetAttributeValue(WebElement webElement) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        return (String) js.executeScript("return arguments[0].value", webElement);
    }

    public void clickFunction(WebElement clickElement) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void  sendKeysFunction(WebElement sendKeysElement,String value){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void Assertion(WebElement actual, String expected) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("Text : " + actual.getText());
    }
    /*
    document.addEventListener('keydown', function (e) {
    if (e.keyCode == 119) { // F8
        debugger;
    }
}, {
    capture: true
});
     */
}