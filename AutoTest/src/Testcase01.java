//package AutoTest;

import org.openqa.selenium.*;
//import java.util.Set;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class Testcase01 {
    public static void main(String[] orgs){
        System.out.print("start selenium" );
        
        //�����������·���趨��ϵͳ����
        System.setProperty("webdriver.chrome.driver","D:\\SoftwareTest\\chromedriver.exe");
        
        // ��ʼ�������ʵ��
        WebDriver driver = new ChromeDriver();
        //��վ��
        driver.get("http://www.baidu.com");
        
        //������������
        driver.manage().window().maximize();
        
        //����������ó��ƶ��˴�С(480x800)
        //driver.manage().window().setSize(new Dimension(480, 800));
        
        try{
        Thread.sleep(1000);    
        driver.findElement(By.id("kw")).sendKeys("china");
        Thread.sleep(3000);
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        
        //��������˵���һ��ҳ�棻
        String firstUrl = "https://www.baidu.com/";
        System.out.printf("now accesss %s \n",firstUrl);
        driver.get(firstUrl);
        System.out.printf("now accesss %s \n",firstUrl);
        driver.navigate().back();
        Thread.sleep(3000);
        
        //�����ǰ������һ��ҳ�棻
        String secondUrl = "http://news.baidu.com/";
        System.out.printf("now accesss %s \n",secondUrl);
        driver.get(secondUrl);
        System.out.printf("now accesss %s \n",secondUrl);
        driver.navigate().forward();
        Thread.sleep(3000);
        
        }catch(Exception e){
            System.out.println("UI�Զ���ִ���쳣");
        }
    
        // �رղ��˳������
        driver.quit();
        
    }

}
