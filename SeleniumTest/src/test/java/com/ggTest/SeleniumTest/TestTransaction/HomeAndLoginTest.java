package com.ggTest.SeleniumTest.TestTransaction;

import com.ggTest.SeleniumTest.Log4j;
import com.ggTest.SeleniumTest.main.MainPagingTest;
import com.ggTest.SeleniumTest.fixProperty.ValuesGG;
import com.ggTest.SeleniumTest.paging.HomeAndLoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static com.ggTest.SeleniumTest.fixProperty.ValuesGG.kullaniciSifre;
import static com.ggTest.SeleniumTest.fixProperty.ValuesGG.kullaniciEposta;;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HomeAndLoginTest extends MainPagingTest {
	
	HomeAndLoginPage Login;

    @BeforeAll
    public void before(){
        Log4j.info("Giriş Testi Başlatılıyor.");
        Login =new HomeAndLoginPage(getWebDriver());
        Log4j.info("Açılan Sayfa : " + ValuesGG.LinkAdress);
    }

    @Test

    public void test_login(){

        Login.logins().loginBtn();
        Log4j.info("Giriş Sayfası Açıldı");
        Login.email(kullaniciEposta);
        Log4j.info("Email Adresi Girildi :"+kullaniciEposta);
        Login.pwd(kullaniciSifre).enter();
        Log4j.info("Şifre Girildi :"+ kullaniciSifre);
        Log4j.info("Giriş başarıyla gerçekleştirildi");
    }

    @AfterAll
    public void after(){
        Log4j.info("Giriş Selenium Testi Başarıyla Tamamlanmıştır.");
        connectDown();

    }

}
