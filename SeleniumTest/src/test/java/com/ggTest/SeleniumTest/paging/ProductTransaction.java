package com.ggTest.SeleniumTest.paging;

import com.ggTest.SeleniumTest.main.MainPaging;
import org.openqa.selenium.WebDriver;
import static com.ggTest.SeleniumTest.fixProperty.ValuesGG.*;


import com.ggTest.SeleniumTest.paging.ProductTransaction;

public class ProductTransaction extends MainPaging {

	 public ProductTransaction(WebDriver driver) {

	        super(driver);
	    }
	    public ProductTransaction search(String product){
	        reKey(Start,product);
	        return this;
	    }
	    public ProductTransaction searchClick() {
	        click(Search);
	        return this;
	    }
	    public ProductTransaction pageclick(){
	        click(Paging);
	        return this;
	    }
	    public ProductTransaction productclick(){
	        click(RandomSearchProduct);
	        return this;
	    }
	    public ProductTransaction cookiesclose(){
	        click(Cache);
	        return this;
	    }
	    public String getText(){
	        return getText(ProductPrice);
	    }
	    public ProductTransaction addbasket(){
	        click(AddProductBasket);
	        return this;
	    }
	    public ProductTransaction gobasket(){
	        click(NextBasket);
	        return this;
	    }
	    public String getText2(){
	        return getText(ProductBasket_Price);
	    }
	    public ProductTransaction clearbasket(){
	        click(DeleteBasket);
	        return this;
	    }
	    
}
