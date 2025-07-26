Feature: SignUp
  Scenario: verify that user can signUp successfully
    Given Open URL
    When click on signUp Btn
    And click on create account Btn
    And fill all fields
    And click on checkbox
    And click on create account
    And click on Logo
    And go to Trending categories at New lower price
    And click on Sofas
    And click on sort
    And addRandomProduct
    And compare
    And checkTotalPrice
    And Move second product in the cart to favourites
    And Remove third product from the cart
    And Check out using fake data until you reach Review and Pay


