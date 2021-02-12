package useinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage {
    public static final Target BTN_JOIN = Target.the("button to register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("where do we write the firtName")
            .located(By.id("firstName"));
    public static  final Target INPUT_LAST_NAME = Target.the("where  do we  write the  last name")
            .located(By.id("lastName"));
    public static  final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_MONTH_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthMonth\"]/option[2]");
    public static final Target BIRTH_DAY = Target.the("")
            .located(By.id("birthDay"));
    public static final Target BIRTH_DAY_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthDay\"]/option[13]");
    public static final Target BIRTH_YEAR = Target.the("")
            .located(By.id("birthYear"));
    public static final Target BIRTH_YEAR_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthYear\"]/option[11]");





   // public static  final Target INPUT_MONTH_OF_BIRTH = Target.the("where  do we  write the month of birth")
     //       .locatedBy("//*[@id'birthMonth']/option[contains(text(),'{0}')]");
    //public static  final Target INPUT_DAY_OF_BIRTH = Target.the("where  do we  write the day of the birth")
      //      .locatedBy("//*[@id'birthDay']/option[contains(text(),'{0}')]");
    //public static  final Target INPUT_YEAR_OF_BIRTH = Target.the("where  do we  write the year of birth")
     //       .locatedBy("//*[@id'birthYear']/option[contains(text(),'{0}')]");

    public static final Target BUTTON_NEXT_LOCATION = Target.the("")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span");

    public static final Target CITY = Target.the("")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("next")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target OPERATIVE_SYSTEM = Target.the("Operative System")
            .locatedBy("//span[@class='ui-select-choices-row-inner']/div[contains(text(),'{0}')]");
    public static final Target VERSION_OPERATIVE_SYSTEM = Target.the("version Operative System")
            .locatedBy("//span[@class='ui-select-match-text pull-left ui-select-allow-clear'][contains(text(),'{0}')]");
    public static final Target LANGUAGE = Target.the("language")
            .locatedBy("//span[@class='ui-select-placeholder.text-muted'][contains(text(),'{0}')]");



    public static final Target INPUT_PHONE =
            Target.the("box Phone").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target LST_PHONE =
            Target.the("list phone").locatedBy ("//div[contains(text(),'{0}')]");

    public static final Target INPUT_MODEL =
            Target.the("box model").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));

    public static final Target LST_MODEL =
            Target.the("List model").locatedBy ("//div[contains(text(),'{0}')]");

    public static final Target INPUT_SO =
            Target.the(" SO").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target LST_SO =
            Target.the(" SO").locatedBy ("//div[contains(text(),'{0}')]");




    public static final Target BUTTON_NEXT_LAST_SETUP = Target.the("button next last setup")
            .located(By.xpath("//*[class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("password user")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("confirm password user")
            .located(By.id("confirmPassword"));
    public static final Target CODE_CONDUCT = Target.the("where do we write the code_conduct")
            .located(By.id("termOfUse"));
    public static final Target SECURITY_POLICY = Target.the("where do we write the security policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_FINISH = Target.the("Complete Login")
            .located(By.id("laddaBtn"));




}
