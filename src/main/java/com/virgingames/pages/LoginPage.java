package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//select[@name='title']")
    WebElement Title;

    @CacheLookup
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='surname']")
    WebElement surname;

    @FindBy(xpath = "//input[@id='dobYear']")
    WebElement dateOfBirthField;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement maleButton;

    @FindBy(xpath = "//button[normalize-space()='Next Step']")
    WebElement nextStepButton;
    public void enterEmailAddress(String Email) {
        sendTextToElement(email, Email);
       log.info("Enter email address: " + email.toString());
    }

    public void selectTitle(String title) {
        selectByValueFromDropDown(Title, title);
        log.info("Select from dropdown: " + Title.toString());
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
        log.info("Enter firstname : " + firstName.toString());
    }

    public void enterSurname(String Surname) {
        sendTextToElement(surname, Surname);
        log.info("Enter surname : " + surname.toString());
    }
    public void enterDateOfBirth(String dateOfBirth) {
        sendTextToElement(dateOfBirthField, dateOfBirth);
        log.info("Enter dateOfBirth : " + dateOfBirthField.toString());

    }

    public void clickOnMaleRadioButton(){
        clickOnElement(maleButton);
        log.info("Clicking on the radio button: " + maleButton.toString());
    }

    public void clickOnNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Clicking on the nextstep button: " + nextStepButton.toString());

    }
}
