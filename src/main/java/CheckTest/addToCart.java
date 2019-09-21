package CheckTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;
import java.io.IOException;

/****************************
 * Created by faisal.kauser
 ****************************/

public class addToCart extends BasePage {
    public addToCart() throws IOException {
        super();
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("*******************");


        getDriver().get("http://automationpractice.com/index.php?id_product=4&controller=product");
        WebDriverWait wait = new WebDriverWait(driver, 3);

        // Avoid xpath if possible
        // driver.findElement(By.xpath(".//*[text()='Add to cart']")).click();
        WebElement addToCard  =  wait.until(ExpectedConditions.elementToBeClickable(By.id("add_to_cart")));
        addToCard.click();
        // Avoid xpath if possible
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[contains(@title,'Proceed to checkout')]"))).click();
       WebElement proceedToCheckOut = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-default.button.button-medium")));
       proceedToCheckOut.click();

        WebElement removeItem  =  wait.until(ExpectedConditions.elementToBeClickable(By.className("cart_quantity_delete")));
       removeItem.click();

        driver.quit();


    }

}// class
