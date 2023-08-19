package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlots;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OnlineSlotsSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        new HomePage().acceptCookies();
    }

    @And("I click on online slots link")
    public void iClickOnOnlineSlotsLink() {
        new HomePage().clickOnOnlineSlots();
    }

    @And("I click on The Try Our Play'n Go Slots")
    public void iClickOnTheTryOurPlayNGoSlots() {
        new OnlineSlots().setClickOnTryOurPlayNGoSlot();
    }

    @Then("I can see text {string}")
    public void iCanSeeText(String result) {
        Assert.assertEquals("Verify the text Play'n Go Slots", result, new OnlineSlots().setVerifyTheTextPlaynGoSlot());
    }
}
