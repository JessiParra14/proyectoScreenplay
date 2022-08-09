package com.demo.guru99.Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class CerrarVentana implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static CerrarVentana cerrar(){
        return new CerrarVentana();
    }
}
