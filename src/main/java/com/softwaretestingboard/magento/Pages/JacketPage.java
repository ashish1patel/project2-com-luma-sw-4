package com.softwaretestingboard.magento.Pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class JacketPage extends Utility {


    By sort = By.xpath("(//select[@id='sorter'])[1]");

    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sort, filter);
    }
}
