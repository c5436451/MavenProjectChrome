package MavenProjectChrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchChromeDriver {
	public static void startdriver() {
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		}
}
