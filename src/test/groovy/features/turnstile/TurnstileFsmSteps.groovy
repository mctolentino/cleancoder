package features.turnstile

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class TurnstileFsmSteps {

    @Given("the turnstile is locked")
    void lock() {
    }

    @Given("the turnstile is unlocked")
    void unlock() {
    }

    @When("a passenger inserts a coin")
    void insertCoin() {
    }

    @Then("a passenger passes through")
    void passThrough() {
    }

    @Then("the passenger should be able to pass through")
    void canPassThrough() {
    }

    @Then("a thank you prompt is displayed")
    void displayThanks() {
    }

    @Then("sound the alarm")
    void soundAlarm() {
    }



}
