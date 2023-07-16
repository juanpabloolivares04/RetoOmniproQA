package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.omnipro.steps.searchBarSteps;
import org.omnipro.steps.searchMethodsSteps;

public class searchPaymentMethodDefinitions {

    @Steps
    searchMethodsSteps objMethodStep;
    @Given("^que se requiere ver los medios de pago$")
    public void que_se_requiere_ver_los_medios_de_pago() {
        objMethodStep.openNavigator();
    }


    @When("^se seleccionen los medios de pago a observar$")
    public void se_seleccionen_los_medios_de_pago_a_observar() {
        objMethodStep.searchMethod();

    }

    @Then("^se debe observar corrrectamente la pantalla de medios de pago$")
    public void se_debe_observar_corrrectamente_la_pantalla_de_medios_de_pago() {
        // Write code here that turns the phrase above into concrete actions

    }

}
