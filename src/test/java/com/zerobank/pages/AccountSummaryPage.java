package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(css = ".board-header")
    private List<WebElement> accountTypes;

    public List<String> getAccountTypesTexts(){

        List<String> elementsText = BrowserUtils.getElementsText(accountTypes);
        return elementsText;
    }


}
