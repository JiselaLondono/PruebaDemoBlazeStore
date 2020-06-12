package co.com.pruebarappi.demoblazestore.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DetalleProductoPage extends PageObject {

    @FindBy(xpath = "//div[@id='tbodyid']//a[contains(text(),'Add to cart')]")
    WebElementFacade btnAdicionarAlCarrito;

    public DetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void adicionarProductoAlCarrito(){
        btnAdicionarAlCarrito.waitUntilVisible().click();
        realizarEsperar(2000);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    private void realizarEsperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
