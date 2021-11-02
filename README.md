# PRJ3 Case - Traffic Control International (TLI)
 
### Background
A new start-up named Traffic Control International Inc. (TLI) will revolutionize traffic control by moving from selling products (traffic lights) to providing services (traffic control). The plan is to go step by step from the control of isolated traffic lights via the control of orchestrated traffic lights (crossings) to intelligent traffic control (orchestrated crossing control, car-traffic light information exchange).

Targeted markets are first The Netherlands and Germany but, this should be later extended to cover   all members of the European Union. However, if the business is as successful as expected, TLI’s intelligent traffic control will conquer the world.

The task is to develop the corresponding software. This will be very demanding, as features extend into two directions. Firstly, signal cycles differ depending on the country where the traffic light is located and secondly while the business grows, additional areas like crossing control and intelligent control are to be addressed as well.   

Therefore, it is mandatory to especially focus on software maintainability and extensibility. TLI expects the stepwise feature extension to be reflected by an agile approach with weekly sprints and customer demonstrations. This means that there will not be an elaborated SRS document to start with. The first sprint should cover a basic SRS with business case, background and familiarization with the topic. This will then be extended by each further sprint.

The roadmap gives you some guidance regarding the sequence in which to address topics. Do not get lost in detail with one topic. As soon as it is covered, step forward to the next one. However, you are not expected to cover all topics.

Although application of design patterns is expected, do not do so without reason. Sometimes it is better to not apply a pattern. Students are expected to reason why a specific pattern is/is not applied.

 ---

### Roadmap

Single light control

Control of a single pedestrian light showing red and green

1. Typical pedestrian light behaviour: RED -> GREEN -> RED
2. Extended pedestrian light behaviour: RED -> GREEN -> GREEN BLINKING -> RED

Control of a single traffic light showing red, green and yellow

1. Standard traffic light behaviour (Germany): RED -> RED/YELLOW -> GREEN -> YELLOW -> RED
2. Standard traffic light behaviour (The Netherlands): RED -> GREEN -> YELLOW -> RED

Additional signals, e.g. Green Arrow (Germany)

Additional modes, e.g. night mode (blinking)

Different lights, like Donkey in Wesel (Germany) or Mainzelmännchen in Mainz (Germany) are realized by different shapes.

 ---

### Crossings
1. Simple pedestrian crossing with two pedestrian lights.
2. Four way traffic crossing (intersections). Opposite lanes will get the same signal.
3. Four way traffic crossing (intersections) including pedestrian lights.
4. Additional signals, e.g. Green Arrow (Germany)
5. Additional modes, e.g. emergency (ambulance/police/president) with green light on one side only and red on all others or night mode (blinking)
 

### Basic control - Neighbouring crossings/intersections act together
1. Green wave
2. Rush hour outbound
3. Rush hour inbound
4. Emergency
5. Events (exhibitions/festivals)
 

### Intelligent Control
  1. Crossings count traffic and adjust signalling times accordingly
  2. Crossings detects cars and adjust signalling accordingly (intelligent night mode – single approaching car)
  3. Crossings communicate with cars and adjust signalling times/signalling sequence accordingly
  4. Crossings communicate with cars and each other and adjust signalling times/signalling sequence accordingly
 

Solutions are expected to show scenarios (GUI/console).


### Supporting Material/Activities

**Scrum** There will be a Scrum rerun as well as weekly sprint reviews

**Traffic Lights** National signalling cycles and crossing control operations are to be taken from Wikipedia

**Intelligent Traffic Control** Further approaches/solutions are to be researched and added to the SRS
