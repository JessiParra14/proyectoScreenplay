package com.demo.guru99.Tasks;

import com.demo.guru99.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import static com.demo.guru99.UserInterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx", "Login", 1, 0)).into(TXT_USUARIO),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx", "Login", 1, 1)).into(TXT_CLAVE),
                    WaitUntil.the(BTN_INGRESAR, isVisible()),
                    Click.on(BTN_INGRESAR)
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Login informacion(){
        return instrumented (Login.class);
    }
}
