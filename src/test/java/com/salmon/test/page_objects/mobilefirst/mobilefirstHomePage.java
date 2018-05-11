package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import java.util.List;

public class mobilefirstHomePage extends PageObject {

   public String searchcriteria;

   private By search = By.cssSelector("input[name='q']");
   private By confirmButton = By.cssSelector(".affirm.btn.btn-primary");
   private By consentWIndow = By.cssSelector("div[class='modal-header']");
   private By menuOption = By.cssSelector("button[class='navbar-toggler d-md-none']");
   private By searchResult = By.cssSelector("a[class='link']");

   public void confirmConsentWindow() {
      webDriver.switchTo().defaultContent();
      waitForExpectedElement(confirmButton).click();
   }

   public void clickMenuOption(){
      waitForExpectedElement(menuOption).click();
   }

   public void search(String searchcriteria){
      this.searchcriteria = searchcriteria;
      waitForExpectedElement(search).sendKeys(searchcriteria);
      Actions actions = new Actions(webDriver);
      actions.keyDown(Keys.ENTER).build().perform();
   }

   public boolean getSearchResults(){

      List<WebElement>productList = webDriver.findElements(searchResult);

      for (WebElement ls:productList){

         if(ls.getText().contains(searchcriteria)){
            return true;
         }
      }
      return false;
   }



}


