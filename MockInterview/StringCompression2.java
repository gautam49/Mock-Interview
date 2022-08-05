package com.MockInterview;

public class StringCompression2 {
    public static int compress(char[] chars) {
        char c = chars[0];
        int count = 1;
        int j = 0;
        for (int i = 1; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            } else {
                chars[j++] = c;
                if (count != 1) {
                    if (count > 9) {
                        String ct = String.valueOf(count);
                        for (int k = 0; k < ct.length(); k++) {
                            chars[j++] = ct.charAt(k);
                        }
                    } else {
                        chars[j++] = Character.forDigit(count, 10);
                    }
                }
                c = chars[i];
                count = 1;
            }
        }
        chars[j++] = c;
        if (count != 1) {
            if (count > 9) {
                String ct = String.valueOf(count);
                for (int k = 0; k < ct.length(); k++) {
                    chars[j++] = ct.charAt(k);
                }
            } else {
                chars[j++] = Character.forDigit(count, 10);
            }
        }
        return j;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int x=compress(chars);
        System.out.println(x);
    }
}
