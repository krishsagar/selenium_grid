set projectLocation=D:\selenium\selenium_grid
cd %projectLocation%
set classpath=%projectLocation%\bin
SET TESTNG_HOME=C:\ENVIRONMENT\java
SET PATH=%PATH%;%JAVA_HOME%\bin;
SET CLASSPATH=%CLASSPATH%;%TESTNG_HOME%\testng-6.9.10.jar;%TESTNG_HOME%\jcommander.jar;C:\ENVIRONMENT\java\selenium-server-standalone-3.8.1.jar
java org.testng.TestNG %projectLocation%\testng.xml
pause