package AssessmentBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssessmentTestBase {
	public static Properties prop;
	public static WebDriver driver;
	public AssessmentTestBase() {
		prop = new Properties();
		try {
			FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+ "//src//main//resources//config//config.properties");
			prop.load(fin);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialize() {
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelam\\Documents\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));
	}
	
	}

