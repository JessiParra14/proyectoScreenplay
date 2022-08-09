package com.demo.guru99.UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeVuelosUI {

    public static final Target MSJ_VUELOS = Target.the("mensaje vuelos no disponibles").located(By.xpath("//p[@align='left']"));

}
