package techproed.tests.day19_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

public class C02_DriverIlkTest {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        try {
            Driver.getDriver().findElement(By.xpath("//*[.='Try different image']")).click();
        } catch (Exception e) {
            System.out.println("Element çıkmadı");
        }
        new AmazonPage().aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://bestbuy.com");
    }
}
