package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutPage {
    WebElement logOutBtn;

    public logoutPage(WebDriver driver) {
        this.logOutBtn = driver.findElement(By.linkText("Log out"));
    }

    public void logOut(){
        this.logOutBtn.click();

    }
}
