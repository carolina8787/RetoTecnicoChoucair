package co.com.choucair.certification.proyectobase.runners;

import co.com.choucair.certification.proyectobase.model.UTestData;
import co.com.choucair.certification.proyectobase.tasks.DataModule;
import co.com.choucair.certification.proyectobase.tasks.Entry;
import co.com.choucair.certification.proyectobase.tasks.LastModule;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static co.com.choucair.certification.proyectobase.tasks.DataModule.onThePage;
import static co.com.choucair.certification.proyectobase.tasks.LastModule.ThePage;

public class StepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Brandon wants to register on the uTest platform$")
    public void thanBrandonWantsToRegisterOnTheUTestPlatform(List<UTestData> uTestData) throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(Entry.thePage());
    }


    @When("^fill in all your personal data from the form$")
    public void fillInAllYourPersonalDataFromTheForm(List<UTestData> uTestData)
            throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(DataModule.onThePage());
        onThePage(uTestData.get(0).getFirstName(),uTestData.get(0).getLastName(),uTestData.get(0).getEmail(),
                uTestData.get(0).getBirthMonth(),uTestData.get(0).getBirthDay(),uTestData.get(0).getBirthYear(), uTestData.get(0).getLanguages());
    }

    @Then("^the system allows you to create a unique password to enter the platform$")
    public void theSystemAllowsYouToCreateAUniquePasswordToEnterThePlatform(List<UTestData> uTestData)
            throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(LastModule.ThePage());
        ThePage(uTestData.get(0).getPassword(), uTestData.get(0).getConfirmPassword());
    }
}
