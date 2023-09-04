package com.company.hackerrank;

public class SeparateTheNumbers {

    public static void separateNumbers(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            final String start = s.substring(0, i);

            int shift = i;
            String curr = start;
            while (true) {
                final String expected = "" + (Long.parseLong(curr) + 1);

                final int end = shift + expected.length();
                if (end > s.length()) break;

                final String next = s.substring(shift, end);
                if (!next.equals(expected)) break;

                if (end == s.length()) {
                    System.out.println("YES " + start);
                    return;
                }
                curr = next;
                shift += next.length();
            }
        }
        System.out.println("NO");
    }

}
