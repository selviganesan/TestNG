
      @tag3 @SIT
      Feature: Launch
      Scenario: Launch URL
      When I Launch Demo Automation
      Then I Click Skip Signin
      Then Register Page Should get Displayed
      And I Enter First Name as "Selvi"
      And I Enter Last Name as "Ganesan"
      And I Enter Address as"79 B2 Ramasamy Konar Nagar"
      And I Enter Email Address as "selviganesansn.123@gmail.com"
      And I Enter Phone Number as "0422285623"
      And I Choose Gender  "Female"
      And I Choose Hobbies  "Cricket"
      And I Select Language as "English"
      And I Select Skill  "Software"
      And I Select Country  "India"
      And I Select Date Of Birth ""
      And I Enter Password as "8610416834"
      And I Enter Confirm Password as "8610416834"
      Then I Should Submit the Filled Form 
      But I should Not Click Refresh     
      
      