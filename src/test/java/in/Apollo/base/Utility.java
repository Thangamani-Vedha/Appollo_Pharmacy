package in.Apollo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility implements ReuseableMethods {
	public static WebDriver driver;
	public static Actions ac;
	public static JavascriptExecutor js;
	public static Select s;
	
	public static void browser_launch(){
		File f = new File(".\\src\\test\\resources\\report.properties");
		Properties prop;
		String prodUrl = null;
		try {
		FileInputStream fi = new FileInputStream(f);
		prop = new Properties();
		prop.load(fi);
		prodUrl = prop.getProperty("prod");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    ac = new Actions(driver);
	    js = (JavascriptExecutor)driver;
	    driver.get(prodUrl);
	   // List<WebElement> link1 = driver.findElements(By.tagName("a"));
	    //Iterator<WebElement> link2 = link1.iterator();
	    //while(link2.hasNext()) {
	    	//WebElement link = link2.next();
	    	//String href = link.getAttribute("href");
	    	//if(href == null || href.isEmpty()) {
	    		//System.out.println("Given link is empty.");
	    	//}
	    	//else {
	    		
	    	//	HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
	    	//	http.setRequestMethod("HEAD");
	    	//	http.connect();
	    	//	int statusCode = http.getResponseCode();
	    	//	if(statusCode == 200 || statusCode <=300) {
	    	//		System.out.println("Given link is not a broken link: "+ href);
	    	//	}
	    	//	else if(statusCode >300 || statusCode >=400 || statusCode >=500) {
	    	//		System.out.println("Given link is  a broken link: "+ href);
	    	    		
	    	//	}
	    //	}
	   // }
	   
}
	    
	    
	public static void applicationLaunch(String url) {
		driver.get(url);
		
	}

	@Override
	public void sendText(WebElement ele, String input) {
		ele.sendKeys(input);
		
	}

	@Override
	public void button(WebElement ele) {
		ele.click();
		
	}

	@Override
	public void scrollDown(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
	}

	@Override
	public void scrollUp(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
		
	}

	@Override
	public void sendText(String input, WebElement ele) {
		ac.sendKeys(input).build().perform();
		
	}

	@Override
	public void sendText(String input, WebElement ele, int a) {
		js.executeScript("arguments[0].setAttribute('value', '"+input+"')", ele);
		
	}

	@Override
	public void selectbyVisibleText(WebElement ele, String input) {
		Select s = new Select(ele);
		s.selectByVisibleText(input);
		
	}

	@Override
	public void selectbyValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
			
	}

	@Override
	public void selectbyIndex(WebElement ele, int index) {
	Select s = new Select(ele);
	s.selectByIndex(index);
		
	}

	@Override
	public void mouseOverToElement(WebElement ele) {
		ac.moveToElement(ele).build().perform();
		
	}

	@Override
	public void dragDrop(WebElement ele1, WebElement ele2) {
		ac.dragAndDrop(ele1, ele2).build().perform();;
		
	}

	@Override
	public void rightClick(WebElement ele) {
		ac.contextClick(ele).build().perform();;		
	}

	@Override
	public void childWindow(String parent) {
		Set<String> child = driver.getWindowHandles();
		for(String ch : child) {
			if(!parent.equals(ch)) {
				driver.switchTo().window(ch);
			}
		}
	}
	
	@Override
	public void parentWindow(String parent) {
		driver.switchTo().window(parent);
		
	}
	
	@Override
	public void screenShot(String name) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./target/"+name+".jpg");
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionClick(WebElement ele) {
		ac.click(ele).build().perform();
		
	}

	@Override
	public void button(int a, WebElement ele) {
		js.executeScript("arguments[0].click", ele);
		
	}

	@Override
	public void parentFrame() {
	driver.switchTo().parentFrame();	
		
	}

	@Override
	public void mainFrame() {
	driver.switchTo().defaultContent();	
		
	}

	@Override
	public void nextFrame(String name) {
		driver.switchTo().frame(name);
		
	}

	@Override
	public List<WebElement> getOptions(WebElement ele) {
		s = new Select(ele);
		List<WebElement> options = s.getOptions();
		return options;
	}

	@Override
	public String returnText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	@Override
	public String returnAttribute(WebElement ele, String attribute) {
		String value = ele.getAttribute(attribute);
		return value;
	}

	@Override
	public String returnCssValue(WebElement ele, String cssName) {
		String value = ele.getCssValue(cssName); 
		return value;
	}
	
	public String title() {
		String Title = driver.getTitle();
		return Title;
		
	}
	@Override
	public void deselectbyVisibleText(WebElement ele, String input) {
		Select s = new Select(ele);
		s.deselectByVisibleText(input);
		
	}
	@Override
	public void deselectbyValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.deselectByValue(value);
		
	}
	@Override
	public void deselectbyIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
		
	}
	@Override
	public void deselectall(WebElement ele) {
		Select s = new Select(ele);
		s.deselectAll();
		
	}
	@Override
	public List<WebElement> getAllSelectedOptions(WebElement ele) {
		s = new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		return options;
	}
	@Override
	public void navigate(String url) {
		driver.navigate().to(url);
		
	}
	@Override
	public void forward() {
		driver.navigate().forward();
		
	}
	@Override
	public void backward() {
		driver.navigate().back();
		
	}
	@Override
	public void refresh() {
		driver.navigate().refresh();
		
	}
	@Override
	public void close() {
		driver.close();
		
	}
	@Override
	public void quit() {
		driver.quit();
		
	}
	
	
	
	

}
