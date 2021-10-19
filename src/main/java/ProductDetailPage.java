import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage
{
    By addToCartButtonlocator=By.id("add-to-cart-button");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }


    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonlocator);
    }


    public void addToCart() {
    }
}
