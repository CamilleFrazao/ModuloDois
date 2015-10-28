package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroProduto {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/home/camille/Downloads/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "http://localhost:8080/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCadastroLol() throws Exception {
        
        
        
        driver.get(baseUrl + "/ModuloDois/");
        driver.findElement(By.linkText("Cadastrar")).click();
        driver.findElement(By.name("campoCadastroID")).clear();
        driver.findElement(By.name("campoCadastroID")).sendKeys(     );
        driver.findElement(By.name("campoCadastroNome")).clear();
        driver.findElement(By.name("campoCadastroNome")).sendKeys("exemplo");
        driver.findElement(By.name("campoCadastroQuantidade")).clear();
        driver.findElement(By.name("campoCadastroQuantidade")).sendKeys("78");
        driver.findElement(By.name("campoCadastroUnidade")).clear();
        driver.findElement(By.name("campoCadastroUnidade")).sendKeys("78");
        driver.findElement(By.name("campoCadastroValor")).clear();
        driver.findElement(By.name("campoCadastroValor")).sendKeys("20.32");
        driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}