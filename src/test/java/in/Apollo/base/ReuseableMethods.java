package in.Apollo.base;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ReuseableMethods {
	

	public void sendText(WebElement ele, String input);
	public void button(WebElement ele);
	public void scrollDown(WebElement ele);
	public void scrollUp(WebElement ele);
	public void sendText(String input, WebElement ele);
	public void sendText(String input, WebElement ele, int a);
	public void selectbyVisibleText(WebElement ele, String input);
	public void selectbyValue( WebElement ele, String value);
	public void selectbyIndex(WebElement ele, int index);
	public void deselectbyVisibleText(WebElement ele, String input);
	public void deselectbyValue( WebElement ele, String value);
	public void deselectbyIndex(WebElement ele, int index);
	public void deselectall(WebElement ele);
	public void mouseOverToElement(WebElement ele);
	public void dragDrop(WebElement ele1, WebElement ele2);
	public void rightClick(WebElement ele);
	public void childWindow(String parent);
	public void parentWindow(String parent);
	public void screenShot(String name);
	public void actionClick(WebElement ele);
	public void button(int a, WebElement ele);
	public void parentFrame();
	public void mainFrame();
	public void navigate(String url);
	public void forward();
	public void backward();
	public void refresh();
	public void close();
	public void quit();
	public void nextFrame(String name);
	public List<WebElement> getOptions(WebElement ele);
	public List<WebElement> getAllSelectedOptions(WebElement ele);
	public String returnText(WebElement ele);
	public String returnAttribute(WebElement ele, String attribute);
	public String returnCssValue(WebElement ele,String cssName);
	
	
}
