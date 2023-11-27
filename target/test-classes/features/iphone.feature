Feature: Search cheapest Iphone

@tek
  Scenario: User should be able to find cheapest Iphone model
    Given User is on search page
    When User enters Iphone model with storage "iphone 11 Pro Max 64 gb unlocked"
    And User click model checkboxes "iPhone 11 Pro Max"
  #  And User clicks condition check box "Good"
    And User click storage check box "64 GB"
    And User inconsistent prices according to condition "Unlocked"

  Scenario: User should be able to find cheapest Samsung model
    Given User is on search page
    When User enters Iphone model with storage "Samsung Galaxy S10 lite 128 gb unlocked"
   # And User click model checkboxes "Galaxy Z Fold 3"
    And User clicks condition check box "Galaxy S10 Lite"
    And User click storage check box "128 GB"
    And User inconsistent prices according to condition.. "Unlocked"

  Scenario: Apple watch
    Given User is on search page
    When User enters Iphone model with storage "apple watch series 7 cellular 41 mm"
    And User click model checkboxes "Apple Watch Series 7"
   # And User clicks condition check box "Galaxy S21 Plus 5G"
    And User click storage check box "32 GB".
    And User inconsistent prices according to "Cellular"





