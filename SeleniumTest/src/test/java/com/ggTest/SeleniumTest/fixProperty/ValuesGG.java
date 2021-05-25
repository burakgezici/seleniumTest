package com.ggTest.SeleniumTest.fixProperty;

import org.openqa.selenium.By;

public class ValuesGG {

	public static final String LinkAdress ="https://www.gittigidiyor.com/";
	public static final String searchProduct ="Bilgisayar";
    public static final String kullaniciEposta ="burakgezici333@gmail.com";
    public static final String kullaniciSifre ="lorenz35";
    public static final By Start = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    public static final By Search = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]");
    public static final By RandomSearchProduct= By.className("img-cont");
    public static final By LoginBtnClick= By.xpath(("//input[@id='gg-login-enter']"));
    public static final By Paging= By.xpath("//a[contains(text(),'2')]");
    public static final By NextBasket= By.xpath("//a[contains(text(),'Sepete Git')]");
    public static final By Cache=By.className("tyj39b-3");
    public static final By ProductBasket_Price=By.className("new-price");
    public static final By Piece= By.xpath("//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/select[1]");
    public static final By DeleteBasket= By.className("btn-delete");
    public static final By Login = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    public static final By ProductPrice=By.id("sp-price-discountPrice");
    public static final By AddProductBasket= By.xpath("//button[@id='add-to-basket']");
    public static final By LoginBtn= By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final By EmailAdress= By.xpath("//input[@id='L-UserNameField']");
    public static final By Passwd= By.xpath("//input[@id='L-PasswordField']");
 
   
}
