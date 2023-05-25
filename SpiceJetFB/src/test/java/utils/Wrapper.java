package utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper {
	
	
	public static WebDriver driver = null;


	@BeforeMethod
	@Parameters({ "browser" })
	public void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.spicejet.com");
		}

		else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.spicejet.com");
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.spicejet.com");
		}
	}


	public void brokenLink(String url) {

		try {
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
			httpConnection.connect();
			int respCode = httpConnection.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is broken and its responsecode is " + respCode);
				
			} else {
				System.out.println(url + " is Valid and its responsecode is " + respCode);
				
			}
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	@AfterMethod
	public void quitBrowser() {
		try {
			driver.quit();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void validateTitle(String expectedTitle) {

		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void validateText(WebElement ele, String text) {

		try {
			Assert.assertEquals(ele.getText(), text);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void typeText(WebElement ele, String text) {
		try {
			// ele.clear();
			ele.sendKeys(text);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void selectDDByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void selectDDByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void jsScrollUpAndDown(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + value + ")");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	
	public void screenShot(String ssname) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("./screenshootSP/" + ssname + ".png");

			FileUtils.copyFile(source, dest);

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void windowHandling() {
		try {
			String pWindow = driver.getWindowHandle();
			Set<String> windowHandle = driver.getWindowHandles();
			System.out.println("Parent window address : " + pWindow);

			for (String adr : windowHandle) {

				if (!(pWindow.contentEquals(adr))) {
					System.out.println("Current window address : " + adr);
					driver.switchTo().window(adr);
				}

				
			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void actionClick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.click(ele).build().perform();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void moveTo(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void doubleclick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void framesByWebElement(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void framesByDefault() {
		try {
			driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
