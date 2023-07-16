package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.omnipro.steps.changeLocationSteps;


public class changeLocationDefinitions {

    @Steps
    changeLocationSteps objlocationSteps;

    @Given("^que se quiere asignar un municipio o ciudad para la pagina$")
    public void que_se_quiere_asignar_un_municipio_o_ciudad_para_la_pagina() {
        objlocationSteps.openNavigator();
        objlocationSteps.chooseLocation();
    }


    @When("^se ingrese el \"([^\"]*)\" y la ciudad \"([^\"]*)\"$")
    public void se_ingrese_el_y_la_ciudad(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^debe visualizarse correctamente la ciudad escogida en la pantalla principal$")
    public void debe_visualizarse_correctamente_la_ciudad_escogida_en_la_pantalla_principal() {
        // Write code here that turns the phrase above into concrete actions

    }
}
