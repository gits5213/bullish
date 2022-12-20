# Bullish Tests Summery
- Creating an architecture of the UI & API automation framework takes a long time, which is I didn't manage it during the time frame, and I did something you might like below.
- I didn't implement UI Tests based on the BDD feature format because a lot of extra work needs to be done without any benefits, like verifying users' end-goal.
- However, I implemented a lot easier way to understand both parties (Tech vs. Non-Tech), reduced time, was less complex, and understood well.
- Please look at it, and let me know what you think. I can explain lots of things which I have in mind.

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
- > mvn clean
- > mvn compile
- > mvn install
- > mvn test
- > allure serve (report will open on the browser)

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
- > allure serve (Report will open in a browser)
