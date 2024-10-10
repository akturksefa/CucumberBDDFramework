package stepDefiniations;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefiniations {
    GuruPage guruPage =new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String arg0) {

        int index=0;
        for (int i = 0; i<guruPage.tableList.size();i++) {

            if (guruPage.tableList.get(i).getText().equals(arg0)) {
                System.out.println(guruPage.tableList.get(i).getText());
                index = i+1;

                List<WebElement> sutunElementler = Driver.getDriver().findElements(By.xpath("//tbody/tr//td["+index+"]"));
                for (WebElement element : sutunElementler) {
                    System.out.println(element.getText());
                }
            }



        }


    }
}
