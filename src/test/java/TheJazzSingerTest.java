import org.junit.jupiter.api.Test;
import org.apache.log4j.Logger;


public class TheJazzSingerTest extends BaseTest {
    final static Logger Log = Logger.getLogger(TheJazzSingerTest.class);

    @Test
    public void TestCase1(){
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
        Log.info("“Honorary Award” başlığı altında “The Jazz Singer” seçilir");
        AwardPage.click(AwardPage.getTheJazzSinger());
        Log.info("Gelen ekranda, The Jazz Singer’a ait;Director: bilgisi kayıt edilir.Writer: bilgisi kayıt edilir Stars: bilgisi kayıt edilir.");
        CircusPage theCircusPage = new CircusPage(driver);
        String director = theCircusPage.getDirector().getText();
        String writer = theCircusPage.getWriter().getText();
        String stars = theCircusPage.getStars().getText();
        Log.info("“Ekranın sol üstünde bulunan “IMDb” butonuna tıklanarak “Anasayfa’ya” dönülür.");
        homePage.click(homePage.getAnaMenu());
        Log.info("Arama çubuğuna “The Jazz Singer” yazılır");
        homePage.getSearchIMDBBar().sendKeys("The Jazz Singer");
        Log.info("Sonuçlar arasında gelen “The Jazz Singer’a” tıklanır.");
        homePage.click(homePage.getSearchTheJazzSinger());
        Log.info("direktor,writer,stars bilgisi kayıt edilen aynı mı kontrol edilir.");
        homePage.check(director, writer, stars);

    }

}
