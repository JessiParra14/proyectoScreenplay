package com.demo.guru99.Interactions;

import com.demo.guru99.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.demo.guru99.UserInterfaces.VuelosUI.*;
public class ListaDesplegable implements Interaction {

    Datos datos = new Datos();

//    public void seleccionarTextoVisible(By elemento, String texto, WebDriver driver){
  //      Select seleccionar = new Select(driver.findElement(elemento));
   //     seleccionar.selectByVisibleText(texto);
   // }

    private By elemento;
    private String texto;
    private WebDriver driver;

    public ListaDesplegable (By elemento, String texto, WebDriver driver){
        this.elemento = elemento;
        this.texto = texto;
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
