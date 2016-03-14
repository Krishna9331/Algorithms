# Algorithm

It can be defined as any computational procedure that takes some value, or set of values as input and produces some value,
or set of values as output. It generally solves a well defines computational problem.


##Loop Invariant
All algorithm follows loop invariant which helps us to prove the algorithm.
The loop invariant statement always stands true irrespective of loops at any moment of time.
Using this we can theoretically proves the algorithm.

It must satisfy below three property:

#### 1. Initialization:
The invariant statement must true prior to the first iteration of the loop

#### 2. Maintenance:
It is true before the iteration of a loop and it remains true after the execution of the loop and
before the next iteration. 

#### 3. Termination: 
When the loop terminates, the invariant gives us a useful property that helps us to show that algorithm
is correct