package Beauty;

import com.microsoft.playwright.*;
import Constsnts.Constants;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.options.AriaRole;
import java.util.regex.Pattern;

public class waitForElementExist {


    public static boolean isElementVisible(Page page, String locator) {
        try {
            Locator element = page.locator(locator);

            // Проверяем, доступен ли элемент
            if (element.count() == 0) {
                throw new RuntimeException("Элемент с локатором '" + locator + "' не найден.");
            }

            // Проверяем видимость элемента
            boolean isVisible = element.isVisible();
            if (!isVisible) {
                throw new RuntimeException("Элемент с локатором '" + locator + "' не является видимым.");
            }

            return true; // Если элемент найден и видим, вернем true
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false; // Возвращаем false при ошибке
        } catch (Exception e) {
            System.out.println("Общая ошибка: " + e.getMessage());
            return false; // Возвращаем false при прочих ошибках
        }
    }
    }

