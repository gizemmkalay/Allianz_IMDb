import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


   public class CircusPage extends BasePage{

    @FindBy(xpath = "//div[@class='sc-52d569c6-3 jBXsRT']//span[text()='Director']")
    private WebElement Director;

    @FindBy(xpath = "//div[@class='sc-52d569c6-3 jBXsRT']//span[text()='Writer']")
    private WebElement Writer;
    @FindBy(xpath = "//div[@class='sc-52d569c6-3 jBXsRT']//a[text()='Stars']")
    private WebElement Stars;
    public WebElement getDirector() {
        return Director;
    }

    public WebElement getWriter() {
        return Writer;
    }

    public WebElement getStars() {
        return Stars;
    }
       public CircusPage(WebDriver driver) {

        super(driver);
       }

}
