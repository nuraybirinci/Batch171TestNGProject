package techproed.tests.day20_Properties;

import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_ClassWork {
    @Test
    public void test01() {
    //https://testcenter.techproeducation.com/index.php?page=form-authentication
    Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));

    //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterPage centerPage = new TestCenterPage();
        String userName = ConfigReader.getProperty("techpro_test_username");
        String password = ConfigReader.getProperty("techpro_test_password");
        centerPage.userName.sendKeys(userName, Keys.TAB, password, Keys.ENTER);

    //Sayfadan cikis yap ve cikis yapildigini test et
    //sayfayı kapatınız
    }
}
