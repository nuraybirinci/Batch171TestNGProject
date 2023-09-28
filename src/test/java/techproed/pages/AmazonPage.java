package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {
    /*
        TestNg framework'ünde locate'lerimizi page class'larında tutarız. TestNG framework'ünde artık findElement()
    methodu yerine @FindBy notasyonu kullanırız. ve findElement() methodunu nasıl driver ile kullandıysak bu class'dada
    driver'ı tanımlamamız gerekiyor. Bunun için PageFactory class'ından initElements() methodu ile aşağıdaki örnekteki
    gibi drive'ı bu class'a tanımlarız. @FindBy kullanımında notasyona parametre olarak locater'ı ve değerini yazarız.
    Sonrada locate'ini aldığımız webelemente bir isim veririz
     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

}
