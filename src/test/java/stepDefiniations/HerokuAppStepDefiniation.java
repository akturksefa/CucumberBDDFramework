package stepDefiniations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuAppStepDefiniation {

    Actions action = new Actions(Driver.getDriver());
    HerokuAppPage herokuAppPage = new HerokuAppPage();
    @Given("Kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("add element butonuna basar")
    public void addElementButonunaBasar() {
        herokuAppPage.addElement.click();
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
        ReusableMethods.waitFor(arg0);
    }

    @And("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(herokuAppPage.deleteButton,5);
    }

    @Then("delete butonu gorunut oldugunu test eder")
    public void deleteButonuGorunutOldugunuTestEder() {
        Assert.assertTrue(herokuAppPage.deleteButton.isDisplayed());
    }

    @Then("Delee butonuna basar")
    public void deleeButonunaBasar() {
        herokuAppPage.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertTrue(herokuAppPage.deleteButtonList.isEmpty());
    }
}
