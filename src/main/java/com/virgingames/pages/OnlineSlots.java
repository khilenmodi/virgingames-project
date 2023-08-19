package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlots extends Utility {

    private static final Logger log = LogManager.getLogger(OnlineSlots.class.getName());

    public OnlineSlots() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/uk/play-n-go-slots']")
    WebElement clickOnTryOurPlayNGoSlot;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),\"Play'n GO Slots\")]")
    WebElement verifyTheTextPlaynGoSlot;

    public void setClickOnTryOurPlayNGoSlot(){
        clickOnElement(clickOnTryOurPlayNGoSlot);
    }

    public String setVerifyTheTextPlaynGoSlot(){
        return getTextFromElement(verifyTheTextPlaynGoSlot);
    }


}
