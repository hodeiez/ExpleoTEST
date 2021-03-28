TEST for EXPLEO 
- all source files are in src

Two alternatives to run the program and tests
a/BUILD PROJECT run program and tests*
	1.-run  "mvn clean package" command from root folder
	2.-run "java -jar target/EXPLEO-0.1.jar" from root folder
	3.-run "mvn test" from root folder TO run a unit test report

b//RUN program and tests without building the jar**
	1.-execute runPrograms.bat  (runs a jar console program with a simple menu to run the 3 problems ->(anagram, findLink, and calculator))
	2.-execute runTests.bat,  runs the test units from console***.

(third alternative is open the files in your favorite IDE and compile from it)
------------------------------------------------------------------------------
* findLinks uses chromedriver.exe which maybe gives problems in a non windows OS
** executables for DOS/windows
***to run "runTests.bat" mvn has to be installed in the computer path

by Hodei Eceiza Zaldua
28/03/2021