import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Add_Product_To_Cart extends TestBase {
/*
Test steps are as follows :
- Go to amazon web page
- Search for a product
- Select a product
- Add product to cart
- Go to cart and check
 */
HomePage homePage;

ProductsPage productsPage;

ProductDetailPage productDetailPage;

CartPage cartPage;

@Test(priority = 1)

    public void searchProduct(){
    homePage=new HomePage(driver);

    productsPage=new ProductsPage(driver);
homePage.searchBox().search("Laptop");

    Assert.assertTrue(productsPage.isOnProducts(),"Not on Products page");
}


@Test (priority = 2)

public void select_a_Product(){
    productDetailPage= new ProductDetailPage(driver);
productsPage.selectProduct(2);

Assert.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on products dteil page");
}



    @Test (priority = 3)

    public void addProductToCart(){

    productDetailPage.addToCart();
Assert.assertTrue(homePage.isProductCountup(),"Productcount did not increase ");


    }


    @Test(priority = 4)

    public void goToCart(){
cartPage=new CartPage(driver);
homePage.goToCart();
Assert.assertTrue(cartPage.checkIfProductAdded(),"Product is not added to Cart");
    }


}
