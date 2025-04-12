package intervue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class IntervueLoginTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swaga\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        try {
            // Step 1: Launch Intervue and store current window
            driver.get("https://www.intervue.io/");
            String mainWindow = driver.getWindowHandle();

            // Step 2: Click top-right Login button
            driver.findElement(By.cssSelector("a.ivhn-contact-link.loginBtn")).click();

            // Step 3: Switch to newly opened login tab
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(mainWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

            // Step 4: Click green 'Login' under Companies
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement companyLoginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.AccessAccount-ColoredButton[href='/login']")));
            companyLoginBtn.click();

            // Step 5: Fill in email and password
            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
            emailInput.sendKeys("neha@intervue.io");

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordInput.sendKeys("Ps@neha@123");

            // Step 6: Click on 'Login with email' button
            WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
            loginBtn.click();

            // Step 7: Click search icon in header
            WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.HeaderSearch__SearchLensIconWrap-sc-1140h69-2.hVEOxf")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchIcon);

            Actions actions = new Actions(driver);
            actions.moveToElement(searchIcon).pause(Duration.ofMillis(500)).click().perform();
            Thread.sleep(600);

            // Step 8: Type 'hello' in popup search input
            WebElement popupSearchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.SearchBox__StyledInput-ctnsh0-4.lhwsuL")));
            popupSearchInput.clear();
            popupSearchInput.sendKeys("hello");
            Thread.sleep(800);

            // Step 9: Wait for and click the 'hello' suggestion
            WebElement helloSuggestion = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.SearchThrough__PlaceholderText-sc-8f4vh4-0.fEvpzS")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", helloSuggestion);
            Thread.sleep(800);

            // Step 10: Wait for and click profile dropdown
            WebElement userDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.ant-dropdown-link.ProfileHeader__StyedDropdownHoverLink-sc-1gwp6c1-3.cwhrSp")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userDropdown);
            Thread.sleep(800);

            // Step 11: Wait for and click the 'Logout' option
            WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/logout']")));
            logoutLink.click();

        } catch (Exception e) {
            System.out.println("🚨 Exception: " + e.getMessage());
        }
    }
}
