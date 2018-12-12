package org.anupam.bddframework.bddframework.Pages;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component("LoginPHPTravellers")
@Data
public class LoginPHPTravellers extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/a")
    private WebElementFacade loginIcon;

    @FindBy(id = "inputEmail")
    private WebElementFacade userNameTextBox;

    @FindBy(name = "password")
    private WebElementFacade passwordTextBox;

    @FindBy(id = "login")
    private WebElementFacade loginButton;

    public void clickLoginIcon(){
        loginIcon.click();
    }

    public void enterUsername(String userName){
        userNameTextBox.sendKeys(userName);
    }

    public void enterPassword(String userName){
        passwordTextBox.sendKeys(userName);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
