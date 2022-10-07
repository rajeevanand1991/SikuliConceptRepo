package com.youtubevideo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		Screen s = new Screen();
		Pattern searchBtnImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\GoogleSearch.png");
		s.wait(searchBtnImg, 2000); //Wait for search button image to 2 seconds
		s.click();
		
		Pattern signInImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\GoogleSignInBtn.png");
		s.wait(signInImg, 2000); //Wait for signIn button image to 2 seconds
		s.click();
	}
}
/*	Shows in Console:
  	[log] CLICK on L[723,478]@S(0) (577 msec)
  	[log] CLICK on L[1534,147]@S(0) (599 msec) */