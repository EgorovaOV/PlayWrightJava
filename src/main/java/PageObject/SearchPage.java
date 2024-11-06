import com.microsoft.playwright.Page;

public class SearchPage {
    private final Page page;

    public SearchPage(Page page){
        this.page = page;
    }

    public void SearchByERN(String ERN){
        page.fill("#ernField", ERN);
        page.click("#searchButton");
    }

    public void SelectFirstResult(){
        page.locator(".result-row").first().click();
    }
}
