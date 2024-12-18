package Beauty;
import com.microsoft.playwright.*;
import Constsnts.Constants;


public class TestForMainPage {
    public static void main(String[] args){
        try (Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();

            page.navigate(Constants.baseUrl);

            String locator = Constants.selectorForSliderMainPage;

            boolean isVisible = waitForElementExist.isElementVisible(page, locator);

            System.out.println("Элемент с локатором " + locator +" видим " + isVisible);

            browser.close();


        }

    }
}
