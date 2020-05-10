import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sleleniun {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\DRAKH\\OneDrive\\Desktop\\geckodriver.exe");
        WebDriver obj =new FirefoxDriver();
        obj.get("https://movies.org/movies");
    }
}
