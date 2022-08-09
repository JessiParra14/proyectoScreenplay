package com.demo.guru99.UserInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VuelosUI {

    public static final Target BTN_VUELO = Target.the("Click en vuelos").located(By.xpath("//a[text()='Flights']"));
    public static final Target RDO_OPCION_UNICA = Target.the("Seleccionar opcion unica").located(By.xpath("//input[@value='oneway']"));
    public static final Target LST_PASAJEROS = Target.the("Ingresar pasajeros").located(By.name("passCount"));
    public static final Target BTN_CONTINUAR = Target.the("Buscar vuelos").located(By.name("findFlights"));

}
