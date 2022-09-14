package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginPage {
    WebDriver driver;
    WebElement logInBtn;

    WebElement nameInput;
    WebElement passwordInput;

    WebElement useErr;



    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.passwordInput =   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        this.nameInput = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        this.logInBtn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));


    }

    public void putInfo( String useName, String password){
        try{
            this.nameInput.sendKeys(useName);
            this.passwordInput.sendKeys(password);
            this.logInBtn.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }

//    public  String  getErrorMsgUserName() {
//        String msg= "";
//
//        try{
//            useErr = driver.findElement(By.id("message18"));
//            msg = useErr.getText();
//            System.out.println(msg);
//
//
//        }catch (Exception e){
//
//        }
//        return  msg;
//
//    }
//
//    public String getErrorMsgUserId() {
//        String msg= "";
//
//        try{
//            useErr = driver.findElement(By.id("message23"));
//            msg = useErr.getText();
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        return msg;
//    }





}