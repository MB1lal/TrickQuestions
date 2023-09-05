package com.company.hackerrank;


/**
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 * Example
 *
 *
 * The alphabet is rotated by , matching the mapping above. The encrypted string is .
 * Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
 * Function Description
 * Complete the caesarCipher function in the editor below.
 * caesarCipher has the following parameter(s):
 * string s: cleartext
 * int k: the alphabet rotation factor
 * Returns
 * string: the encrypted string
 * Input Format
 * The first line contains the integer, , the length of the unencrypted string.
 * The second line contains the unencrypted string, .
 * The third line contains , the number of letters to rotate the alphabet by.
 * Constraints
 *
 *
 *  is a valid ASCII string without any spaces.
 */
public class CaesarCipher {

    private static String toLowerString(char c, int k) {
        for (int i=1; i<=k; i++) {
            char temp = (char)(1+c);
            if(temp > 'z') {
                c = 'a';
            }else {
                c = temp;
            }
        }
        return String.valueOf(c);

    }

    private static String toUpperString(char c, int k) {
        for (int i=1; i<=k; i++) {
            char temp = (char)(1+c);
            if(temp > 'Z') {
                c = 'A';
            }else {
                c = temp;
            }
        }
        return String.valueOf(c);
    }

    public static String caesarCipher(String s, int k) {
        char[] inputText = s.toCharArray();
        StringBuilder outputText = new StringBuilder();
        for (char c : inputText) {
            if(c>='a' && c<='z') {
                outputText.append(toLowerString(c,k));
            } else if(c>='A' && c<='Z') {
                outputText.append(toUpperString(c,k));
            } else {
                outputText.append(c);
            }
        }
        return outputText.toString();
    }
}
