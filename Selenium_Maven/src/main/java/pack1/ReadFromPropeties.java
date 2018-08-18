package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromPropeties {
	public static final String path = "./hmslogin.properties";

	public static String getValue(String key) throws Exception {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fi);
		// System.out.println(prop.getProperty("browser"));
		return prop.getProperty(key);
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();

		driver.findElement(By.name(getValue("usernameLoc"))).sendKeys(getValue("username"));
		driver.findElement(By.name(getValue("pwdLoc"))).sendKeys(getValue("password"));
		driver.findElement(By.name(getValue("loginbLoc"))).click();
	}

}
