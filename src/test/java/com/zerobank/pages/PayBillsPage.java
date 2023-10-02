package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage {
    @FindBy(css = "#sp_amount")
    private WebElement amountInputBox;

    @FindBy(css = "#sp_date")
    private WebElement dateInputBox;

    @FindBy(css = "#sp_description")
    private WebElement descriptionBox;

    @FindBy(css = "#pay_saved_payees")
    private WebElement payBtn;

    @FindBy(css = "div#alert_content>span")
    private WebElement succesMessage;



    public void sendAmount(String str) {
        BrowserUtils.sendKeys(amountInputBox,str);

    }

    public void sendDate(String str){
        BrowserUtils.sendKeys(dateInputBox,str);
    }

    public void sendDescription(String str){
        BrowserUtils.sendKeys(descriptionBox,str);
    }

    public void tapOnPayButton(){
        BrowserUtils.clickWithJS(payBtn);
    }

    public String getSuccesMessageText(){
       return BrowserUtils.getText(succesMessage);
    }

}


