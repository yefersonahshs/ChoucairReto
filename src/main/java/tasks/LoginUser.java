package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import interactions.Wait;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import useinterface.UTestLoginPage;

import static useinterface.UTestLoginPage.INPUT_MODEL;
import static useinterface.UTestLoginPage.INPUT_SO;

public class LoginUser implements Task {
    private String name;
    private String last_name;
    private String email;
    private String month_of_birth;
    private String day_birth;
    private String year_birth;
    private String city;
    private String postal_code;
    private String phone;
    private String model_phone;
    private String language;
    private String operative_system;
    private String version_operative_system;
    private String password;
    private String password_confirmation;


    public LoginUser(String name, String last_name, String email, String month_of_birth, String day_birth, String year_birth, String city, String postal_code,String phone,
            String model_phone, String language, String operative_system, String version_operative_system, String password, String password_confirmation) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.month_of_birth = month_of_birth;
        this.day_birth = day_birth;
        this.year_birth = year_birth;
        this.city=city;
        this.postal_code=postal_code;
        this.phone=phone;
        this.model_phone=model_phone;
        this.language = language;
        this.operative_system = operative_system;
        this.version_operative_system = version_operative_system;
        this.password = password;
        this.password_confirmation = password_confirmation;
    }

    private UTestLoginPage uTestLoginPage;

    public static LoginUser onThePage(String name, String last_name, String email, String month_of_birth, String day_birth, String year_birth,String city, String postal_code, String phone,String model_phone, String language,
                                      String operative_system, String version_operative_system, String password, String password_confirmation){
    return Tasks.instrumented(LoginUser.class, name,  last_name, email,  month_of_birth, day_birth,  year_birth,city, postal_code,phone,model_phone ,language,  operative_system,  version_operative_system,password,password_confirmation);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.BTN_JOIN),
                 Enter.theValue(name).into(uTestLoginPage.INPUT_NAME),
                Enter.theValue(last_name).into(uTestLoginPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(uTestLoginPage.INPUT_EMAIL),


                Click.on(uTestLoginPage.BIRTH_MONTH),
                Click.on(uTestLoginPage.BIRTH_MONTH_LIST),
                Click.on(uTestLoginPage.BIRTH_DAY),
                Click.on(uTestLoginPage.BIRTH_DAY_LIST),
                Click.on(uTestLoginPage.BIRTH_YEAR),
                Click.on(uTestLoginPage.BIRTH_YEAR_LIST),



                Click.on(uTestLoginPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(uTestLoginPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(uTestLoginPage.CITY),
                Hit.the(Keys.TAB).into(uTestLoginPage.CITY),
                Enter.theValue(postal_code).into(uTestLoginPage.POSTAL_CODE),

                Click.on(uTestLoginPage.BUTTON_NEXT_DEVICES),
                Click.on(uTestLoginPage.OPERATIVE_SYSTEM),
                Click.on(uTestLoginPage.VERSION_OPERATIVE_SYSTEM),
                Click.on(uTestLoginPage.LANGUAGE),

                Click.on(uTestLoginPage.INPUT_PHONE),
                Click.on(uTestLoginPage.LST_PHONE.of(phone)),
                Click.on(INPUT_MODEL),
                Click.on(uTestLoginPage.LST_MODEL.of(model_phone)),
                Click.on(INPUT_SO),
                Click.on(uTestLoginPage.LST_SO.of(operative_system)),

                Click.on(uTestLoginPage.BUTTON_NEXT_LAST_SETUP),
                Enter.theValue(password).into(uTestLoginPage.INPUT_PASSWORD),
                Enter.theValue(password_confirmation).into(uTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(uTestLoginPage.CODE_CONDUCT),
                Click.on(uTestLoginPage.SECURITY_POLICY),
                Click.on(uTestLoginPage.BUTTON_FINISH));



    }
}
