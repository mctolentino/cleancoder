package cukes

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import static org.junit.Assert.assertEquals

class MyStepdefs {

    int myCukes

    @Given("I have (\\d+) cukes in my belly")
    void I_have_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
        myCukes = cukes
    }

    @When("fill my belly with (\\d+) cukes")
    void setCukesValue(int cukes) {
        myCukes = cukes
    }

    @Then("there are (\\d+) cukes in my belly")
    void verifyCukesInMyBelly(int numberOfCukes) {
        assertEquals(numberOfCukes, myCukes)
    }
}