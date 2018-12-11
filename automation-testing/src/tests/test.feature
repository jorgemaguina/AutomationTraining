Feature: Games

Scenario: Verify the 'Conker's Bad Fur Day' page title
Given I navigate to MAS > NINTENDO 64 page
When I click on 'Conker's Bad Fur Day' in the 'TOP 10' section
And I select 'Trucos' tab
And I click on 'Conker's Bad Fur Day' title
Then I verify that 'Conker's Bad Fur Day' title is displayed


Scenario: Verify the URL of the 'Developer' link is correct
  Given I navigate to TOP page
  When I select 'PlayStation 4' in platform dropdown
  And I select 'Action' in genre dropdown
  And I select '2013' in year dropdown
  And I click on the 'Battlefield 4: China Rising' game
  And I select 'PS3' in ficha tecnica
  Then I verify that 'Voces' label and 'Español' text are displayed
  When I click on 'Developer' link
  Then I verify that the correct current url is displayed


