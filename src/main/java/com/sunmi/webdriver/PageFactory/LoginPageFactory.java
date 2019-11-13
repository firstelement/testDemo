package com.sunmi.webdriver.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPageFactory extends LoadableComponent<LoginPageFactory>{

	private WebDriver driver;
	private String url = "";
	@FindBy(xpath = "")
	public WebElement name;
	@FindBy(xpath = "")
	public WebElement passwd;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		driver.get(url);
		
	}

	public String getPageSource() {
		
		return driver.getPageSource();
	}
	
	@Override
	protected void isLoaded() throws Error {
		//判断是否加载了正确的页面
		Assert.assertTrue(true);
	}
	
}
