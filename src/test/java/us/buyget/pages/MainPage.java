package us.buyget.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import us.buyget.utilities.Driver;

public class MainPage extends PageBase {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href=\"/collections/50-off\"])[1]")
    public WebElement discount50Header;

    @FindBy(xpath = "(//a[@href=\"/collections/50-off\"])[2]")
    public WebElement discount50View;

    @FindBy(xpath = "(//a[@href=\"/collections/nema\"])[1]")
    public WebElement nemaDiscount2_1Header;

    @FindBy(xpath = "(//a[@href=\"/collections/nema\"])[2]")
    public WebElement nemaDiscount2_1View;

    @FindBy(xpath = "(//a[@href='/collections/meat'])[1]")
    public WebElement freshHalalMeatHeader;

    @FindBy(xpath = "(//a[@href='/collections/meat'])[2]")
    public WebElement freshHalalMeatView;

    @FindBy(xpath = "(//a[@href='/collections/best-selling'])[1]")
    public WebElement bestSellingHeader;

    @FindBy(xpath = "(//a[@href='/collections/best-selling'])[2]")
    public WebElement bestSellingView;

    @FindBy(xpath = "(//a[@href='/collections/homemade'])[2]")
    public WebElement homemadeHeader;

    @FindBy(xpath = "(//a[@href='/collections/homemade'])[3]")
    public WebElement homemadeView;

    @FindBy(xpath = "(//a[@href='/collections/dairy'])[2]")
    public WebElement dairyHeader;

    @FindBy(xpath = "(//a[@href='/collections/dairy'])[3]")
    public WebElement dairyView;

    @FindBy(xpath = "(//a[@href='/collections/deli-meat'])[2]")
    public WebElement deliMeatHeader;

    @FindBy(xpath = "(//a[@href='/collections/deli-meat'])[3]")
    public WebElement deliMeatView;

    @FindBy(xpath = "(//a[@href='/collections/pantry'])[2]")
    public WebElement pantryHeader;

    @FindBy(xpath = "(//a[@href='/collections/pantry'])[3]")
    public WebElement pantryView;

    @FindBy(xpath = "(//a[@href='/collections/beverages'])[2]")
    public WebElement beveragesHeader;

    @FindBy(xpath = "(//a[@href='/collections/beverages'])[3]")
    public WebElement beveragesView;

    @FindBy(xpath = "(//a[@href='/collections/chocolate-candy-snacks'])[2]")
    public WebElement cccSnacksHeader;

    @FindBy(xpath = "(//a[@href='/collections/chocolate-candy-snacks'])[3]")
    public WebElement cccSnacksView;

    @FindBy(xpath = "(//a[@href='/collections/coffee-tea'])[2]")
    public WebElement coffeeTeaHeader;

    @FindBy(xpath = "(//a[@href='/collections/coffee-tea'])[3]")
    public WebElement coffeeTeaView;

    @FindBy(xpath = "(//a[@href='/collections/dry-fruits-nuts'])[2]")
    public WebElement fruitNutHeader;

    @FindBy(xpath = "(//a[@href='/collections/dry-fruits-nuts'])[3]")
    public WebElement fruitNutView;

    @FindBy(xpath = "(//a[@href='/collections/bread-cookies-wafers'])[2]")
    public WebElement breadPastriesHeader;

    @FindBy(xpath = "(//a[@href='/collections/bread-cookies-wafers'])[3]")
    public WebElement breadPastriesView;

    @FindBy(xpath = "(//a[@href='/collections/frozen'])[2]")
    public WebElement frozenHeader;

    @FindBy(xpath = "(//a[@href='/collections/frozen'])[3]")
    public WebElement frozenView;





}
