//package AutoTest;

import org.openqa.selenium.*;
//import java.util.Set;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class Testcase01 {
    public static void main(String[] orgs){
        System.out.print("start selenium" );
        
        //把驱动程序的路劲设定到系统属性
        System.setProperty("webdriver.chrome.driver","D:\\SoftwareTest\\chromedriver.exe");
        
        // 初始化浏览器实例
        WebDriver driver = new ChromeDriver();
        //打开站点
        driver.get("http://www.baidu.com");
        
        //设置浏览器最大化
        driver.manage().window().maximize();
        
        //将浏览器设置成移动端大小(480x800)
        //driver.manage().window().setSize(new Dimension(480, 800));
        
        try{
        Thread.sleep(1000);    
        driver.findElement(By.id("kw")).sendKeys("china");
        Thread.sleep(3000);
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        
        //浏览器后退到第一个页面；
        String firstUrl = "https://www.baidu.com/";
        System.out.printf("now accesss %s \n",firstUrl);
        driver.get(firstUrl);
        System.out.printf("now accesss %s \n",firstUrl);
        driver.navigate().back();
        Thread.sleep(3000);
        
        //浏览器前进到下一个页面；
        String secondUrl = "http://news.baidu.com/";
        System.out.printf("now accesss %s \n",secondUrl);
        driver.get(secondUrl);
        System.out.printf("now accesss %s \n",secondUrl);
        driver.navigate().forward();
        Thread.sleep(3000);
        
        }catch(Exception e){
            System.out.println("UI自动化执行异常");
        }
    
        // 关闭并退出浏览器
        driver.quit();
        
    }

}
