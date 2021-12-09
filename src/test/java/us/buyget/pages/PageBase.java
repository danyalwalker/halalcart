package us.buyget.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import us.buyget.utilities.Driver;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/collections/homemade'])[1]")
    public WebElement homemade;

    @FindBy(xpath = "(//a[@href='/collections/dairy'])[1]")
    public WebElement dairy;

    @FindBy(xpath = "(//a[@href='/collections/pantry'])[1]")
    public WebElement pantry;

    @FindBy(xpath = "(//a[@href='/collections/canned-food'])[1]")
    public WebElement cannedFood;

    @FindBy(xpath = "(//a[@href='/collections/chocolate-candy-snacks'])[1]")
    public WebElement confectionary;

    @FindBy(xpath = "(//a[@href='/collections/coffee-tea'])[1]")
    public WebElement coffeeTea;

    @FindBy(xpath = "(//a[@href='/collections/dry-fruits-nuts'])[1]")
    public WebElement dryFruitsNuts;

    @FindBy(xpath = "(//a[@href='/collections/beverages'])[1]")
    public WebElement beverages;

    @FindBy(xpath = "(//a[@href='/collections/bread-cookies-wafers'])[1]")
    public WebElement breadsPastries;

    @FindBy(xpath = "(//a[@href='/collections/brands'])[1]")
    public WebElement brands;

    @FindBy(xpath = "(//a[@href='/collections/frozen'])[1]")
    public WebElement frozen;

    @FindBy(xpath = "(//a[@href='/pages/invite'])[1]")
    public WebElement enjoyHalalCart;

    @FindBy(xpath = "//a[@href='/search']")
    public WebElement search;

    @FindBy(xpath = "//a[@href='/pages/contact']")
    public WebElement contact;

    @FindBy(xpath = "//a[@href='/policies/terms-of-service']")
    public WebElement termsOfService;

    @FindBy(xpath = "//a[@href='/policies/refund-policy']")
    public WebElement refundPolicy;

    @FindBy(xpath = "//a[@href='/policies/privacy-policy']")
    public WebElement privacyPolicy;










}
