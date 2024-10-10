Feature:  Amazon Search Testi

  Scenario: TC01 kullanici searchbox test eder
    Given kullanici amazon sayfasina gider
    When kullanici iphone aratir
    Then kullanici sonuclarin iphone icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC02 kullanici searchbox test eder
    Given kullanici amazon sayfasina gider
    When kullanici Selenium aratir
    Then kullanici sonuclarin Selenium icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC03 kullanici searchbox test eder
    Given kullanici amazon sayfasina gider
    When kullanici Java aratir
    Then kullanici sonuclarin Java icerdigini test eder
    And kullanici sayfayi kapatir
