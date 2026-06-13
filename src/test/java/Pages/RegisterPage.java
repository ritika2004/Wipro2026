package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

   
    By Name = By.name("name");
    By Company = By.name("company");
    By Email = By.name("email");
    By Password = By.name("password");
    By ConfirmPassword = By.name("password_confirmation");
    By btnRegister = By.xpath("//button[@type='submit']");

   
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    

    public void enterName(String name) {
        driver.findElement(Name).sendKeys(name);
    }

    public void enterCompany(String company) {
        driver.findElement(Company).sendKeys(company);
    }

    public void enterEmail(String email) {
        driver.findElement(Email).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(btnRegister).click();
    }
}