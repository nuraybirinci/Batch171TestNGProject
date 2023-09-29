package techproed.tests.day20_Properties;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_PropertiesTest {
    @Test
    public void test01() {
        String url = ConfigReader.getProperty("amazonUrl");
        System.out.println(url);
    }
}
