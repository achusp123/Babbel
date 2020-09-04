# Babbel
Babbel automation challenge


# Overview
As per the automation challenge I have taken https://formy-project.herokuapp.com/ as website for the web and the provided apk for mobile native app test.
I have selected chrome as the browser for web test. And for Mobile I have selected Android Emulator for running the android apk and test.
I have developed a framework for this and and the same is added in the reference build path with other jars. Before running mobile test make sure that appium server should be 
running at 127.0.0.1:4723 and an android emulator should be active.
# Installation
1. Pull the repository(https://github.com/achusp123/Babbel.git) in the local machine preferably eclipse and 
   provide the build path libraries from Refrence folder relative to the local machine workspace.
2. Once there is no errors with the build path you are ready to run the code.
3. For running web test make sure that the "Mobile" flag in config.properties is "no" and run the "Webtestng.xml" in the root project.
4. For running mobile test make sure that the "Mobile" flag in config.properties is "yes" and run the "Mobiletestng.xml" in the root project.

## Frameworks

1. Framework used is a pageobject hybrid framework (https://github.com/achusp123/Framework.git) which has the actions for web and mobile. 
2. And as per the parameter passed from config.properties file the framework will manage to trigger the web or mobile driver and return the driver to the respective tests.
3. The tests are easy to maintain since it is unique and scalable when new functionalities are added. Also testng helps in grouping tests across different modules on need basis.
4. The browser parameter is taken from Webtestng.xml to trigger chrome driver.
   It is possible to add firefox and edge browsers as well to the framework depending on the compatibility of the website under test.
5. Its is possible to set the retry count in config.properties which make sure that a test can be run even it fails.
6. Test data is passed from xml files.
## Tools 
1. Eclipse IDE - Used for coding which is very handy and open source and also easy to integrate with other tools like GIT, Testng, Selenium, Appium etc.
2. Selenium and Appium package - These are the most effective tools for web and mobile automation.
3. Android Emulator -Since its diffecult to maintain and cost of the hard device, its always good to run mobile test on emulators. (We need to have Mac machine for running IOS).

## Settings
1. Web url is configured in config.properties.
2. Mobile settings are done on config.properties file for providing device name, app package etc.
