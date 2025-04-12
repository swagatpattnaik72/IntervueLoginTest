** Intervue Login Automation Test**

This Java Selenium automation script logs into [Intervue.io](https://www.intervue.io), performs a search, and logs out.

## Prerequisites
- Java 17 or above
- Selenium WebDriver library added to your project (via Maven or JAR files)
- Chrome browser installed
- ChromeDriver (version must match your Chrome browser)
- Any Java IDE (like Eclipse, IntelliJ IDEA, or VS Code)

## Project Structure
IntervueLoginTest/ src/ intervue/ IntervueLoginTest.java

## How to Run
1. Clone or download this repo.
2. Open it in your IDE.
3. Update the ChromeDriver path in:
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
4. Run the IntervueLoginTest.java file.

## What It Does
Opens intervue.io
Logs in with test credentials
Clicks the search icon and searches for the word hello
Clicks on the matching suggestion
Opens the profile/user dropdown and logs out

## Test Credentials
Email: neha@intervue.io
Password: Ps@neha@123
Note: These credentials are provided for assignment/testing purposes only.

## Demo
Watch the complete automation flow in action:  
[Click here to view the video demo on Google Drive](https://drive.google.com/your-demo-link-here)
