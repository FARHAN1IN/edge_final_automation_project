package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 class mod1 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hamada Salim G-Trd\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//driver.manage().window().maximize();
    	driver.get("https://hachnat.stage-carelogix.de/sing-in");
    	try
    	{
    		WebElement username = driver.findElement(By.id("credential"));
    		WebElement password = driver.findElement(By.id("password"));
    		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
    		
    		    		
    		username.sendKeys("farhanul160@gmail.com");
    		password.sendKeys("Carelogix24!!");
    		submit.click();		
    		
            Thread.sleep(3000);

            driver.get("https://hachnat.stage-carelogix.de/tasks");

         
            WebElement createTaskButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/main/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div[2]/button/span[2]"));
            createTaskButton.click();

            WebElement taskboardName = driver.findElement(By.xpath("//*[@id=\"colum\"]"));
            taskboardName.sendKeys("C211015");

            WebElement saveTaskButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/form/div[2]/button"));
            saveTaskButton.click();

            
            Thread.sleep(2000);

          
            WebElement profileMenu = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/header/div/div[3]/div[2]/a/div/div[1]/img"));
            profileMenu.click();

            WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/header/div/div[3]/div[2]/div/button"));
            logoutButton.click();

            
            Thread.sleep(2000);
    			
        }

    	
    	catch(Exception e) {
    		System.out.println("Error");
    	}finally {
    		System.out.println("Done");
    	}
    	   
		
    }
}