** Intervue Login Automation Test**

This is a Java Selenium automation script that logs into [Intervue.io](https://www.intervue.io), performs a search and then logs out.

## Prerequisites
- Java 17 or higher installed
- Selenium WebDriver library added to your project (via Maven or JAR files)
- Google Chrome browser installed
- ChromeDriver (version must match your Chrome browser)
- Any Java IDE (like Eclipse, IntelliJ IDEA, or VS Code)

## Project Structure
IntervueLoginTest/ src/ intervue/ IntervueLoginTest.java

## How to Run
- Clone or download this repository.
- Open the project in your preferred Java IDE.
- Update the ChromeDriver path in the script:
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
- Run the IntervueLoginTest.java file.

## What It Does
- Launches Intervue.io
- Logs in using test credentials
- Clicks the search icon and searches for the word "hello"
- Clicks on the matching suggestion
- Opens the profile dropdown and logs out

## Test Credentials
- Email: neha@intervue.io
- Password: Ps@neha@123

Note: These credentials are provided only for the assignment.

## Demo
Watch the complete automation flow from login to logout in action:
[Click here to view the video demo on Google Drive](https://drive.google.com/file/d/1Kck9YkZrOHror9JCi-cBirv_o0-J8Lbf/view?usp=sharing)
