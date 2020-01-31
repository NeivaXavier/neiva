import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoBancoOriginal { 
	
	WebDriver driver;
	

	@Before
	public static void setUpBeforeClass() throws Exception { 
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https//www.original.com.br");
	}

	@After
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
