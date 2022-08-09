package com.demo.guru99.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demo.guru99.UserInterfaces.VuelosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Vuelos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_VUELO, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds());
        try{
            actor.attemptsTo(
                    Click.on(BTN_VUELO),
                    Click.on(RDO_OPCION_UNICA)
                    //Click.on(BTN_CONTINUAR)
            );
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }

    public static Vuelos datosVuelo(){
        return instrumented (Vuelos.class);
    }
}
