package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookies;

    @FindBy(xpath = "//a[@title='Join Now']")
    WebElement joinNowButton;

    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;

    public void acceptCookies() {
        clickOnElement(cookies);
        log.info("Accept the cookies: " + cookies.toString());
    }

    public void clickOnJoinNow(){
        clickOnElement(joinNowButton);
        log.info("Clicking on the Join now: " + joinNowButton.toString());
    }

    public void clickOnOnlineSlots() {
        clickOnElement(onlineSlots);
    }

}
