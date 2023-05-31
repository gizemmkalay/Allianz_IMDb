import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OscarPage extends BasePage {
    public OscarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEventHistory() {
        return eventHistory;
    }

    public void setEventHistory(WebElement eventHistory) {
        this.eventHistory = eventHistory;
    }

    @FindBy(xpath = "//*[text()='Event history']")
    private WebElement eventHistory;
}
