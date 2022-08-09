package com.demo.guru99.StepDefinitions;

import com.demo.guru99.UserInterfaces.LoginUI;
import com.demo.guru99.UserInterfaces.VuelosUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import com.demo.guru99.Tasks.Vuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class VuelosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor jessica = Actor.named("jessica");

    @Before
    public void configuracion(){
        jessica.can(BrowseTheWeb.with(navegador));
        //jessica.wasAbleTo(Open.browserOn(loginUI));
    }

    @Dado("el usuario esta en la pagina de vuelos")
    public void elUsuarioEstaEnLaPaginaDeVuelos() {
        jessica.attemptsTo(Vuelos.datosVuelo());
    }
    @Cuando("el cambie los datos del vuelo")
    public void elCambieLosDatosDelVuelo() {

    }
    @Entonces("visualizara un mensaje sobre que no hay sillas disponibles")
    public void visualizaraUnMensajeSobreQueNoHaySillasDisponibles() {

    }
}
