package com.ggTest.SeleniumTest.paging;

import com.ggTest.SeleniumTest.main.MainPaging;
import org.openqa.selenium.WebDriver;

import static com.ggTest.SeleniumTest.fixProperty.ValuesGG.*;

public class HomeAndLoginPage extends MainPaging{

	public HomeAndLoginPage(WebDriver driver){
        super(driver);
    }

    public HomeAndLoginPage logins(){
        click(LoginBtn);
        return this;
    }

    public HomeAndLoginPage loginBtn(){
        click(Login);
        return this;
    }

    public HomeAndLoginPage email(String username){
        reKey(EmailAdress,username);
        return this;
    }
    public HomeAndLoginPage pwd(String password){
        reKey(Passwd,password);
        return this;
    }
    public HomeAndLoginPage enter(){
        click(LoginBtnClick);
        return this;
    }
    
}
