Feature: tester le site swag Labs
  Scenario: Test Login avec des données possible
   Given ouvrir le site swag labs
    And je saisie login
    And je saisis  Password
    And je click sur login
   Then Redirection vers dash produits
    And Ajouter produit
