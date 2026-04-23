Software Engineering Project – ITSE305
University of Bahrain – College of IT

Project Title
Bazaria (Online Shopping system)

Team members:
Yaseen mohamed- 202206948
Abdulaziz Sedrati- 202306676
Hussain Jassim- 202307311
Faisal Hesham Almarzouqi- 202210666

Tasks Distribution
1. Abdulaziz:User Registration / Login

2. Yaseen:Search Products.

3. Faisal:Add to Cart

4. Hussain:Checkout & Payment




**** Randoop Testing Steps ****

1. Search online and install randoop "randoop-all-x.x.x.jar" file


2. create bin and src folders in your project:
move all .java classes to src, and leave bin empty as it will house .class file in step 3


3. compile .java files to .class:
run: javac -d bin $(find src -name "*.java" ! -name "*Test.java") 

compiles every java file except test files


4. run randoop:
example of generating tests for business.CartService class

run: java -classpath "PATH-TO-RANDOOP;bin" randoop.main.Main gentests --testclass=business.CartService

    replace PATH-TO-RANDOOP with the path to "randoop-all-4.3.0.jar" file on your computer 
    example path: "C:\Users\User1\Downloads\randoop-all-4.3.4.jar"



small edit for github actions