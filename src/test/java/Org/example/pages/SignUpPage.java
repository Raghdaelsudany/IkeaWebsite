package Org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static Org.example.stepDefs.Hooks.driver;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }


    //Locators

    @FindBy(xpath = "//a[@href=\"https://www.ikea.com/eg/en/profile/login/\"]")
    public WebElement signUp;

    @FindBy(xpath = "//button[@class=\"skapa-mvagent-wrapper-prefix-btn skapa-mvagent-wrapper-prefix-btn--secondary skapa-mvagent-wrapper-prefix-btn--fluid\"]")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@name=\"checkboxname\"]")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@class=\"pp-skapa__btn pp-skapa__btn--primary pp-skapa__btn--fluid sign-up-content-right_createAccount__Jwuq1\"]")
    public WebElement createAccount;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/global/assets/logos/brand/ikea.svg\"]")
    public WebElement homePage;

    @FindBy(xpath = "//article[@class=\"gd8xc1c vdrm3z7 v18by0fb\"]/section[3]/div/div/section/div/div/div/h2")
    public WebElement trendingCategory;

    @FindBy(xpath = "//article[@class=\"gd8xc1c vdrm3z7 v18by0fb\"]/section[3]/div/div/section/div/div/div/div/div/div/div/div/div/div[1]/div/div/a")
    public WebElement Sofas;

    @FindBy(xpath = "//div[@class=\"plp-filter-bar__options\"] button:nth-child(1)")
    public WebElement sort;

    @FindBy(xpath = "//div[@class=\"plp-drop-down\"] label:nth-child(4)")
    public WebElement highToLow;

    @FindBy(xpath = "//div[@class=\"plp-product-list__products \"] div[class=\"plp-fragment-wrapper\"]")
    public List<WebElement> randomProduct;

    @FindBy(xpath = "//button[@class=\"plp-btn plp-btn--small plp-btn--icon-emphasised\"]")
    public List<WebElement> addProduct;

    @FindBy(xpath = "//div[@class=\"CartItem_info__X1ZBo\"]/div/div[1]/div[2]/span[1]")
    public List<WebElement> productName;

    @FindBy(xpath = "//span[@class=\"pip-header-section__title--big notranslate\"]")
    public List<WebElement> productNameDetails;

    @FindBy(xpath = "//div[@class=\"skapa-wrapper-prefix-price-module__price\"]/div/span")
    public List<WebElement> productPrice;

    @FindBy(xpath = "//div[@class=\"pip-temp-price-module__primary-currency-price\"]/span[1]/span[1]/span[1]")
    public List<WebElement> productPriceDetails;

    @FindBy(xpath = "//div[@class=\"Summary_receipt__d7Qzo\"]/div[2]/span[2]/span/span/span[2]")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div[2]/div/div/div/div[2]/button[2]")
    public WebElement moveToFavorite;

    @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div[3]/div/div/div/div[2]/button[1]")
    public WebElement removeThirdProduct;

    @FindBy(xpath = "//button[@class=\"skapa-wrapper-prefix-btn skapa-wrapper-prefix-btn--emphasised skapa-wrapper-prefix-btn--fluid  skapa-wrapper-prefix-noOutline\"]")
    public WebElement checkout;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]")
    public WebElement fullName;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[7]/input[1]")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@class=\"form-control input-lg-4 directionLTR\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[10]/input[1]")
    public WebElement address;

    @FindBy(xpath = "//input[@placeholder=\"Building Name/Apartment No./Floors No.\"]")
    public WebElement buildingName;

    @FindBy(xpath = "//button[@id=\"billingSubmitButton\"]")
    public WebElement Continue;

    @FindBy(xpath = "//button[@id=\"deliveryAndAssemblyContinue\"]")
    public WebElement ContinueDelivery;

































}
