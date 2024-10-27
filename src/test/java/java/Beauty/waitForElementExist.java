package java.Beauty;

import com.microsoft.playwright.*;
import java.Constsnts.Constants;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.options.AriaRole;
import java.util.regex.Pattern;

public class waitForElementExist {
    private Playwright playwright;
    private Browser browser;

    public waitForElementExist(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    public boolean isElementVisible (String locator, String url){
        try (Page page = browser.newPage()){
          page.navigate(url);
          Locator element =page.locator(locator);
          return element.isVisible();
        } catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
            return false; // Возвращаем false в случае ошибки
        }
    }
    public void close(){
        browser.close();
        playwright.close();
    }


}
