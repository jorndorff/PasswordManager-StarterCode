
Password Manager
================

A program that helps with password management. 


![XKCD Comic](http://imgs.xkcd.com/comics/password_strength.png)

Password Complexity
-------------------------

The chart below lists the value n, where n is the possible search space for characters in the password. It also gives the “bits” required try every possible combination of a password, for a character of that type. You can think of a bit as the exponent of base 2 (2<sup>NumberOfBits</sup>), the total value of which closely resembles the number of tries it will take to brute force crack the password. 


| Types of characters used                |  n  | Bits |
| ------------------------                | --- | ---- |
| Digits                                  | 10  | 3.3  |
| Case insensitive letters                | 26  | 4.7  |
| Case insensitive alphanumeric           | 36  | 5.1  |
| Case sensitive letters                  | 52  | 5.7  |
| Case sensitive alphanumeric             | 62  | 6.0  |
| Case sensitive alphanumeric and symbols | 95  | 6.6  |


### Dictionary Attacks
Just using a combination of different types of characters is not enough though. If there are consecutive lowercase letters for example, the password is more likely to contain a word. Passwords that contain words are less secure than passwords *of the same length* that do not contain words because they can be guessed with the help of a dictionary. Since doing a dictionary lookup is difficult, we will instead penalize consecutive similar values.


So based on this information, your algorithm should look like the following:


Depending on the total letter complexity, add the proper amount of bits for each character. If a character is the same (e.g., lower case letter, upper case letter, number, symbol) as the one that comes before it, that should subtract a bit of complexity. 


| Password        | Bits |
| --------        | ---- |
| pingry          | 6 * 4.7 - 5 = 23.2  |
| GoBigBlue       | 9 * 5.7 - 3 = 48.3  |
| goBIGBLUE!!1!   | 13 * 6.6 - 8 = 77.8 |
| B$e@k!n&b@d5/A> | 15 * 6.6 = 99       |


The Assignment
--------------
### Computation Methods
Implement the four methods outlined in the PasswordManager.java file.

### Interactive Program
Create a `PasswordComparison` class which has a main method to use your four methods from PasswordManager.java. The program should ask the user to enter a password for analysis, and compare it to a randomly generated password.

Example Execution:
```
Enter a password for testing: ReallyLongPasswordsAreBetterThan95%ofpasswords
Comparing to random password: We4$kl8*j`O
Enter an encryption key: keykey123

ReallyLongPasswordsAreBetterThan95%ofpasswords
----------------
Meets Traditional Criteria: NO
Strength: 185
Encrypted Version: dsaob$#@T523gvoruvber8

We4$kl8*j`O
----------------
Meets Traditional Criteria: YES
Strength: 100
Encrypted Version: sdauvhp7rhh324G@#rf
```

### Documentation
I've already written *most* of the javadoc for you. You're welcome to use it as is, or make it better.

This README is also sketched out, but it is currently written as an assignment. When you finish the lab, Delete this section of the README, and fill in the sections below. The Usage section should tell your users what the program does, and how it is ueful as well as what commands to use to run it. You're welcome to use my example execution from above, but you may also write in your own style.

Usage
-----

Authors and License
-------------------
