package com.sunmi.webdriver.config;

public enum URL_Config {  
	WebDriver_Init_URL("http://swt-za.uat.sunmi.com/wd/hub"),
	Mysql_DB_URL("jdbc:mysql://192.168.3.8:3306/");
	
    private String url;  
	private URL_Config(String url) {  
        this.url = url;  
    } 
    public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
