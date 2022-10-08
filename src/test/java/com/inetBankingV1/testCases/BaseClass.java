package com.inetBankingV1.testCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.inetBankingV1.utilities.ReadConfig;

public class BaseClass{

	

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String Username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public static WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setUp(@Optional String br) {

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.firefoxpath());
			driver = new FirefoxDriver();

		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getiepath());
			driver = new InternetExplorerDriver();

		}
		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
