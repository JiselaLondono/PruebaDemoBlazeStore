package co.com.pruebarappi.demoblazestore.definitions;

import co.com.pruebarappi.demoblazestore.steps.CompraProductoStep;
import co.com.pruebarappi.demoblazestore.steps.SeleccionProductoStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CompraProductoDemoblazeDefinition {

    @Steps
    SeleccionProductoStep seleccionProductoStep;

    @Steps
    CompraProductoStep compraProductoStep;

    @Dado("^que me encuentro en la página de ventas de DemoBlaze Store$")
    public void ingresarAlSistemaDemoblaze() {
        seleccionProductoStep.abrirPaginaDemoblazeStore();
    }

    @Cuando("^procedo con la compra del producto (.*) de la categoría (.*)$")
    public void iniciarCompraProducto(String producto, String categoria) {
        seleccionProductoStep.seleccionarProducto(categoria, producto);
    }

    @Cuando("^diligencio los siguientes datos de compra$")
    public void diligenciarDatosCompra(DataTable datosCompra){
        compraProductoStep.adicionarProductoAlCarrito();
        compraProductoStep.finalizarCompraProducto(datosCompra);
    }

    @Entonces("^la compra se efectúa de manera exitosa$")
    public void finalizarCompra() {
        compraProductoStep.validarCompraExitosa();
    }
}
