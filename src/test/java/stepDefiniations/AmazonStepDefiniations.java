package stepDefiniations;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefiniations {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
       // amazonPage.rejectAllCookies.click();

    }
    @When("kullanici iphone aratir")
    public void kullanici_iphone_aratir() {
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
        ReusableMethods.waitFor(1);

    }
    @Then("kullanici sonuclarin iphone icerdigini test eder")
    public void kullanici_sonuclarin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("Iphone"));

    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        ReusableMethods.waitFor(1);
        Driver.quitDriver();

    }

    @When("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {

        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {

        Assert.assertTrue(amazonPage.searchResult.getText().contains("Selenium"));
    }

    @When("kullanici Java aratir")
    public void kullaniciJavaAratir() {

        amazonPage.searchBox.sendKeys("Java", Keys.ENTER);
    }

    @Then("kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {

        Assert.assertTrue(amazonPage.searchResult.getText().contains("Java"));
    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String arg0) {
        amazonPage.searchBox.sendKeys(arg0, Keys.ENTER);

    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String arg0) {

        Assert.assertTrue(amazonPage.searchResult.getText().contains(arg0));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.searchBox.sendKeys(istenenKelime, Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelimeDogrulama) {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(istenenKelimeDogrulama));
    }
}

