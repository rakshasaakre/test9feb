package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupWebDriver {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeClass
	public static void setup() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(
					"I:\\Learnings\\Raksha\\HCLTech\\Automationteststore\\src\\test\\resources\\config\\config.properties");
			prop.load(fr);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

	}

	@AfterClass
	public void tearDown() {

	}
}
