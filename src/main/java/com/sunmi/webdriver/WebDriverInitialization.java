package com.sunmi.webdriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sunmi.webdriver.config.URL_Config;

public class WebDriverInitialization{
	/**
	 * @param args
	 * 初始化WebDriver
	 * @throws IOException 
	 */
	public static WebDriver setWebDriverForTask(int drivertype,String build,String name) throws WebDriverException,IOException{

		WebDriver driver = null;
		URL url = new URL(URL_Config.WebDriver_Init_URL.getUrl());
		if(drivertype==1){
			
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
		    desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		    desiredCapabilities.setCapability("name", name);
		    desiredCapabilities.setCapability("build", build);
		    desiredCapabilities.setCapability("idleTimeout",20);
		    desiredCapabilities.setCapability("screenResolution", "1920x1080");
		    driver = new RemoteWebDriver(url,desiredCapabilities);
			
			((RemoteWebDriver)driver).setFileDetector(new LocalFileDetector());
			
		}else{

			
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		    desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		    desiredCapabilities.setCapability("name", name);
		    desiredCapabilities.setCapability("build", build);
		    desiredCapabilities.setCapability("idleTimeout",20);
		    desiredCapabilities.setCapability("screenResolution", "1920x1080");
		    driver = new RemoteWebDriver(url,desiredCapabilities);
			
			((RemoteWebDriver)driver).setFileDetector(new LocalFileDetector());
		
		}
		
		driver.manage().window().maximize();
		//设置页面加载最大时长30秒
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//设置元素出现最大时长30秒  
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
        return driver;
	}

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

	}

}
