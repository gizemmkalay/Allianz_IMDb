import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {
    final static Logger Log = Logger.getLogger(BasePage.class);

    WebDriverWait wait;
    protected WebDriver driver;
    private Object Assert;

    public void check(String direktor, String writer, String stars) {
        wait(1);
        Assert.equals("Charles Chaplin", direktor);
        Assert.equals("Charles Chaplin", writer);
        Assert.equals("Charles Chaplin", stars);
        wait(1);
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 500);
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoad() {

        Log.info("sayfanın yüklenmesini bekler");
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }
    public void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void click(WebElement webElement){
        wait(1);
        webElement.click();

    }
    public void scrollDowntoWebElement(WebElement webElement){
        Log.info("elementin bulunduğu yere iner");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }
    public void scrollDown(){
        Log.info("sayfanın en aşağısına gider");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}
