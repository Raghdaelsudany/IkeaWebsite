package Org.example.stepDefs;

import Org.example.pages.SignUpPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static Org.example.stepDefs.Hooks.driver;


public class SignUp {

    SignUpPage page = new SignUpPage();

    Faker fake = new Faker();
    SoftAssert softAssert = new SoftAssert();

    int totalPrice;
    int productPrice;



    String FName = fake.name().firstName();
    String LName = fake.name().lastName();
    String email = fake.internet().safeEmailAddress();
    String password = fake.internet().password(8,20,true,false,true);

    String fullName = fake.name().fullName();
    String phone = fake.phoneNumber().phoneNumber();
    String address = fake.address().fullAddress();
    String buildingName = fake.address().buildingNumber();

    @Given("Open URL")
    public void OpenURL(){
        System.out.println("pre condion");
    }

    @When("click on signUp Btn")
    public void clickOnSignUpBtn() {
        page.signUp.click();
    }

    @And("click on create account Btn")
    public void clickOnCreateAccountBtn() {
        page.createBtn.click();
    }

    @And("fill all fields")
    public void fillAllFields() {
        page.firstName.sendKeys(FName);
        page.lastName.sendKeys(LName);
        page.email.sendKeys(email);
        page.password.sendKeys(password);
    }

    @And("click on checkbox")
    public void clickOnCheckbox() {
        page.checkbox.click();
    }

    @And("click on create account")
    public void clickOnCreateAccount() {
        page.createAccount.click();
    }

    @And("click on Logo")
    public void click_on_logo() throws InterruptedException {
        Thread.sleep(6000);
        page.homePage.click();
    }

    @And("go to Trending categories at New lower price")
    public void go_To_Trending_Categories_At_New_Lower_Price() {
        page.trendingCategory.isDisplayed();
    }

    @And("click on Sofas")
    public void clickOnSofas() {
        page.Sofas.click();
    }


    @And("click on sort")
    public void clickOnSort() {
        page.sort.click();
        page.highToLow.click();
    }

    @And("addRandomProduct")
    public void addRandomProduct() {
        // Check if we have at least 24 products
        if (page.randomProduct.size() >= 24) {
            // Generate a random number between 0 and 23
            Random random = new Random();
            int randomIndex = random.nextInt(24);
            int i;
            for(i=0; i<=3; i++){
                page.randomProduct.get(i).click();
                page.addProduct.get(i).click();
            }
        }
    }


    @And("compare")
    public void compare() {
        int i;
        for(i=0; i<=3; i++){
            softAssert.assertEquals(page.productName.get(i).getText(),page.productNameDetails.get(i).getText());
            softAssert.assertEquals(page.productPrice.get(i).getText(),page.productPriceDetails.get(i).getText());
            productPrice = Integer.parseInt(page.productPrice.get(i).getText());
        }
    }

    @And("checkTotalPrice")
    public void checkTotalPrice() {
        totalPrice = Integer.parseInt(page.totalPrice.getText());
        softAssert.assertEquals(page.totalPrice, productPrice);
    }

    @And("Move second product in the cart to favourites")
    public void moveSecondProductInTheCartToFavourites() {
        page.moveToFavorite.click();
    }

    @And("Remove third product from the cart")
    public void removeThirdProductFromTheCart() {
        page.removeThirdProduct.click();
    }

    @And("Check out using fake data until you reach Review and Pay")
    public void checkOutUsingFakeDataUntilYouReachReviewAndPay() {
        page.checkout.click();
        page.fullName.sendKeys(fullName);
        Select Governorate = new Select (driver.findElement(By.xpath("//select[@id=\"NewAddress_AreaId\"]")));
        Governorate.selectByVisibleText("Cairo");
        Select Aria = new Select (driver.findElement(By.xpath("//select[@id=\"NewAddress_CityAreaId\"]")));
        Aria.selectByVisibleText("Fifth Settlement");
        page.emailAddress.sendKeys(email);
        page.phoneNumber.sendKeys(phone);
        page.address.sendKeys(address);
        page.buildingName.sendKeys(buildingName);
        page.Continue.click();
        page.ContinueDelivery.click();
    }
}
