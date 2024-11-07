@echo off
cd d CUsersSipu NayakDocumentsGitHubCMS  REM replace with your actual project path
echo Starting Maven build for Selenium project...

REM Clean the project to remove previous builds
mvn clean

REM Compile the project code
mvn compile

REM Run the tests - you can specify your test suite or test classes if needed
mvn test

echo Selenium tests completed.
pause
