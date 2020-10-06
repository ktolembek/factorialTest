# factorialTest
TribalScale factorial testing assignment

Bug Report documentation for a factorial calculator app located at https://qainterview.pythonanywhere.com/

Google Docs files could be accessed through these links

Bug Report 1 https://docs.google.com/document/d/1RdnjuWAJt3-eEZzuRkkLGnaP9k776VkRqBXyGLyLU3w/edit?usp=sharing

Bug Report 2 https://docs.google.com/document/d/1PFsgBhpjCN0Khbd4qmIVb6Ps6xfxEnNioq0xgIF5DhA/edit?usp=sharing


I have created 4 automated test cases:
Test case 1: Factorial of 0 shoould be 1
Test case 2: Only numerical symbols should be accepted. Entering alphabetic symbols should give an error
Test case 3: Entering Negative integers should give an error
Test case 4: Entering big integers should give a correct value or a warning that operation is limited

To run this test cases you need:
1. Any modern OS (Windows 8.1 or higher, MacOS Mojave or higher, Ubuntu Linux 18 or higher)
2. Latest Chrome browser https://www.google.ca/chrome/?brand=CHBD&gclid=CjwKCAjwq_D7BRADEiwAVMDdHpn1z-EjkT8Nvg07613bQGDf44oLZKuo3vU_gxa3UueZz1S5eLp3YxoCs3AQAvD_BwE&gclsrc=aw.ds
3. Java SDK https://www.oracle.com/ca-en/java/technologies/javase-downloads.html
   Installation instructions https://docs.oracle.com/en/java/javase/15/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A
4. Eclipse IDE https://www.eclipse.org/downloads/
5. Selenium Wbdriver for Java https://www.selenium.dev/downloads/
   Installation instructions https://www.guru99.com/installing-selenium-webdriver.html
6. TestNG framework https://testng.org/doc/
   Installation instructions https://www.guru99.com/install-testng-in-eclipse.html
7. Import Eclipse project
8. You need to change the path of WebDriver in all files. It is stored in pathDriver ="C:\\Selenium\\Tools\\chromedriver.exe";
9. Run Java files as TestNG test

P.S. External parametrization is not added to simplify setup
