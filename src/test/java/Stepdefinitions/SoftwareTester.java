package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	@Given("^I am \"(good|average|bad)\" tester$")
	public void i_am_tester(String testertype) {
		System.out.println(testertype);
		
	}

	@When("^I go to work$")
	public void i_go_to_work() {
		System.out.println("Work");
	}

	@And("^I \"(involve|work|mess)\" with it$")
	public void i_with_it(String worktype) {
		System.out.println(worktype);
	}

	@Then("^My boss \"(loves|forgive|hate)\" me$")
	public void my_boss_me(String bossreaction) {
		System.out.println(bossreaction);
		
	}

	

}
