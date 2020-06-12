package co.com.pruebarappi.demoblazestore.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CarritoComprasPage extends PageObject {

    @FindBy(xpath = "//div[@id='page-wrapper']//button[contains(text(),'Place Order')]")
    WebElementFacade btnRealizarPedido;

    @FindBy(id = "name")
    WebElementFacade txtNombre;

    @FindBy(id = "country")
    WebElementFacade txtPais;

    @FindBy(id = "city")
    WebElementFacade txtCiudad;

    @FindBy(id = "card")
    WebElementFacade txtTarjetaCredito;

    @FindBy(id = "month")
    WebElementFacade txtMes;

    @FindBy(id = "year")
    WebElementFacade txtAnio;

    @FindBy(xpath = "//div[@class='modal-content']//button[contains(text(),'Purchase')]")
    WebElementFacade btnComprar;

    @FindBy(xpath = "//tbody[@id='tbodyid']//tr[@class='success']/td[2]")
    WebElementFacade lblInformacionProductoEnCarrito;

    @FindBy(xpath = "//div[@class='sweet-alert  showSweetAlert visible']//h2")
    WebElementFacade lblMensajeExitoso;

    public CarritoComprasPage(WebDriver driver) {
        super(driver);
    }

    public String obtenerInformacionProductoCarrito(){
        return lblInformacionProductoEnCarrito.getText();
    }

    public void realizarPedidoProducto(){
        btnRealizarPedido.waitUntilClickable().click();
    }

    public void ingresarNombre(String nombre){
        typeInto(txtNombre, nombre);
    }

    public void ingresarPais(String pais){
        typeInto(txtPais, pais);
    }

    public void ingresarCiudad(String ciudad){
        typeInto(txtCiudad, ciudad);
    }

    public void ingresarNumeroTarjetaCredito(String tarjetaCredito){
        typeInto(txtTarjetaCredito, tarjetaCredito);
    }

    public void ingresarMes(String mes){
        typeInto(txtMes, mes);
    }

    public void ingresarAnio(String anio){
        typeInto(txtAnio, anio);
    }

    public void confirmarCompra(){
        btnComprar.waitUntilVisible().click();
    }

    public String obtenerMensajeCompra(){
        return lblMensajeExitoso.getText();
    }
}
