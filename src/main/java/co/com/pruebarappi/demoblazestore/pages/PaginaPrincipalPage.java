package co.com.pruebarappi.demoblazestore.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class PaginaPrincipalPage extends PageObject {

    @FindBy (xpath = "//div[@class='list-group']")
    WebElementFacade menuCategorias;

    @FindBy(xpath = "//div[@id='navbarExample']")
    WebElementFacade menuPrincipal;

    @FindBy(id = "tbodyid")
    WebElementFacade contenedorProductos;

    public PaginaPrincipalPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarOpcionMenuPrincipal(String opcionMenu){
        menuPrincipal.findBy(By.xpath(String.format("//li/a[contains(text(),'%s')]", opcionMenu))).click();
    }

    public void seleccionarCategoriaMenu(String categoria){
        menuCategorias.findBy(By.xpath(String.format("./a[contains(text(),'%s')]", categoria))).click();
    }

    public void seleccionarProducto(String producto){
        contenedorProductos.findBy(By.xpath(String.format("//div[@class='card-block']//a[contains(text(),'%s')]", producto))).waitUntilClickable().click();
    }
}
