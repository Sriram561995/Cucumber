Feature: Shout Feature
@tag1
Scenario: Voice Audible
Given Sean is 20 meters away {from} Lucia
When Sean shouts free "coffee" 
Then Lucia hears the message 
@tag2
Scenario: Voice not Audible
Given Sean is 20 meters away {from} Lucia
When Sean shouts free "coffee" 
Then Lucia cannot hear the message 