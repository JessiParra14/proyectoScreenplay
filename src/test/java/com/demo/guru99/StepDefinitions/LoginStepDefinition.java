package com.demo.guru99.StepDefinitions;

import com.demo.guru99.Questions.ValidarLogin;
import com.demo.guru99.Tasks.Login;
import com.demo.guru99.UserInterfaces.LoginUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Managed (driver = "chrome")
    private WebDriver navegador;
    private Actor jessica = Actor.named("jessica");

    private LoginUI loginUI = new LoginUI();

    @Before
    public void configuracion(){
        jessica.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario se encuentra en la pagina web")
    public void elUsuarioSeEncuentraEnLaPaginaWeb() {
        jessica.wasAbleTo(Open.browserOn(loginUI));
    }

    @Cuando("el ingrese las credenciales")
    public void elIngreseLasCredenciales() {
        jessica.attemptsTo(Login.informacion());
    }
    @Entonces("el podra visualizar la pagina de inicio")
    public void elPodraVisualizarLaPaginaDeInicio() {
        jessica.should(seeThat("El actor puede ver", ValidarLogin.validarMensaje(), Matchers.equalTo(true)));
    }
}
