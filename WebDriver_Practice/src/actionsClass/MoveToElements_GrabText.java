package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements_GrabText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");

		WebElement user1 = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));	
		WebElement user1name = driver.findElement(By.xpath("(//div[@class='figcaption']/h5)[1]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(user1).build().perform();
		System.out.println(user1name.getText());
		
		
	}

}
