package co.com.pruebarappi.demoblazestore.steps;

import co.com.pruebarappi.demoblazestore.pages.PaginaPrincipalPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class SeleccionProductoStep extends ScenarioSteps {

    @Page
    PaginaPrincipalPage paginaPrincipalPage;

    @Step
    public void abrirPaginaDemoblazeStore(){
        paginaPrincipalPage.open();
    }

    @Step
    public void seleccionarProducto(String categoria, String producto){
        paginaPrincipalPage.seleccionarCategoriaMenu(categoria);
        paginaPrincipalPage.seleccionarProducto(producto);
    }
}
