# Bullish Tests Summery
## Pre-requirement
- Java
- Maven
- Terminal/Command prompt

## Editor
- Intellij

## Execute Test for the first time
- Clone project
- Open terminal/Command prompt
- Navigate to the project root
- > mvn compile
- > mvn install 
- > mvn clean test
  
## There are many way to execute test
    - Option#1 (Execute Test for rest of time)
        - > mvn clean test
    - Option#2 (Execute Test entire suite)
        - Open Intellij and run testNGAPISute.xml file
    - Option#3 (Execute sigle Test)
        - From the class file click on the play icon for eatch method

## 3 different report available
- Surefire report available under target folder
- TestNG report available under target folder
- Allure report available by running below command

## Run allure result
- allure serve (Report will open in a browser)



