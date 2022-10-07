package com.youtubevideo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/watch?v=gbJPx5dlNwc"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		
		//create the object of ScreenClass - from Sikuli
		Screen s = new Screen();
		
		//settings
		Pattern settingsImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\YT_VideoSettings.jpg");
		s.wait(settingsImg, 2000); //Wait for settings image to 2 seconds
		s.click();
		
		//AutoQualityPixels
		Pattern autoImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\YT_QualityPixels.JPG");
		s.wait(autoImg, 2000); //Wait for AutoQualityPixels image to 2 seconds
		s.click();
		
		//AutoQualityPixels
		Pattern Img144P = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\YT_144Pixels.JPG");
		s.wait(Img144P, 2000); //Wait for AutoQualityPixels image to 2 seconds
		s.click();
		
		//play icon:
		Pattern playImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\YT_PlayButtonPNG.PNG");
		s.wait(playImg, 2000); //Wait for selected play image to 2 seconds
		s.click();
		s.click();
		
		//pause icon:
		Pattern pauseImg = new Pattern("E:\\eclipseWorkspace\\SikuliConceptTest\\YT_PauseButton.JPG");
		s.wait(pauseImg, 2000); //Wait for selected pause image to 2 seconds
		s.click();
		s.click();
	}
}
/*	Shows in Console:
	[log] CLICK on L[867,701]@S(0) (585 msec)
	[log] CLICK on L[981,636]@S(0) (587 msec)
	[log] CLICK on L[834,597]@S(0) (604 msec)
	[log] CLICK on L[143,700]@S(0) (1633 msec)
	[log] CLICK on L[143,700]@S(0) (130 msec)
	[log] CLICK on L[144,701]@S(0) (563 msec)
	[log] CLICK on L[144,701]@S(0) (77 msec) */