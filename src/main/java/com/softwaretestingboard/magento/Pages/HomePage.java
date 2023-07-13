package com.softwaretestingboard.magento.Pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");//1.1
    By tops = By.xpath("//a[@id='ui-id-9']");//1.2
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");//1.3
    By menMenu = By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    By menBottoms = By.cssSelector("#ui-id-18 span");
    By menPants = By.cssSelector("#ui-id-23 span");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By begs = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverToMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToMenTops() {
        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(menPants);
    }

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void mouseHOverOnGearManu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        mouseHoverToElementAndClick(begs);
    }

}
