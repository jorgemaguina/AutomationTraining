Feature: Bank
Scenario: Verify 'Modelos de contrato' table has 17 items
  Given I navigate to Bank page
  When I navigate to 'Mapa del Sitio > Buscar' page
  When I look for "credito" in the searchbox
  And I open "Modelos de contrato" page result
  Then I verify that the table has "17" items