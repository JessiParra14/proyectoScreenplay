package com.demo.guru99.Questions;

import com.demo.guru99.UserInterfaces.MensajeLoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogin implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {

        return MensajeLoginUI.MSJ_LOGIN.resolveFor(actor).isVisible();
    }

    public static Question validarMensaje(){
        return new ValidarLogin();
    }

}
