package co.com.pruebarappi.demoblazestore.steps;

import co.com.pruebarappi.demoblazestore.pages.CarritoComprasPage;
import co.com.pruebarappi.demoblazestore.pages.DetalleProductoPage;
import co.com.pruebarappi.demoblazestore.pages.PaginaPrincipalPage;
import cucumber.api.DataTable;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static co.com.pruebarappi.demoblazestore.utils.Constantes.*;

public class CompraProductoStep extends ScenarioSteps {

    @Page
    PaginaPrincipalPage paginaPrincipalPage;

    @Page
    DetalleProductoPage detalleProductoPage;

    @Page
    CarritoComprasPage carritoComprasPage;

    public void adicionarProductoAlCarrito(){
        detalleProductoPage.adicionarProductoAlCarrito();
    }

    public void finalizarCompraProducto(DataTable datosCompra){
        paginaPrincipalPage.seleccionarOpcionMenuPrincipal(OPCION_CART);
        carritoComprasPage.realizarPedidoProducto();
        carritoComprasPage.ingresarNombre(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(0));
        carritoComprasPage.ingresarPais(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(1));
        carritoComprasPage.ingresarCiudad(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(2));
        carritoComprasPage.ingresarNumeroTarjetaCredito(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(3));
        carritoComprasPage.ingresarMes(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(4));
        carritoComprasPage.ingresarAnio(datosCompra.cells(LISTA_DATOS).get(FILA_DATOS).get(5));
        carritoComprasPage.confirmarCompra();
    }

    public void validarCompraExitosa() {
        MatcherAssert.assertThat("Error: Se esperaba el mensaje de respuesta exitosa: <" + MENSAJE_EXITOSO_COMPRA + "> \npero se obtuvo el mensaje: <" + carritoComprasPage.obtenerMensajeCompra() + ">.",
                MENSAJE_EXITOSO_COMPRA.equals(carritoComprasPage.obtenerMensajeCompra()));
    }
}
