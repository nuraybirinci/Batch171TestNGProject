package techproed.tests.day19_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.Driver;

public class C04_PageKullanimi {
    @Test
    public void test01() throws InterruptedException {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //kullaniciAdi, kullaniciSfre, submitButton elementlerini locate edelimlogin olalım
        //kullanici=Admin
        //kullaniciSifre=admin123
        OpenSourcePage sourcePage = new OpenSourcePage();
        sourcePage.userName.sendKeys("Admin");
        sourcePage.password.sendKeys("admin123");
        sourcePage.loginButton.click();
        Thread.sleep(3000);

        //Login Testinin basarili olduğunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());

        //sayfayı kapatın
        Driver.closeDriver();

    }
}
