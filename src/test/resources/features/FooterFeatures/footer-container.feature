@SmokeTest
@footer-container-course-categories

Feature: footer-container-course-categories

  Background:
    Given User is on home page

  @CourseCategories
  Scenario: footer container Course Categories links should be working properly
    Then All course category links in footer container should work properly

  @MoreLinks
  Scenario: footer container More links should be working properly
    Then All More links in footer container should work properly

  @HelpLinks
  Scenario: footer container Help links should be working properly
    Then All Help links in footer container should work properly

  @AllLinks
  Scenario: footer container links should be working properly
    Then All footer container links should work properly