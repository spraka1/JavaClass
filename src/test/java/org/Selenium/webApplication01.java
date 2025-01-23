package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webApplication01 {

    public static WebDriver driver;

    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement firstName;

    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement preFilledText;

    @FindBy(xpath="(//input[@type='text'])[3]")
    private WebElement placeHolderText;

    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement readOnlyText;

    @FindBy(xpath="//textarea[@id='myTextarea']")
    private WebElement myTextArea;

    @FindBy(xpath="//input[@type='range']")
    private WebElement rangeSelect;

    @FindBy(xpath="//label[@id='progressLabel']")
    private WebElement progressLabel;

    @FindBy(xpath="//select[@id='mySelect']")
    private WebElement selectDropdown;

    @FindBy(xpath="//iframe[@id='myFrame1']")
    private WebElement imageFrame;

    @FindBy(xpath="//iframe[@id='myFrame2']")
    private WebElement textFrame;

    @FindBy(xpath="//h4[text()='iFrame Text']")
    private WebElement iFrameText;

    @FindBy(xpath="(//input[@type='radio'])[1]")
    private WebElement radiobutton1;

    @FindBy(xpath="(//input[@type='radio'])[2]")
    private WebElement radiobutton2;

    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement checkBoxes;

    // Constructor to initialize page elements
    public webApplication01(WebDriver driver) {
        webApplication01.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Getter methods for elements
    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getPreFilledText() {
        return preFilledText;
    }

    public WebElement getPlaceHolderText() {
        return placeHolderText;
    }

    public WebElement getReadOnlyText() {
        return readOnlyText;
    }

    public WebElement getMyTextArea() {
        return myTextArea;
    }

    public WebElement getRangeSelect() {
        return rangeSelect;
    }

    public WebElement getProgressLabel() {
        return progressLabel;
    }

    public WebElement getSelectDropdown() {
        return selectDropdown;
    }

    public WebElement getImageFrame() {
        return imageFrame;
    }

    public WebElement getTextFrame() {
        return textFrame;
    }

    public WebElement getiFrameText() {
        return iFrameText;
    }

    public WebElement getRadiobutton1() {
        return radiobutton1;
    }

    public WebElement getRadiobutton2() {
        return radiobutton2;
    }

    public WebElement getCheckBoxes() {
        return checkBoxes;
    }
}

