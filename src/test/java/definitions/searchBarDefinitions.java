package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.omnipro.steps.searchBarSteps;

public class searchBarDefinitions {

    @Steps
    searchBarSteps objsearchSteps;

    @Given("^que se requiere buscar el producto de menor valor ofrecido$")
    public void que_se_requiere_buscar_el_producto_de_menor_valor_ofrecido() {
        objsearchSteps.openNavigator();
        // Write code here that turns the phrase above into concrete actions

    }


    @When("^se busque por la palabra |Toyota Corola|$")
    public void se_busque_por_la_palabra_Toyota_Corola() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^me regrese el valor del menor producto y su detalle$")
    public void me_regrese_el_valor_del_menor_producto_y_su_detalle() {
        // Write code here that turns the phrase above into concrete actions

    }
}
