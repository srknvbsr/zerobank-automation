package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefs {
    AccountActivityPage accountActivityPage = new AccountActivityPage();



    @Then("Validate that user is on the account activity page")
    public void validate_that_user_is_on_the_account_activity_page() {
        String actual = Driver.get().getTitle();
        String expected = "Zero - Account Activity";
        Assert.assertEquals(expected, actual);
    }

    @Then("Validate the default option in drop down menu is Savings")
    public void validate_the_default_option_in_drop_down_menu_is_savings() {
        String actual = accountActivityPage.getDefaultSelectedElementText();
        String expected = "Savings";
        Assert.assertEquals(expected,actual);

    }

    @Then("Validate that dropdown menu has followings")
    public void validate_that_dropdown_menu_has_followings(List<String> expected) {
        List<String> actual= accountActivityPage.getAllTextsInDropDownMenu();
        Assert.assertEquals(expected,actual);


    }

    @Then("Validate that columns have following")
    public void validate_that_columns_have_following(List<String> expected) {
        List<String>actual = accountActivityPage.getColumnNames();
        Assert.assertEquals(expected,actual);

    }
}