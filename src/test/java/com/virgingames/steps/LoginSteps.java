package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am homepage")
    public void iAmHomepage() {
        System.out.println("I am on Homepage");
    }

    @When("I accept the cookies")
    public void iAcceptTheCookies() {
        new HomePage().acceptCookies();
    }

    @And("I click on JoinNow")
    public void iClickOnJoinNow() {
        new HomePage().clickOnJoinNow();
    }

    @And("I enter email {string}")
    public void iEnterEmail(String Email) {
        new LoginPage().enterEmailAddress(Email);
    }

    @And("I select Title {string}")
    public void iSelectTitle(String title) {
        new LoginPage().selectTitle(title);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstname) {
        new LoginPage().enterFirstName(firstname);
    }

    @And("I enter surname {string}")
    public void iEnterSurname(String Surname) {
        new LoginPage().enterSurname(Surname);
    }

    @And("I enter Date of Birth in {string}")
    public void iEnterDateOfBirthIn(String dateOfBirth) {
        new LoginPage().enterDateOfBirth(dateOfBirth);
    }

    @And("I click on Male button")
    public void iClickOnMaleButton() {
        new LoginPage().clickOnMaleRadioButton();
    }

    @And("I click on Next Step button")
    public void iClickOnNextStepButton() {
        new LoginPage().clickOnNextStepButton();
    }

    @Then("I should able to see the text join successfully")
    public void iShouldAbleToSeeTheTextJoinSuccessfully() {
    }


}
