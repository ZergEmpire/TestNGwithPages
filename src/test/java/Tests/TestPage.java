package Tests;

import Pages.PageConnect;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TestPage extends PageConnect {


    @Test
    public void testSandBoxTest(){
        configurationPage.beforeSuite();

        open("/");
       configurationPage.checkElementOnPage("//h1[contains(text(), \"Welcome to the-internet\")]");
    }
}
