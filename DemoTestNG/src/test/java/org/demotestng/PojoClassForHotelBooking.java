package org.demotestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassForHotelBooking extends BaseClassforHostelBookingUsingDataDriven {

	public PojoClassForHotelBooking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement bntlogin;

	@FindBy(id="location")
	private WebElement locationselect;
	@FindBy(id="hotels")
	private WebElement selecthotels;
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	public WebElement getCheckindate() {
		return checkindate;
	}
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;

	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement selectchildRomms;
	@FindBy(id="Submit")
	private WebElement submitbnt;
	@FindBy(id="radiobutton_0")
	private WebElement radionbnt;

	@FindBy(id="continue")
	private WebElement continuebnt;	
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="cc_exp_month")
	private WebElement ccexponths;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id="cc_cvv")
	private WebElement CCVV;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(id="order_no")
	private WebElement OrderNo;
	
	
	
	
	
	public WebElement getOrderNo() {
		return OrderNo;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getCCVV() {
		return CCVV;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCcexponths() {
		return ccexponths;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCCtype() {
		return CCtype;
	}

	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnumber;
	@FindBy(id="cc_type")
	private WebElement CCtype;








	public WebElement getAddress() {
		return address;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getContinuebnt() {
		return continuebnt;
	}

	public WebElement getRadionbnt() {
		return radionbnt;
	}

	public WebElement getSubmitbnt() {
		return submitbnt;
	}

	public WebElement getSelectchildRomms() {
		return selectchildRomms;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getSelectRoomNoS() {
		return selectRoomNoS;
	}

	@FindBy(id="room_nos")
	private WebElement selectRoomNoS;


	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelecthotels() {
		return selecthotels;
	}

	public WebElement getLocationselect() {
		return locationselect;
	}

	public WebElement getBntlogin() {
		return bntlogin;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

}
