package com.company.hackerrank;


/*
    A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
NASA_Mars_Rover.jpg
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of the SOS message have been changed by radiation.
Example

The original message was SOSSOS. Two of the message's characters were changed in transit.
Function Description
Complete the marsExploration function in the editor below.
marsExploration has the following parameter(s):
string s: the string as received on Earth
Returns
int: the number of letters changed during transmission
Input Format
There is one line of input: a single string, .
Constraints


 will contain only uppercase English letters, ascii[A-Z].
Explanation
Sample 0
 = SOSSPSSQSSOR, and signal length . Sami sent  SOS messages (i.e.: ).
Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR
We print the number of changed letters, which is .
Sample 1
 = SOSSOT, and signal length . Sami sent  SOS messages (i.e.: ).
Expected Signal: SOSSOS
Received Signal: SOSSOT
We print the number of changed letters, which is .
 */
public class MarsExploration {

    private static boolean isNotValid(String s) {
        if(s.length()<1 || s.length()>99) {
            return true;
        }

        long lowerCase = s.chars().filter(x -> (x<='A' && x>='Z'))
                .count();
        if(lowerCase > 0) {
            return true;
        }
        return false;
    }

    public static int marsExploration(String s) {
        // Write your code here
        if(isNotValid(s)) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') {
                result++;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) != 'O') {
                result++;
            }
            if (i + 2 < s.length() && s.charAt(i + 2) != 'S') {
                result++;
            }
        }
        return result;
    }

}
