package com.demo.guru99.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeLoginUI {

    public static final Target MSJ_LOGIN = Target.the("login exitoso").located(By.xpath("//h3[text()='Login Successfully']"));

}
