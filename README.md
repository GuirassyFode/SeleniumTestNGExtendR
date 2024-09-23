# Selenium Cucumber TestNG Allure Report Integration with Jenkins

## Overview

This project demonstrates the integration of Selenium, Cucumber, TestNG, and Allure Reports, with Jenkins for Continuous Integration (CI). It provides a framework for automated browser testing using Cucumber for behavior-driven development (BDD), TestNG for test management, and Allure for generating visually appealing reports.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK** (Version 8 or above)
- **Maven** (Version 3.6 or above)
- **Selenium WebDriver**
- **Cucumber** (Java version)
- **TestNG**
- **Allure Commandline**
- **Jenkins**



## Project Structure


├── src
│   ├── main
│   │   └── java
│   │       └── stepDefinitions
│   │           └── StepDefinitions.java
│   └── test
│       └── java
│           └── runner
│               └── TestRunner.java
│           └── features
│               └── example.feature
├── pom.xml
└── README.md


## Install allure 

npm install -g allure-commandline --save-dev

## allure serve target/allure-results

 allure generate allure-results --clean -o allure-report


 ## Exemple of reprot 

 # Report with no error
 ![image](https://github.com/user-attachments/assets/036c38ca-abaf-4c5d-8ed5-3c551c3673b4)


# Report with intentional error
 ![Screenshot 2024-09-23 at 7 21 50 AM](https://github.com/user-attachments/assets/436f0ee4-ecdf-4251-8e14-ac0f2ca3a707)



![Screenshot 2024-09-23 at 7 45 23 AM](https://github.com/user-attachments/assets/dd120b7c-de97-4d3d-8415-199e44c2ee64)


 



