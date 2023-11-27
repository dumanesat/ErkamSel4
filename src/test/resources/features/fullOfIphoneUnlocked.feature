Feature: Search cheapest all iphone 11 models

  @iphone
  Scenario Outline: iphone 11
    Given User is on search page
    When User enters Iphone model with storage "<model>"
    And User click model checkboxes "<model1>"
  #  And User clicks condition check box "Good"
    And User click storage check box "<storage>"
    And User inconsistent prices according to condition "Unlocked"
#Unlocked,AT&T.T-Mobile, Verizon
    Examples:
      | model                              | model1            | storage |

     # | iPhone SE (2016) 16 gb unlocked    | iPhone SE (2016)  | 16 GB   |
      #| iPhone SE (2016) 32 gb unlocked    | iPhone SE (2016)  | 32 GB   |
      #| iPhone SE (2016) 64 gb unlocked    | iPhone SE (2016)  | 64 GB   |

      | iPhone SE (2020) 64 gb unlocked    | iPhone SE (2020)  | 64 GB   |
      | iPhone SE (2020) 128 gb unlocked   | iPhone SE (2020)  | 128 GB  |
      | iPhone SE (2020) 256 gb unlocked   | iPhone SE (2020)  | 256 GB  |

      | iPhone SE (2022) 64 gb unlocked    | iPhone SE (2022)  | 64 GB   |
      | iPhone SE (2022) 128 gb unlocked   | iPhone SE (2022)  | 128 GB  |
      | iPhone SE (2022) 256 gb unlocked   | iPhone SE (2022)  | 256 GB  |

      | iphone 7 32 gb Unlocked            | iPhone 7          | 32 GB   |
      | iphone 7 128 gb Unlocked           | iPhone 7          | 128 GB  |
      | iphone 7 256 gb Unlocked           | iPhone 7          | 256 GB  |

      | iphone 7 Plus 32 gb Unlocked       | iPhone 7 Plus     | 32 GB   |
      | iphone 7 Plus 128 gb Unlocked      | iPhone 7 Plus     | 128 GB  |
      | iphone 7 Plus 256 gb Unlocked      | iPhone 7 Plus     | 256 GB  |

      | iphone 8 64 gb Unlocked            | iPhone 8          | 64 GB   |
      | iphone 8 128 gb Unlocked           | iPhone 8          | 128 GB  |
      | iphone 8 256 gb Unlocked           | iPhone 8          | 256 GB  |

      | iphone 8 Plus 64 gb Unlocked       | iPhone 8 Plus     | 64 GB   |
      | iphone 8 Plus 128 gb Unlocked      | iPhone 8 Plus     | 128 GB  |
      | iphone 8 PLus 256 gb Unlocked      | iPhone 8 Plus     | 256 GB  |

      | iphone X 64 gb Unlocked            | iPhone X          | 64 GB   |
      | iphone X 256 gb Unlocked           | iPhone X          | 256 GB  |


      | iPhone XS 64 gb unlocked           | iPhone XS         | 64 GB   |
      | iPhone XS 256 gb unlocked          | iPhone XS         | 256 GB  |
      | iPhone XS 512 gb unlocked          | iPhone XS         | 512 GB  |

      | iPhone XS Max 64 gb unlocked       | iPhone XS Max     | 64 GB   |
      | iPhone XS Max 256 gb unlocked      | iPhone XS Max     | 256 GB  |
      | iPhone XS Max 512 gb unlocked      | iPhone XS Max     | 512 GB  |

      | iphone XR 64 gb unlocked           | iPhone XR         | 64 GB   |
      | iphone XR 128 gb unlocked          | iPhone XR         | 128 GB  |
      | iphone XR 256 gb unlocked          | iPhone XR         | 256 GB  |

      | iphone 11 64 gb unlocked           | iPhone 11         | 64 GB   |
      | iphone 11 128 gb unlocked          | iPhone 11         | 128 GB  |
      | iphone 11 256 gb unlocked          | iPhone 11         | 256 GB  |
      | iphone 11 Pro 64 gb unlocked       | iPhone 11 Pro     | 64 GB   |
      | iphone 11 Pro 256 gb unlocked      | iPhone 11 Pro     | 256 GB  |
      | iphone 11 Pro 512 gb unlocked      | iPhone 11 Pro     | 512 GB  |
      | iphone 11 Pro Max 64 gb unlocked   | iPhone 11 Pro Max | 64 GB   |
      | iphone 11 Pro Max 256 gb unlocked  | iPhone 11 Pro Max | 256 GB  |
      | iphone 11 Pro Max 512 gb unlocked  | iPhone 11 Pro Max | 512 GB  |
      | iphone 12 64 gb unlocked           | iPhone 12         | 64 GB   |
      | iphone 12 128 gb unlocked          | iPhone 12         | 128 GB  |
      | iphone 12 256 gb unlocked          | iPhone 12         | 256 GB  |
      | iphone 12 mini 64 gb unlocked      | iPhone 12 Mini    | 64 GB   |
      | iphone 12 mini 128 gb unlocked     | iPhone 12 Mini    | 128 GB  |
      | iphone 12 mini 256 gb unlocked     | iPhone 12 Mini    | 256 GB  |
      | iphone 12 Pro 128 gb unlocked      | iPhone 12 Pro     | 128 GB  |
      | iphone 12 Pro 256 gb unlocked      | iPhone 12 Pro     | 256 GB  |
      | iphone 12 Pro 512 gb unlocked      | iPhone 12 Pro     | 512 GB  |
      | iphone 12 Pro Max 128 gb unlocked  | iPhone 12 Pro Max | 128 GB  |
      | iphone 12 Pro Max 256 gb unlocked  | iPhone 12 Pro Max | 256 GB  |
      | iphone 12 Pro Max 512 gb unlocked  | iPhone 12 Pro Max | 512 GB  |
      | iphone 13 128 gb unlocked          | iPhone 13         | 128 GB  |
      | iphone 13 256 gb unlocked          | iPhone 13         | 256 GB  |
      | iphone 13 512 gb unlocked          | iPhone 13         | 512 GB  |

      | iphone 13 mini 128 gb unlocked     | iPhone 13 mini    | 128 GB  |
      | iphone 13 mini 256 gb unlocked     | iPhone 13 mini    | 256 GB  |
      | iphone 13 mini 512 gb unlocked     | iPhone 13 mini    | 512 GB  |

      | iphone 13 Pro 128 gb unlocked      | iPhone 13 Pro     | 128 GB  |
      | iphone 13 Pro 256 gb unlocked      | iPhone 13 Pro     | 256 GB  |
      | iphone 13 Pro 512 gb unlocked      | iPhone 13 Pro     | 512 GB  |
      | iphone 13 Pro 1000 gb unlocked     | iPhone 13 Pro     | 1000 GB |

      | iphone 13 Pro Max 128 gb unlocked  | iPhone 13 Pro Max | 128 GB  |
      | iphone 13 Pro Max 256 gb unlocked  | iPhone 13 Pro Max | 256 GB  |
      | iphone 13 Pro Max 512 gb unlocked  | iPhone 13 Pro Max | 512 GB  |
      | iphone 13 Pro Max 1000 gb unlocked | iPhone 13 Pro Max | 1000 GB |

      | iphone 14 128 gb unlocked          | iPhone 14         | 128 GB  |
      | iphone 14 256 gb unlocked          | iPhone 14         | 256 GB  |
      | iphone 14 512 gb unlocked          | iPhone 14         | 512 GB  |

      | iphone 14 Pro 128 gb unlocked      | iPhone 14 Pro     | 128 GB  |
      | iphone 14 Pro 256 gb unlocked      | iPhone 14 Pro     | 256 GB  |
      | iphone 14 Pro 512 gb unlocked      | iPhone 14 Pro     | 512 GB  |
      | iphone 14 Pro 1024 gb unlocked      | iPhone 14 Pro     | 1024 GB  |

      | iphone 14 plus 128 gb unlocked     | iPhone 14 Plus    | 128 GB  |
      | iphone 14 Plus 256 gb unlocked     | iPhone 14 Plus    | 256 GB  |
      | iphone 14 Plus 512 gb unlocked     | iPhone 14 Plus    | 512 GB  |


      | iphone 14 Pro Max 128 gb unlocked  | iPhone 14 Pro Max | 128 GB  |
      | iphone 14 Pro Max 256 gb unlocked  | iPhone 14 Pro Max | 256 GB  |
      | iphone 14 Pro Max 512 gb unlocked  | iPhone 14 Pro Max | 512 GB  |
      | iphone 14 Pro Max 1024 gb unlocked | iPhone 14 Pro Max | 1024 GB |
