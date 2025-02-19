# Scala Katas

A repo for practicing Scala implementation using code katas. Forked from [Teqqles/scala-katas](https://github.com/Teqqles/scala-katas) 
Feel free to download, browse through the tests and have a go with your own implementation.

If you only want to download the Kata tests these are available via the  [tests-only](https://github.com/SWH30/scala-katas/tree/tests-only) branch

## Berlin Clock
## Source: https://technologyconversations.com/2014/03/10/scala-tutorial-through-katas/
The Berlin clock is a way of displaying a 24 hour clock on a series of lamps or lights.
For the full details see [here](http://www.3quarks.com/en/BerlinClock/)


## Bowling Game
## Source: http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

The game consists of 10 frames.  In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame.  However no more than three balls can be rolled in
tenth frame.

## Fizz Buzz

[./src/main/scala/workshop/codekata/FizzBuzz.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/FizzBuzz.scala)

[./src/test/scala/FizzBuzzSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/FizzBuzzSpec.scala)

Return “fizz”, “buzz” or “fizzbuzz”.

For a given natural number greater than zero return:

“fizz” if the number is dividable by 3
“buzz” if the number is dividable by 5
“fizzbuzz” if the number is dividable by 15
the same number if no other requirement is fulfilled

## Hangman
### Source: https://en.wikipedia.org/wiki/Hangman_(game)

I know a word and I want you to guess it.  You have 9 guesses to discover the secret word or your man will be hung.

Note: This version will not draw the gallows.
```
_________
|/      |
|       0
|      \|/
|       |
|      / \
```

## NASA Countdown
### Source: http://codingkata.net/Katas/Beginner/NasaCountdown

[./src/main/scala/workshop/codekata/NasaCountdown.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/NasaCountdown.scala)

[./src/test/scala/NasaCountdownSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/NasaCountdownSpec.scala)

The NASA wants to shoot yet another rocket into orbit. As this is your first day as a wannabe scientist at the ground control, you are very excited. So excited that when the guy responsible for the countdown asks you to bring him some coffee, you accidentally spill it all over his lap and the computer – both are not capable of doing their job now.

But the liftoff is only seconds away. Somebody has to do the countdown – or the rocket can’t start and millions of dollars are lost! In a moment of great bravery you remember you learnt how to count (a long time ago in High School). So you take the chance!

The ground control chief will tell you where to start – then count to 0.
(example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)

## Numbers In Words
### Source: http://codingdojo.org/cgi-bin/index.pl?KataNumbersInWords

[./src/main/scala/workshop/codekata/NumbersInWords.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/NumbersInWords.scala)

[./src/test/scala/NumbersInWordsSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/NumbersInWordsSpec.scala)

It occurs now and then in real life that people want to write about money, especially about a certain amount of money. If it comes to cheques or contracts for example some nations have laws that state that you should write out the amount in words additionally to the amount in numbers to avoid fraud and mistakes. So if you want to transfer 745 $ to someone via cheque you have to fill out to fields:

745.00 $ (amount in numbers)

seven hundred and forty five dollars (amount in words)

this variation does not include currency.

## Ordered Jobs
### Source: http://invalidcast.tumblr.com/post/52980617776/the-ordered-jobs-kata

[./src/main/scala/workshop/codekata/OrderedJobs.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/OrderedJobs.scala)

[./src/test/scala/OrderedJobsSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/OrderedJobs.scala)

Imagine we have a list of jobs, each represented by a character. Because certain jobs must be done before others, a job may have a dependency on another job. For example, a may depend on b, meaning the final sequence of jobs should place b before a. If a has no dependency, the position of a in the final sequence does not matter.

The goal of the kata is to parse the job dependency structure and produce a sequence of jobs in the order that observes their dependency chain.

## Prime Factors
### Source: http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata

[./src/main/scala/workshop/codekata/PrimeFactors.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/PrimeFactors.scala)

[./src/test/scala/PrimeFactorsSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/PrimeFactorsSpec.scala)

Write a program to generate the prime factors for any supplied number.

## Roman Numerals Calculator
### Source: http://securesoftwaredev.com/2011/12/05/practicing-tdd-using-the-roman-numerals-kata/

[./src/main/scala/workshop/codekata/RomanNumeralsCalculator.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/RomanNumeralsCalculator.scala)

[./src/test/scala/RomanNumeralsCalculatorSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/RomanNumeralsCalculatorSpec.scala)

1. Given a single Roman numeral I can convert this to integers
2. Given multiple Roman numerals I can add these together (when supplied in order)
3. The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM')
4. The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row.
5. The symbols 'V', 'L', and 'D' can never be repeated.
6. The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM').
7. Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not).
8. The '5' symbols ('V', 'L', and 'D') can never be subtracted.

## String Calculator
### Source: http://osherove.com/tdd-kata-1/

[./src/main/scala/workshop/codekata/StringCalculator.scala](https://github.com/Teqqles/scala-katas/blob/master/src/main/scala/workshop/codekata/StringCalculator.scala)

[./src/test/scala/StringCalculatorSpec.scala](https://github.com/Teqqles/scala-katas/blob/master/src/test/scala/StringCalculatorSpec.scala)

1. Given a string "" return 0
2. Given a string containing a number "1" return that number
3. Given a string containing two numbers "1,2" calculate and return the sum of those numbers