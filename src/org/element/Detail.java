package org.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detail extends Baseclass {
	public Detail() {
		PageFactory.initElements(a,this );
	}
	
	@FindBy(id="twotabsearchtextbox")
	private  WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbutton;
	
	@FindBy(name="email")
	private WebElement amzemail;
	
	@FindBy(id="ap_password")
	private WebElement amzpassword;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addcart;
	
	@FindBy(id="continue")
	private WebElement login;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;
	
	@FindBy(xpath="(//img[@class='s-image'])[4]")
	private WebElement bcaa;
	
	@FindBy(id="buy-now-button")
	private WebElement buynow;
	
	@FindBy(id="nav-cart")
	private WebElement finalcart;
	
	@FindBy(name="proceedToRetailCheckout")
	private WebElement proceedbuy;
	
	//Delivery location details
	
	public WebElement getFinalcart() {
		return finalcart;
	}

	public WebElement getProceedbuy() {
		return proceedbuy;
	}

	@FindBy(id="nav-global-location-popover-link")
	private WebElement locations;
	
	@FindBy(xpath="//a[contains(text(),'address')]")
	private WebElement addlocation;
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[5]")
	private WebElement country;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	private WebElement Fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	private WebElement Mobilenumber;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	private WebElement Pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	private WebElement Flatno;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	private WebElement Area;
	
	@FindBy(id="address-ui-widgets-landmark")
	private WebElement Landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	private WebElement Towncity;
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[6]")
	private WebElement Selectstate;
	
	@FindBy(xpath="//span[contains(text(),'my')]")
	private WebElement defaultaddress;
	
	@FindBy(id="ya-myab-plus-address-icon")
	private WebElement addaddress;
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[7]")
	private WebElement Addresstype;
	
	@FindBy(xpath="(//input[@type='submit'])[9]")
	private WebElement clickaddress;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getAmzemail() {
		return amzemail;
	}

	public WebElement getAmzpassword() {
		return amzpassword;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getBcaa() {
		return bcaa;
	}

	public WebElement getBuynow() {
		return buynow;
	}

	public WebElement getLocations() {
		return locations;
	}

	public WebElement getAddlocation() {
		return addlocation;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getFullname() {
		return Fullname;
	}

	public WebElement getMobilenumber() {
		return Mobilenumber;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getFlatno() {
		return Flatno;
	}

	public WebElement getArea() {
		return Area;
	}

	public WebElement getLandmark() {
		return Landmark;
	}

	public WebElement getTowncity() {
		return Towncity;
	}

	public WebElement getSelectstate() {
		return Selectstate;
	}

	public WebElement getDefaultaddress() {
		return defaultaddress;
	}

	public WebElement getAddaddress() {
		return addaddress;
	}

	public WebElement getAddresstype() {
		return Addresstype;
	}

	public WebElement getClickaddress() {
		return clickaddress;
	}
	
	}
