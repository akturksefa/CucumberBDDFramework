Feature: herokuapp delete testi

  Scenario: TC01 herokuapp adresinden delete butonu calismali
    Given Kullanici "herokuappURL" anasayfasinda
    And add element butonuna basar
    And kullanici 3 sn bekler
    And Delete butonu gorunur oluncaya kadar bekler
    Then delete butonu gorunut oldugunu test eder
    Then Delee butonuna basar
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir