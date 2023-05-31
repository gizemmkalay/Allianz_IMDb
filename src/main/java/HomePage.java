import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[@href='/title/tt0018773/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_The%2520Circus']")
    private WebElement searchTheCircus;
    @FindBy(xpath = "//a[@href='href=/title/tt0018037/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_The%2520Jazz%2520Si']")
    private WebElement searchTheJazzSinger;

    @FindBy(xpath = "//*[@id='home_img_holder']")
    private WebElement anaMenu;
    @FindBy(id = "imdbHeader-navDrawerOpen")
    private WebElement menu;


    public WebElement getAnaMenu() {
        return anaMenu;
    }

    public WebElement getSearchIMDBBar() {
        return searchIMDB;
    }

    public WebElement getSearchTheCircus() {
        return searchTheCircus;
    }

    public WebElement getSearchTheJazzSinger(){ return searchTheJazzSinger;}



    @FindBy(id = "suggestion-search")
    private WebElement searchIMDB;



    public WebElement getOscar() {
        return oscar;
    }

    public void setOscar(WebElement oscar) {
        this.oscar = oscar;
    }

    @FindBy( xpath="(//span[text()='Oscars'")
    private WebElement oscar;


    public WebElement getMenu() {
        return menu;
    }

    public void setMenu(WebElement menu) {
        this.menu = menu;
    }



    public static String getUrl() {
        return Url;
    }

    public static void setUrl(String url) {
        HomePage.Url = url;
    }

    private static String Url ="https://www.imdb.com/";
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
