Feature: Login functionality in Tekagogo

Background:
Given I am launching the chrome browser
Then I am loading the website
Then I wait for page to load

Scenario: Verifiy login feature with valid credentials
Then I click on identifier with xpath "/html/body/h3[1]/a"
Then I click on identifier "email"
Then I clear the text in the identifier "email"
Then I enter "sancli1@mailinator.com" in identifier "email"
Then I click on identifier "password"
Then I clear the text in the identifier "password"
Then I enter "Teka@12" in identifier "password"
Then I click on identifier with xpath "/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button"
Then I assert for the element with xpath "//*[@id='navbarTekagogo']/div/a[4]/a/div/div"
Then I mouseover on the element with xpath "//*[@id='root']/nav/a/img"
#Then I assert for text "abs!@#123" in identifier with xpath "asc123!@#" 