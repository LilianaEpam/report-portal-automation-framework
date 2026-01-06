package ui.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import base.BaseTest;
import utils.ConfigManager;

public class LoginUiTest extends BaseTest {

    @Test(groups = {"ui", "regression"})
    public void openLoginPage(){
        log.info("Starting Login Page tets");
        try(Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate(ConfigManager.get("base.url.ui"));
        }
    }
}
