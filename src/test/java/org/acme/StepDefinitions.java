package org.acme;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("I have {int} ideas in my head")
    public void i_have_n_ideas_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }


    @When("I think {int} hour")
    public void i_think_hour(Integer hours) {

    }


    @When("I wait {int} hour")
    public void i_wait_hour(Integer hours) {

    }

    @Given("I have {int} cukes in my belly")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }




    @Then("my belly should growl")
    public void my_belly_should_growl() {

    }

    @Then("my head should growl")
    public void my_head_should_growl() {

    }

}
