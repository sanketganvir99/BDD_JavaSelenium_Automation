@AndroidTest
Feature: Login functionality in Loreal

Scenario: Login into loreal app with valid credentials
Given I launch the Android app
Then I wait for page to load on android
Then I tap on identifier "tv_skip"
Then I tap on identifier "et_login_email"
Then I clear the text in the identifier "et_login_email"
Then I enter "sc32@loreal.com" in identifier "et_login_email"
Then I tap on identifier "et_login_password"
Then I clear the text in the identifier "et_login_password"
Then I enter "Loreal123" in identifier "et_login_password"
Then I tap on identifier "btn_login"