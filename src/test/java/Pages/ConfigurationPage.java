package Pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ConfigurationPage extends PageConnect{

    @BeforeSuite
    public void beforeSuite(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
    }

    public void checkElementOnPage(String xpath){
        $x(xpath).shouldBe(visible);
    }
}
