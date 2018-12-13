@NearbyAPI
Feature: Verify Near by API provided by google

  Scenario Outline: Verify Near by API provided by google
    Given base URL is 'https://maps.googleapis.com/maps/api/'
    And API path is 'place/nearbysearch/json'
    And Params are '<location>' '<radius>' '<type>' '<keyword>' and '<key>'
    When service hits with above request capture request
    Then Verify success is true
    Examples:
      | location                |  | radius |  | type       |  | keyword |  | key                                     |
      | -33.8670522,151.1957362 |  | 1500   |  | restaurant |  | cruise  |  | AIzaSyDPqtPHlzJikfaNHQENEJ9utXl4R9Ix_Uc |