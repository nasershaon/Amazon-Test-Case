package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindElement {

    static String amazonUrl = "https://www.amazon.com/";
    static WebDriver driver;
    //Open Browser and Navigate to www.amazon.com
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        openBrowser();
    /*  mainMenu();
        signIn();
        userName();
        userNameValue();
        //passwordValue();
        continueButton();
        todaysDeal();
        bestSeller();
        customerServices();
        findAGift();
        newReleases();
        registry();
        giftCards();    */
        searchBar();
    }

    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(amazonUrl);


    }
/*
        //Open Chrome Browser and navigate to www.amazon.com and click Burger using xpath
        public static void mainMenu() throws InterruptedException {
            openBrowser();//method openBrowser();

            driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
            Thread.sleep(2000);
            driver.close();
        }
        //click on sign in button using xpath
        public static void signIn() throws InterruptedException {
            openBrowser();

            driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
            Thread.sleep(2000);
            driver.close();
        }
        public static void userName() throws InterruptedException {
            openBrowser();
            //Open Chrome Browser and navigate to www.amazon.com and click Burger using xpath
            //click on sign in button using xpath
            //Click on User name Field using xpath
            driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();//to check input field working
            Thread.sleep(2000);
            driver.close();
        }
        public static void userNameValue() throws InterruptedException {

            //Open Chrome Browser and navigate to www.amazon.com and click Burger using xpath
            //Click on User name Field using xpath
            openBrowser();
            driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bbshaon@gmail.com");
            //click on continue button
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
            Thread.sleep(2000);
            driver.close();
        }

                /*public static void passwordValue() throws InterruptedException {


                    //Open Chrome Browser and navigate to www.amazon.com and click Burger using xpath
                    //click on sign in button using xpath
                    //Click on User name Field using xpath
                    openBrowser();
                    driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bbshaon@gmail.com");
                    //click on continue button
                    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
                    //using dynamic Xpath impute data on password field
                    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456778");
                    Thread.sleep(2000);
                    driver.close();
                }*/
/*    public static void continueButton() throws InterruptedException {

        //Open Chrome Browser and navigate to www.amazon.com and click Burger using xpath
        //click on sign in button using xpath
        //Click on User name Field using xpath
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bbshaon@gmail.com");
        //click on continue button
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        //using dynamic Xpath impute data on password field
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456778");
        //using dynamic xpath click Sign-in button
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }
        //Open Browser and Check "Today's Deal" link
        public static void todaysDeal() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        Thread.sleep(3000);
        driver.close();

        }
        //Open Browser and Checking "Best Seller" link
        public static void bestSeller() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(3000);
        driver.close();
        }

    //Open Browser and Checking "Customer Services" link
    public static void customerServices() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        Thread.sleep(3000);
        driver.close();
    }
    //Open Browser and Checking "Find a Gift" link
    public static void findAGift() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(3000);
        driver.close();
    }
    //Open Browser and Checking "New Releases" link
    public static void newReleases() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(3000);
        driver.close();
    }

    //Open Browser and Checking  "Registry" link
    public static void registry() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        Thread.sleep(3000);
        driver.close();
    }
    //Open Browser and Checking "Gift Cards" link
    public static void giftCards() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        Thread.sleep(3000);
        driver.close();

    } */
    //Click on Search Bar and Type Value and click on search
    public static void searchBar() throws InterruptedException {
        openBrowser();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("fire stick 4K");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.close();
    }



}
