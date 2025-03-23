Feature: tester le site Swag Lab

  Background:  verifier la connexion et l'ajout produit
    Given user est dans la page login
    When user tape un username
    And user tape password
    And user clique sur Login
    Then user est dans la page des produits
    When user ajouter des produit
    Then produits ajoutés dans le panier
@supprimerDuPanier
Scenario: tester la supression produit du panier
  When user clique sur l'icone panier
  And clique sur le bouron remove
  Then produit supprimé du panier

@Checkout
  Scenario: verifier la fonction checkout
    When user consulte son panier
    And user cliquer sur le bouton chechout
    When user entrer son first Name
    And user saisie un last Name
    And use entre un code postale
    And clique sur continue
    Then une page overview s'affiche
    When user clique sur le bouton finish
    Then user est dans la page complete