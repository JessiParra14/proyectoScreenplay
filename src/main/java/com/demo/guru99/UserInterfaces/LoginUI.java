package com.demo.guru99.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class LoginUI extends PageObject {

    public static final Target TXT_USUARIO = Target.the("Ingresar el usuario").located(By.name("userName"));
    public static final Target TXT_CLAVE = Target.the("Ingresar la clave").located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("Click ingresar").located(By.name("submit"));
}
