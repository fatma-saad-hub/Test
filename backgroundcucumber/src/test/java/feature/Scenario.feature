Feature: tester le site swag Labs
  Background: : Test les fonctionnalité Login avec des données
    Given ouvrir le site swag labs
    And je saisie login
    And je saisis  Password
    And je click sur login
    Then Redirection vers dash produits
    When Ajouter produit
    Then prouit dans la cart

  @supressionproduit
  Scenario: je souhaite tester la fonction supression produit de la panier
    When je clique sur le button panier
    And je clique sur le boutton remove
    Then le produit supprimé du panier


@checkout @TN
  Scenario: Test checkout et confirmation produit
    When je click sur icone panier
    And je clique sur checkout
    When je saisie first name
    And je saisie Lastname
    And je saisie code postale
    And je clique sur continuer
    Then une page overview s'affiche
    When finish checkout
    Then produit confirmé

@logout
  Scenario: je souhaite tester la fonctionnalité logout
   When : je clique sur le nav bar
   And je clique sur logout
   Then rediriger vers la page login




#  Scenario: Test Login avec des données valide
#    Given ouvrir le site swag labs
#    And je saisie login
#    And je saisis  Password
#    And je click sur login
#    Then Redirection vers dash produits
#
#
#
#  Scenario: Test ajouter produit avec des données valid
#    Given ouvrir le site swag labs
#    And je saisie login
#    And je saisis  Password
#    And je click sur login
#    Then Redirection vers dash produits
#    And Ajouter produit
#   Then prouit dans la cart
#
#  Scenario: Test checkout produit
#    Given ouvrir le site swag labs
#    And je saisie login
#    And je saisis  Password
#    And je click sur login
#    Then Redirection vers dash produits
#    And Ajouter produit
#    Then prouit dans la cart
#    And je clique sur checkout
#    And je saisie first name
#    And je saisie Lastname
#    And je saisie code postale
#    And je clique sur continuer
#    And finish checkout
#    Then produit confirmé