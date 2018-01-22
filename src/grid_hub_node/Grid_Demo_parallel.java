package grid_hub_node;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Demo_parallel {
	WebDriver driver;

	@Parameters({ "system" })
	@Test
	public void selenium_check(String system) throws InterruptedException {
		if (system.equalsIgnoreCase("pc1")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.105:5050/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("https://www.ebay.in/");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (system.equalsIgnoreCase("pc2")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.122:6060/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("http://sdrc.co.in/");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (system.equalsIgnoreCase("pc3")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.233:4050/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("http://www.seleniumhq.org/");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (system.equalsIgnoreCase("pc4")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.101:7676/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("https://www.microsoft.com/net/download/windows");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (system.equalsIgnoreCase("pc5")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.177:6474/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("https://cricket.yahoo.com/");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (system.equalsIgnoreCase("pc6")) {
			try {
				String nodeurl;
				nodeurl = "http://192.168.1.151:5868/wd/hub";
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				driver.get("http://www.fifa.com/");
				String title_name = driver.getTitle();
				System.out.println(title_name);
				Thread.sleep(7000l);
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		} 
	}
}
