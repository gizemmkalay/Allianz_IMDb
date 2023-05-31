import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AwardPage extends BasePage {
    public WebElement getCharlie() {
        return Charlie;
    }

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/M/MV5BZDc4NjE1M2EtNWVjNi00NDRkLTg5MzctNzJhMGQ4Yjc5YzcyXkEyXkFqcGdeQXVyMDI2NDg0NQ@@._SL165_CR21,0,111,165_AL_.jpg']")
    private WebElement Charlie;

    public WebElement getTheJazzSinger() {
        return TheJazzSinger;
    }

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/M/MV5BOTUxNTk0MjEtZjQ5Yi00ODBhLTlkY2YtMDJhOWZmNDM1YWJkXkEyXkFqcGdeQXVyNjE5MjUyOTM@._SL165_CR21,0,111,165_AL_.jpg']")
    private WebElement TheJazzSinger;

    public AwardPage(WebDriver driver) {

        super(driver);
    }
}



