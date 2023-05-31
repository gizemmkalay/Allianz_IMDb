import org.junit.jupiter.api.Test;
import org.apache.log4j.Logger;


public class TheCircusTest extends BaseTest {

    final static Logger Log = Logger.getLogger(TheCircusTest.class);

    @Test
    public void TestCase() {
            HomePage homePage = new HomePage(driver);
            driver.get(homePage.getUrl());
            Log.info("https://www.imdb.com/ adresine gidilir");
            homePage.waitForPageLoad();
            Log.info("sayfa açıldı");
            Log.info("Arama çubuğunun sol tarafında bulunan Menü butonuna basılır");
            homePage.click(homePage.getMenu());
            Log.info("Gelen ekranda “Award & Events” başlığı altında bulunan “Oscars” butonuna tıklanır");
            homePage.click(homePage.getOscar());
            OscarPage oscarPage = new OscarPage(driver);
            Log.info("“Event History” başlığı altında “1929” değeri seçilir");
            oscarPage.click(oscarPage.getEventHistory());
            AwardPage AwardPage = new AwardPage(driver);
            Log.info("“Honorary Award” başlığı altında “The Circus (Charles Chaplin)” seçilir");
            AwardPage.click(AwardPage.getCharlie());
            Log.info("Gelen ekranda, The Circus’a ait;Director: bilgisi kayıt edilir.Writer: bilgisi kayıt edilir Stars: bilgisi kayıt edilir.");
            CircusPage theCircusPage = new CircusPage(driver);
            String director = theCircusPage.getDirector().getText();
            String writer = theCircusPage.getWriter().getText();
            String stars = theCircusPage.getStars().getText();
            Log.info("“Ekranın sol üstünde bulunan “IMDb” butonuna tıklanarak “Anasayfa’ya” dönülür.");
            homePage.click(homePage.getAnaMenu());
            Log.info("Arama çubuğuna “The Circus” yazılır");
            homePage.getSearchIMDBBar().sendKeys("The Circus");
            Log.info("Sonuçlar arasında gelen “The Circus’a” tıklanır.");
            homePage.click(homePage.getSearchTheCircus());
            Log.info("direktor,writer,stars bilgisi kayıt edilen aynı mı kontrol edilir.");
            homePage.check(director, writer, stars);


        }

    }

