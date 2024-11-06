import com.microsoft.playwright.Page;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CalculationDetails {
    private final Page page;
    private Properties properties;
    public CalculationDetails(Page page, Properties propertyFilePath) throws Exception{
        this.page = page;
        loadConstants(propertyFilePath);
    }

    private void loadConstants(String propertyFilePath)throws IOException {
       try (FileInputStream inputStream = new FileInputStream(propertyFilePath)){
           properties = new Properties();
           properties.load(inputStream);
       }
    }
    public void CheckDetails(){
        String period = page.textContent("#Расчётный период");
        String sdd = page.getAttribute("#pgs-output-text", "class");
        String sizeSDD = page.textContent("#Размер СДД");
        boolean hasInvalid = Boolean.parseBoolean(page.textContent("#hasInvalid"));
        String realEstate = page.textContent("#realEstate");

        String period = page.textContent(properties.getProperty("period"));
        String sddClass = page.getAttribute(properties.getProperty("sdd"), "class");
        String sizeSDD = page.textContent(properties.getProperty("sizeSDD"));
        boolean hasInvalid = !page.textContent(properties.getProperty("hasInvalid")).contains("Нет");
        String realEstate = page.textContent(properties.getProperty("realEstate"));
        String pm = page.textContent(properties.getProperty("pm"));
        boolean isLargeFamily = Boolean.parseBoolean(page.textContent(properties.getProperty("largeFamily")));
        String transport = page.textContent(properties.getProperty("transport"));
        String region = page.textContent(properties.getProperty("region"));
        String financialSavings = page.textContent(properties.getProperty("financialSavings"));
        String settlementType = page.textContent(properties.getProperty("settlementType"));

        System.out.println("Расчётный период: " + period);
        System.out.println("Класс SDD: " + sddClass);
        System.out.println("Размер СДД: " + sizeSDD);
        System.out.println("Наличие инвалида(ов): " + hasInvalid);
        System.out.println("Недвижимое имущество: " + realEstate);
        System.out.println("ПМ: " + pm);
        System.out.println("Категория \"Многодетная семья\": " + isLargeFamily);
        System.out.println("Транспортные средства: " + transport);
        System.out.println("Регион: " + region);
        System.out.println("Финансовые накопления: " + financialSavings);
        System.out.println("Тип населённого пункта: " + settlementType);
    }
    }

}
