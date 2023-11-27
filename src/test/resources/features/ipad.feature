Feature: Search cheapest all ipad models

  @ipad
  Scenario Outline: ipads
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
    And User clicks condition check box "<carrier>"
    And User click storage check box "<storage>"
    And User displays prices of ipads as per condition
    Examples:
      | model                   | model1               | carrier          | storage |
      | iPad 10.2 (2019)        | iPad 10.2 (2019)     | Unlocked         | 32 GB   |
      | iPad 10.2 (2019)        | iPad 10.2 (2019)     | Unlocked         | 128 GB  |
      | iPad 10.2 (2019)        | iPad 10.2 (2019)     | Without SIM Port | 32 GB   |
      | iPad 10.2 (2019)        | iPad 10.2 (2019)     | Without SIM Port | 128 GB  |

      | iPad 10.2 (2020) 32 GB  | iPad 10.2 (2020)     | Unlocked         | 32 GB   |
      | iPad 10.2 (2020) 128 GB | iPad 10.2 (2020)     | Unlocked         | 128 GB  |
      | iPad 10.2 (2020) 32 GB  | iPad 10.2 (2020)     | Without SIM Port | 32 GB   |
      | iPad 10.2 (2020) 128 GB | iPad 10.2 (2020)     | Without SIM Port | 128 GB  |

      | iPad 10.2 (2021) 64 GB  | iPad 10.2 (2021)     | Unlocked         | 64 GB   |
      | iPad 10.2 (2021) 256 GB | iPad 10.2 (2021)     | Unlocked         | 256 GB  |
      | iPad 10.2 (2021) 64 GB  | iPad 10.2 (2021)     | Without SIM Port | 64 GB   |
      | iPad 10.2 (2021) 256 GB | iPad 10.2 (2021)     | Without SIM Port | 256 GB  |



      | iPad 10.9 (2022)        | iPad 10.9 (2022)     | Without SIM Port | 64 GB   |
      | iPad 10.9 (2022)        | iPad 10.9 (2022)     | Without SIM Port | 256 GB  |
      | iPad 10.9 (2022)        | iPad 10.9 (2022)     | Unlocked         | 64 GB   |
      | iPad 10.9 (2022)        | iPad 10.9 (2022)     | Unlocked         | 256 GB  |

      | iPad Air (2014)         | iPad Air (2014)      | Unlocked         | 16 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Unlocked         | 32 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Unlocked         | 64 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Unlocked         | 128 GB  |
      | iPad Air (2014)         | iPad Air (2014)      | Without SIM Port | 16 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Without SIM Port | 32 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Without SIM Port | 64 GB   |
      | iPad Air (2014)         | iPad Air (2014)      | Without SIM Port | 128 GB  |

      | iPad Air (2019)         | iPad Air (2019)      | Unlocked         | 64 GB   |
      | iPad Air (2019)         | iPad Air (2019)      | Unlocked         | 256 GB  |
      | iPad Air (2019)         | iPad Air (2019)      | Without SIM Port | 64 GB   |
      | iPad Air (2019)         | iPad Air (2019)      | Without SIM Port | 256 GB  |

      | iPad Air (2020)         | iPad Air (2020)      | Unlocked         | 64 GB   |
      | iPad Air (2020)         | iPad Air (2020)      | Unlocked         | 256 GB  |
      | iPad Air (2020)         | iPad Air (2020)      | Without SIM Port | 64 GB   |
      | iPad Air (2020)         | iPad Air (2020)      | Without SIM Port | 256 GB  |




      | iPad Air (2022)         | iPad Air (2022)      | Unlocked         | 64 GB   |
      | iPad Air (2022)         | iPad Air (2022)      | Unlocked         | 256 GB  |
      | iPad Air (2022)         | iPad Air (2022)      | Without SIM Port | 64 GB   |
      | iPad Air (2022)         | iPad Air (2022)      | Without SIM Port | 256 GB  |


      | iPad Pro 12.9 (2015)    | iPad Pro 12.9 (2015) | Unlocked         | 32 GB   |
      | iPad Pro 12.9 (2015)    | iPad Pro 12.9 (2015) | Unlocked         | 256 GB  |
      | iPad Pro 12.9 (2015)    | iPad Pro 12.9 (2015) | Without SIM Port | 32 GB   |
      | iPad Pro 12.9 (2015)    | iPad Pro 12.9 (2015) | Without SIM Port | 256 GB  |

      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Unlocked         | 32 GB   |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Unlocked         | 128 GB  |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Unlocked         | 256 GB  |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | AT&T             | 32 GB   |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | AT&T             | 128 GB  |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | AT&T             | 256 GB  |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Without SIM Port | 32 GB   |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Without SIM Port | 128 GB  |
      | iPad Pro 9.7 (2016)     | iPad Pro 9.7 (2016)  | Without SIM Port | 256 GB  |
