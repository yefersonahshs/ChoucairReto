package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UserInformation;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.LoginUser;
import tasks.OpenUp;


import java.util.List;
public class UtestStepDefinitions {

     @Before
     public void setStage(){
         OnStage.setTheStage(new OnlineCast());
     }


    @Given("^than Estiven want to know the sities uTest$")
    public void thanEstivenWantToKnowTheSitiesUTest() {
        OnStage.theActorCalled("Estiven").wasAbleTo(OpenUp.ThePage());

    }


    @When("^entering the data  from the uTest Resgistration form$")
    public void enteringTheDataFromTheUTestResgistrationForm(List<UserInformation> userInformation) throws  Exception{
          OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.onThePage(userInformation.get(0).getName(),
                  userInformation.get(0).getLast_name(),userInformation.get(0).getEmail(),userInformation.get(0).getMonth_of_birth(),
                  userInformation.get(0).getDay_birth(),userInformation.get(0).getYear_birth(),userInformation.get(0).getCity(),userInformation.get(0).getPostal_code() , userInformation.get(0).getPhone(), userInformation.get(0).getModel_phone(), userInformation.get(0).getOperative_system(),
                  userInformation.get(0).getVersion_operative_system(),userInformation.get(0).getLanguage(),
                  userInformation.get(0).getPassword(),userInformation.get(0).getPassword_confirmation()));
    }

    @Then("^he Know the funcionalities of the uTest$")
    public void heKnowTheFuncionalitiesOfTheUTest(List<UserInformation> userInformation)throws  Exception {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(userInformation.get(0).getWelcome())));

    }

}
