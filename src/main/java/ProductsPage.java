import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

By shippingOptionLocator=By.id("climatePledgeFriendlyRefinements");
By productNamelocator=new By.ByClassName("a-section aok-relative s-image-fixed-height");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public boolean isOnProducts() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement>getAllProducts(){
      return   findAll(productNamelocator);
    }
}
