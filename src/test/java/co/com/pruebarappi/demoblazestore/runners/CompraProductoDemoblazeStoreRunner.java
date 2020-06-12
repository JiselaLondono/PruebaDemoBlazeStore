package co.com.pruebarappi.demoblazestore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_producto_demoblaze_store.feature",
        glue = "co.com.pruebarappi.demoblazestore.definitions",
        snippets = SnippetType.CAMELCASE
)
public class CompraProductoDemoblazeStoreRunner {
}
