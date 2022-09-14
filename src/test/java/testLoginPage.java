import core.OpenBrowsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.logoutPage;

public class testLoginPage {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.manage().window().maximize();
    }


    @Test
    public void firstTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        Thread.sleep(5000);
        resPage.putInfo("firas", "123");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


    }

    @Test
    public void secondTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        Thread.sleep(5000);
        resPage.putInfo("mngr438269", "zegYzyh");
        Thread.sleep(5000);
        logoutPage inPage = new logoutPage(driver);
        inPage.logOut();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

    }

    @Test
    public void thirdTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        Thread.sleep(5000);
        resPage.putInfo("", "123");
        Thread.sleep(5000);
       // resPage.getErrorMsgUserName();


    }

    @Test
    public void fourthTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        Thread.sleep(5000);
        resPage.putInfo("firas", "");
        Thread.sleep(5000);
        ///resPage.getErrorMsgUserId();



    }

    @Test
    public void fifthTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        Thread.sleep(5000);
        resPage.putInfo("", "");
        Thread.sleep(5000);
//        resPage.getErrorMsgUserName();
//        resPage.getErrorMsgUserId();



    }



    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://demo.guru99.com/V1/index.php");
    }

}