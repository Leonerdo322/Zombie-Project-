# Zombie-Project-
Creating of the zombie simulation

Story: You are in a Zombie Apocalypse scenario, you and your fellow friends must survive and eat for 10 days before helps arrive. In order to survive you and your friends must fight random number of zombies each days with the guns consisting of 150 ammo, you also have to fight when running out of bullets.
Requirement:
  - You and your friends of 25 people must survive at least 10 days
  - 1 person must survive each day to move on, if everyone dies the simulation will end 
  - Have enough food for everyone to eat(HINT: instance variable for people: 25) that can last for 10 days 
  - Everyone MUST eat each day for x amount of days
  - If food runs out, everyone will dies and the simulation end 
  - you must generate random number of zombies each day with min of 10 and max of 25 for 10 days
  - if zombies kill everyone the simulation will end
  - ZOMBIES MUST BE KILLED EACH DAY TO MOVE ON
        - zombies can be kill with gun shot or blunt object 
          - A gun has a 1 in 5 chance to hit
          - If gun hits it has a 1 in 3 chance of killing instantly o A gun must hit twice to kill if the first shot is not an instant kill
          - A miss means that the shooter has a 1 in 2 chance of being killed by the zombie!
          - A blunt object has a 1 in 3 chance of hitting
          - If a blunt object hits it has a 1 in 10 chance of killing instantly
          - A blunt object must hit 3 times to kill if there are no instant kill strikes
          - A miss means that the person wielding the blunt object is dead! – you are in hand to hand combat, if you miss we assume that you are overwhelmed.
          - People will use guns if they have ammo and they will use blunt objects when the ammo is gone
Additional content:
 - Provide a mechanism to get food 
 - increase chance of survival by menipulating randomize chances
