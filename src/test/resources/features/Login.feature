#Author: your.email@your.domain.com
Feature: Login Test

  Scenario: Valid login
    Given user is on login page
    When user enters username "admin" and password "admin123"
    Then user should be logged in