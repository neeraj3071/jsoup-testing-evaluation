# jsoup Testing Evaluation

## Overview
This project evaluates the testing coverage of **jsoup (v1.11.2)** using its built-in test suite and the automated test generation tool **EvoSuite (v1.0.5)**. The goal is to compare the statement and branch coverage achieved by both approaches and analyze their effectiveness.

## Repository Contents
- **jsoup/**: The source code of jsoup (v1.11.2)
- **cobertura-reports/**: Reports generated using Cobertura for analyzing code coverage
- **evosuite-tests/**: Auto-generated unit tests from EvoSuite
- **evosuite-reports/**: Coverage reports from EvoSuite-generated tests
- **statistics.csv**: Comparison of coverage metrics between manual and generated test suites
- **scripts/**: Helper scripts for running EvoSuite and Cobertura

## Prerequisites
Ensure that you have the following dependencies installed:
- **Java 8 or later**
- **Cobertura** (for code coverage analysis)
- **EvoSuite 1.0.5** (for automated test generation)
- **JUnit 4.12** and **Hamcrest 1.3** (for test execution)

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/jsoup-testing-evaluation.git
   cd jsoup-testing-evaluation
   ```
2. Download and install Cobertura:
   ```sh
   sudo apt install cobertura  # (for Linux)
   ```
   Or manually download and add to your classpath.
3. Download **EvoSuite 1.0.5** and place `evosuite-1.0.5.jar` in the project directory.

## Running Built-in Tests
To assess the coverage of jsoup’s manually written test suite:
```sh
java -jar cobertura.jar --calculate-coverage
```
This generates a coverage report under `cobertura-reports/`.

## Running EvoSuite
To generate unit tests for jsoup:
```sh
java -jar evosuite-1.0.5.jar -generateTests -class org.jsoup.parser.HtmlParser
```
The generated test files will be stored in `evosuite-tests/`.

To assess the coverage of EvoSuite-generated tests:
```sh
java -jar cobertura.jar --calculate-coverage -tests evosuite-tests
```
Coverage results will be available in `evosuite-reports/`.

## Coverage Comparison
Compare the effectiveness of manually written tests vs. EvoSuite tests by analyzing `evosuite-reports/statistics.csv`.

### Expected Results
- **Manual Test Suite Coverage**: ~81% statement coverage, ~77% branch coverage
- **EvoSuite Test Suite Coverage**: TBD (Varies based on configurations and test generation depth)

## Conclusion
This project demonstrates the effectiveness of automated test generation using EvoSuite compared to manually written test cases in jsoup.

