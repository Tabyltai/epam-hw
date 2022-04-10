package com.epam.homework.hw2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(countOfNumbersInString("a123")); // Количество цифр в строке
        System.out.println(divideStringByEvenIndex("a123")[0] + " " + divideStringByEvenIndex("a123")[1]); // Четные и нечетные символы разделить по разным строкам
        System.out.println(createStringOnlyByLetters("abcd123")); // Вводится строка из букв и цифр, построить новую только из цифр
        System.out.println(deletingSameChars("aa1231211aaa")); // Удаление одинаковых символов
        System.out.println(frequencyOfSymbol("12", '1')); // Частота встречаемости символа в строке
        System.out.println(reverseString("12")); // Частота встречаемости символа в строке
        System.out.println(countOfSubStringInString("1212217890", "1212")); // Количество вхождений подстроки в строку
        System.out.println(reverseStrings("1212217890 123")[0] + " " + reverseStrings("1212217890 123")[1]); // Вывести слова строки в обратном порядке
        System.out.println(sortStringsByAlphabet("asdasdasd")); // Вывести слова строки в обратном порядке
        System.out.println(minLengthOfSubString("asdasdasd 12 123")); // Определить длину самого короткого слова в строке
        System.out.println(countOfSubString("asdasdasd 12 123")); // Подсчет количества слов в строке
        System.out.println(addSpace("asdasdasd 12 123", 1, 2)); // Добавление пробелов в строку
        System.out.println(isPalindrome("1321")); //Является ли строка палиндром?
        System.out.println(replaceSubstring("1321", "132", "1")); //Замена подстроки в строке
        System.out.println(diffBetweenSubstring("1321  123")); //Расстояние между подстроками
    }


    public static int diffBetweenSubstring(String s) {
        int count = 0;
        if (Objects.nonNull(s)) {
            s = s.trim();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                } else if (count > 0) {
                    return count;
                }
            }
        }
        return count;
    }

    public static String replaceSubstring(String s, String sub, String newSub) {
        if (Objects.nonNull(s) && Objects.nonNull(sub) && Objects.nonNull(newSub)) {
            return s.replace(sub, newSub);
        }
        return null;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reverse = new StringBuilder();
        if (Objects.nonNull(s)) {
            for (int i = s.length() - 1; i >= 0; i--) {
                reverse.append(s.charAt(i));
            }
            return s.equals(reverse.toString());
        }
        return false;
    }

    public static String addSpace(String s, int pos, int numberOfSpace) {
        if (Objects.nonNull(s)) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i == pos) {
                    res.append(" ".repeat(numberOfSpace));
                }
                res.append(s.charAt(i));
            }
            return res.toString();
        }
        return null;
    }

    public static int countOfSubString(String s) {
        int count = 0;
        if (Objects.nonNull(s)) {
            count = s.trim().split("\\s+").length;
        }
        return count;
    }

    public static int minLengthOfSubString(String s) {
        int count = 0;
        if (Objects.nonNull(s)) {
            count = Integer.MAX_VALUE;

            String[] strings = s.trim().split("\\s+");
            for (String a : strings) {
                count = Math.min(count, a.length());
            }
        }
        return count;
    }

    public static String sortStringsByAlphabet(String s) {
        String res = "";
        if (Objects.nonNull(s)) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] < chars[j]) {
                        char temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;
                    }
                }
            }
            res = String.valueOf(chars);
        }
        return res;

    }

    public static String[] reverseStrings(String s) {
        String[] res = null;
        if (Objects.nonNull(s)) {
            int j = 0;
            String[] strings = s.trim().split("\\s+");
            res = new String[strings.length];
            for (int i = strings.length - 1; i >= 0; i--) {
                res[j] = strings[i];
                j++;
            }
        }
        return res;
    }

    public static int countOfSubStringInString(String s, String sub) {
        int count = 0;
        if (Objects.nonNull(s) && Objects.nonNull(sub)) {
            int l = sub.length();
            if (l <= s.length()) {
                for (int i = 0; i < s.length(); i++) {
                    if (i + l < s.length() && s.substring(i, i + l).equals(sub)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        if (Objects.nonNull(s)) {
            for (int i = s.length() - 1; i >= 0; i--) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }

    public static int frequencyOfSymbol(String s, char a) {
        int count = 0;
        if (Objects.nonNull(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == a) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String deletingSameChars(String s) {
        StringBuilder res = new StringBuilder();
        if (Objects.nonNull(s)) {
            for (int i = 0; i < s.length(); i++) {
                boolean containsChar = false;
                for (int j = 0; j < res.length(); j++) {
                    if (s.charAt(i) == res.charAt(j)) {
                        containsChar = true;
                        break;
                    }
                }
                if (!containsChar) {
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    }

    public static int countOfNumbersInString(String s) {
        int count = 0;
        if (Objects.nonNull(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String createStringOnlyByLetters(String s) {
        StringBuilder res = new StringBuilder();
        if (Objects.nonNull(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    }

    public static String[] divideStringByEvenIndex(String s) {
        String[] res = new String[2];
        res[0] = "";
        res[1] = "";
        if (Objects.nonNull(s)) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    res[0] += s.charAt(i);
                } else {
                    res[1] += s.charAt(i);

                }
            }
        }
        return res;
    }
}
