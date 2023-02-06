import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Producao prd;
        prd = new Producao();
        prd.testScreen();
        prd.dashboard();
        System.out.println("Hello world!");

    }
}
