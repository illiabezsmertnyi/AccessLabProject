Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check name of the headline
    Given User opens '<homePage>' page
    When User clicks 'News' button
    Then User checks that name of the headline article are '<keyword>'

    Examples:
      | homePage             | keyword                                         |
      | https://www.bbc.com/ | Alec Baldwin fatally shoots woman with prop gun |

  Scenario Outline: Check secondary article titles
    Given User opens '<homePage>' page
    When User clicks 'News' button
    Then User checks that secondary article titles are '<keyword>' in '<number>'

    Examples:
      | homePage             | keyword                                             | number |
      | https://www.bbc.com/ | Queen back at Windsor after hospital stay           | 0      |
      | https://www.bbc.com/ | Biden says US will defend Taiwan if China attacks   | 1      |
      | https://www.bbc.com/ | Tuskless elephant evolution linked to ivory hunting | 2      |
      | https://www.bbc.com/ | The four-year-old footballer recruited by Arsenal   | 3      |

  Scenario Outline: Check search field works correctly
    Given User opens '<homePage>' page
    And User clicks 'News' button
    When User stores the text of the category link of the headline article
    And User enter this text in the search bar
    Then User checks that name of the first article is '<keyword>'

    Examples:
      | homePage             | keyword                                       |
      | https://www.bbc.com/ | Ros Atkins On...: The North America Heatwaves |

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User clicks 'News' button
    When User clicks 'Coronavirus' button
    And User clicks 'Stories' button
    And User clicks 'Question' button
    Then User enter '<keyword>' in description field
    And User enter '<name>' in name field
    And User enter '<email>' in email field
    And User enter '<number>' in number field
    And User enter '<location>' in location field
    And User clicks accept terms button
    And User clicks 'Submit' button

    Examples:
      | homePage             | keyword | name | email | number | location |
      | https://www.bbc.com/ | Hello!  |Hello!  |Hello!  |Hello!  |Hello!  |

