#Author: ysikvillamizar@gmail.com

@tag
Feature: Flight reserve
As a web user
To do test using the programming Cucumber and Gherkin.

 @tag1
  Scenario Outline: Successful search for a flight from the main Despegar website
    Given that Actor wants to look for a one way flight 
    When The Actor insert "<originCity>", "<destinationCity>" , "<departureDate>" and "<returnDate>" of the fight
    And The Actor select the flight
    And The Actor insert "<name>" , "<lastName>" , "<identificationNumber>"  , "<city>" and "<adress>" of the actor
    Then The Actor should your data "<name>" and "<lastname>" on the screen

    Examples: 
   
  	|originCity|destinationCity|departureDate|returnDate  |  name    |  lastName    | identificationNumber  |  city    |   adress       | 
    |Medellin  |		Bogota  	 |			1      |			8     |  Jessica |	Villamizar  |			1128438401        | Medellin |cr 51 B N 70 -23| 
    
 
  