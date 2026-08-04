

4.10

Similarities: Both test a condition, Both control program flow

Differences: if runs once when the condition is true, while
repeats while the condition remains true

4.11

When two integers are divided in Java the result is an integer
Any decimal part is removed

Example:

java
9 / 2 = 5


To keep the decimal part use a double:

java
9.0 / 2


4.5

Control statements can be combined by:
1. Nesting one inside another. 
2. Placing them one after another sequentially

4.13

User input until finished: Sentinel-controlled repetition (stop
  when a special value like -1 is entered).
Factorial of 5: Counter-controlled repetition (loop from 1 to 5
  and multiply the numbers).

4.14

 x = 7 and y = 3:

java
x = y++;


Result: x = 3, y = 4

java
x = ++y;


Result: x = 4, y = 4

4.15

java
if (age >= 65) {
System.out.println("Age is greater than or equal to 65");
} else {
System.out.println("Age is less than 65");
}