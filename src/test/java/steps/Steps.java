package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

 @Given("Scenario1")
    public void scenarioOne(){
     System.out.println("scenarioOne started");
 }

 @When("Step1")
 public void stepOne(){
     System.out.println("step one passed");
 }

 @Then("Result1")
    public void reultOne(){
     System.out.println("resultOne");
 }

 @When("Step2")
    public void stepTwo(){
     System.out.println("stepTwo passed");
 }

 @Then("Result2")
    public void resultTwo(){
     System.out.println("resultTwo");
 }



}
