set projectLocation=%~dp0
cd %projectLocation%
set classpath=%projectLocation%bin;%projectLocation%lib\*
java org.testng.TestNG %projectLocation%testng.xml
pause