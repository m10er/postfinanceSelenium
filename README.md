# PostFinance Selenium Test Project

This project contains automated test scenarios for the PostFinance web application using Selenium.

## 🛠️ Technologies Used

- Java 17
- Selenium WebDriver 4.18.1
- Cucumber 7.15.0
- JUnit 5
- Allure Reports 2.24.0
- Extent Reports
- Log4j 2.22.1
- JavaFaker
- Lombok
- GitHub Actions

## 📋 Project Structure

```
src/
├── main/
│   └── java/
│       └── org/example/
│           ├── pages/         # Page Objects
│           ├── stepdefs/      # Cucumber Step Definitions
│           ├── utils/         # Utility Classes
│           └── runners/       # Test Runners
└── test/
    └── resources/
        └── features/         # Cucumber Feature Files
```

## 🚀 Installation

1. Install Java 17 JDK
2. Install Maven
3. Clone the project:
   ```bash
   git clone [repo-url]
   ```
4. Install dependencies:
   ```bash
   mvn clean install
   ```

## 🏃‍♂️ Running Tests

To run the tests:

```bash
mvn test
```

## 📊 Reporting

The project uses two different reporting tools:

1. Allure Reports:
   ```bash
   mvn allure:report
   ```

2. Extent Reports:
   Generated automatically after test execution.

## 🔄 Continuous Integration

The project uses GitHub Actions for continuous integration (CI). On every push and pull request:

- Project is built
- Tests are executed
- Allure reports are generated
- Test results and reports are saved as artifacts

You can check the CI status by visiting the GitHub Actions tab.

## 📝 Features

- Page Object Model (POM) implementation
- Cucumber BDD approach
- Parallel test execution support
- Detailed reporting
- Logging system
- JavaFaker integration for data generation
- Automated CI/CD pipeline

## 🤝 Contributing

1. Fork this repository
2. Create a new branch (`git checkout -b feature/newFeature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/newFeature`)
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details. 