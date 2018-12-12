@Login
Feature:Login to Php traveller

  Scenario: Login to PHP traveller
    Given Where URL is 'https://phptravels.org/clientarea.php'
    When userName is 'anupamrai2303@gmail.com' and password is 'Anupamrai2303'
    And Click login button
    Then Verify User is login
    And Logout buttin should be enabled