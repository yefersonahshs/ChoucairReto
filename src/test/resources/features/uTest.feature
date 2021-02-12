# Autor: Yeferson Estiven Naranjo Cardenas
@stories
Feature: uTest
  As a user I want to enter the Utest page in order to make a registration and know the functionalities of the site

  @scenario1
  Scenario: Register in the uTest platform

    Given than Estiven want to know the sities uTest

      |name| last_name| email | month_of_birth| day_birth|year_birth|city|postal_code|phone|model_phone|operative_system|version_operative_system|language|password|password_confirmation|
      |<name>| <last_name>| <email> | <month_of_birth>|< day_birth>|<year_birth>|<city>|<postal_code>|<phone>|<model_phone>|<operative_system>|<version_operative_system>|<language>|<password>|<password_confirmation>|


    When entering the data  from the uTest Resgistration form

    |name| last_name| email | month_of_birth| day_birth|year_birth|city|postal_code|phone|model_phone|operative_system|version_operative_system|language|password|password_confirmation|
    |Estiven| naranjo| yeferson@gmail.com | April | 24        |1998     |Bogota |21005| Huawei|mate 20| Windows          |10                      |English|Estiven.naranjo1022|Estiven.naranjo1022|
    Then he Know the funcionalities of the uTest
      | question   |
      | <question> |