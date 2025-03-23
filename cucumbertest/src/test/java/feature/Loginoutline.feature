Feature: tester la fonction Log
  Scenario Outline: connexion avec données invalides
   Given site Automation Test Store ouvert
   When click sur le bouton log or registre
    And je saisi un <username>
    And je tape un <password>
    And click le bouton Login
   Then message erreur afficher
   Examples:
     |username  |password|
     | "john1235" |"secret"|
     |"john12354" |"secret123"|
     |" "         |"aaaaa"|
     |"john12354" |" "|


