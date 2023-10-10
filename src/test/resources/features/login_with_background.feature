Feature:
  As an user,
  I want to verify the login module in Homepage.
  So that I can login as default user “Admin” and password “admin123“.

  Background:
    Given navigate to OrangeHRM application

  Scenario: Verify that users can log in with valid credentials.
#    Given navigate to OrangeHRM application
    When enter a valid username 'admin' and password 'admin123'
    And click on the "Login" button
    Then user should be navigated to dashboard
    Then close the application


  Scenario: Verify that user can't log in with invalid credentials.
#    Given navigate to OrangeHRM application
    When enter a valid username 'ganesh' and password 'admin@123'
    And click on the "Login" button
    Then user should not be navigated to dashboard
    Then close the application
