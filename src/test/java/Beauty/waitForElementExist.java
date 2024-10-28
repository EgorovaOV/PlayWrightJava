package Beauty;

import com.microsoft.playwright.*;
import Constsnts.Constants;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.options.AriaRole;
import java.util.regex.Pattern;

public class waitForElementExist {


    public static boolean isElementVisible(Page page, String locator) {

       Locator element =  page.locator(locator);
        return element.isVisible();
    }
}
