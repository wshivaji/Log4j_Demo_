package Log4j_Demo_;

import org.testng.annotations.Test;



public class sanity_test extends demo_1 {

	@Test
	public void TC01()  {
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		log.info("launching chrome broswer");
	}
}
