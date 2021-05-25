package com.ggTest.SeleniumTest.TestTransaction;

import com.ggTest.SeleniumTest.Log4j;
import com.ggTest.SeleniumTest.main.MainPagingTest;
import com.ggTest.SeleniumTest.fixProperty.ValuesGG;
import com.ggTest.SeleniumTest.paging.ProductTransaction;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static com.ggTest.SeleniumTest.fixProperty.ValuesGG.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ProductTransTest extends MainPagingTest {

	 ProductTransaction productTest;

	    @BeforeAll
	    public void before() {
	        Log4j.info("ProductTransTest Sayfası Başlıyor.");
	        productTest = new ProductTransaction(getWebDriver());
	        Log4j.info("Açılan Sayfa : " + ValuesGG.LinkAdress);

	    }

	    @Test
	    @Order(1)
	    public void test_search(){
	    	productTest.cookiesclose().search(searchProduct).searchClick();
	        Log4j.info("Aranan Kelime : " + searchProduct);
	    }

	    @Test
	    @Order(2)
	    public void test_chancingPage(){
	    	productTest.pageclick();
	        Log4j.info("Sayfa Numarası : 2");
	    }

	    @Test
	    @Order(3)
	    public void test_basketAndPrices(){
	    	productTest.productclick();
	        Log4j.info("Rastgele Ürün Sayfası");
	        String pricetext=productTest.getText();
	        Log4j.info("Ürün Fiyatı Çekildi");
	        if(pricetext==null){
	            Log4j.error("Ürün Fiyatı Çekilemedi");
	        }
	        productTest.addbasket();
	        Log4j.info("Ürün Sepete Eklenmiştir.");
	        productTest.gobasket();
	        Log4j.info("Sepete Yönlendir");
	        String pricetext2= productTest.getText2();
	        Assertions.assertEquals(pricetext,pricetext2,"Ürün Fiyatı Alınamadı!! 404 Not Found!! ");
	        Log4j.info("Fiyat Karşılaştırma Süreci");
	    }

	    @Test
	    @Order(4)
	    public void test_quantity(){
	        WebElement element = getWebDriver().findElement(Piece);
	        Select sel =new Select(element);
	        sel.selectByVisibleText("2");
	        Log4j.info("Ürün Sayısı 2 adet arttırıldı.");
	    }

	    @Test
	    @Order(5)
	    public void test_clearBasket(){
	    	productTest.clearbasket();
	        Log4j.info("Sepet boşaltıldı.");
	    }

	    @AfterAll
	    public void after(){
	        Log4j.info("Selenium Test Tamamlandı. Çıkış Yapılıyor...");
	        connectDown();

	    }
	    
}
