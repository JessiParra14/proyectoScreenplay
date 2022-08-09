package com.demo.guru99.Questions;

import com.demo.guru99.UserInterfaces.MensajeVuelosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarVuelos implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return MensajeVuelosUI.MSJ_VUELOS.resolveFor(actor).isVisible();
    }

    public static Question validarMensajeVuelo(){
        return new ValidarVuelos();
    }

}
