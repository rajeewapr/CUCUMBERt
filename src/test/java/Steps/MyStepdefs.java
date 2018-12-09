package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class MyStepdefs {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable{
        System.out.println("rajeewa\n");
        System.out.println("abcad");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable{
        System.out.println("kawadada");

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("jeewa");
    }


    @And("^i enter the following Login$")
    public void iEnterTheFollowingLogin(DataTable table) {


        List<List<String>> data= table.raw();
        System.out.println("The value is :" +data.get(0).get(0));
        System.out.println("The value is:" +data.get(0).get(1));
    }
}
