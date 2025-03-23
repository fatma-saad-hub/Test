Feature: tester la fonctionnalité checkout produit
  Scenario: checkout produit
    Given sur le site Automation Test Store
    When cliquer sur le bouton login
    And connexion
#    And je tape un password
#    And  clique sur login
    And  le dash page
    And ajouter produit
#    And clique sur le bouton Cart
#    And clique sur le bouton continue shop
#    And  choisie et ajouter  un produit
   Then produits dans la cart
    And je clique sur le bouton checkout un produit
    And je clique sur le bouton Confirmer ordre
   Then je suis dans la page confirmation ordre