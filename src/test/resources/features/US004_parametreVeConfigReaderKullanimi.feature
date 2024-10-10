Feature: Parametre ve ConfigReader Kullanimi
@Configreader
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "faceURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "facebook" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "googleURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "google" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amazonURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "amazon" icerdigini test eder
    And sayfayi kapatir


