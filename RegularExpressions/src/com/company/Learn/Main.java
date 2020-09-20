package com.company.Learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string.Yes I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeeFiiiij1995";
        //Regexp(".") is wildcard for all the characters
        System.out.println(alphaNumeric.replaceAll(".", "Y"));
        //Regexp("^")matches the start of the String
        System.out.println(alphaNumeric.replaceAll("^abcDee", "YYY"));

        System.out.println(alphaNumeric.matches("^abcDee"));
        //whole string should match to return true
        System.out.println(alphaNumeric.matches("^abcDeeFiiiij1995"));
        //Regexp("$")matches the end of the String
        System.out.println(alphaNumeric.replaceAll("j1995$", "THEEND"));
        //Regexp("[]") matches the letters individually and replaces each one of the with specified string
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "I replaced the letter here"));
        //each of aei if followed by F or j would be replaced
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));
        //Wether H is upper or lower case letter it will be replaced with upper case
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "abcDeeeFGhhiiiijkl99z";
        //Below regexp replcaes all letter except e and j
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "XX"));
        //Regexp are case sensitive, here all the letters will be replaced with the specified replacement string
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        //Below specifies the range as well
        System.out.println(newAlphaNumeric.replaceAll("[a-fA-F3-8]", "X"));
        //(?i) --> matches with case insensitivity
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        //Matches digits
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));

        //Replace all non digits only
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        //removes white spaces from string
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        //replaces tab
        System.out.println(hasWhiteSpace.replaceAll("\\t", "X"));
        //replaces everything other than a whitespace
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\w", "X"));
        //
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

        System.out.println(alphaNumeric.replaceAll("^abcDe{3}", "YYY"));

        String thirdAlphaNumericString = "abcDseeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("h+i*j", "YYY"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the Summary.</p>");

        String h2Pattern = "[<h2>]";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "((<h2>).*?(</h2>))";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence : " + groupMatcher.group());
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrences : " + h2TextMatcher.group(2));
        }

        //
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
        //String tNotvRegExo = "t[^v]";
        String tNotvRegExo = "t(?!v)";
        Pattern tNotvPattern = Pattern.compile(tNotvRegExo);
        Matcher tNotvMatcher = tNotvPattern.matcher(tvTest);

        count = 0;
        while (tNotvMatcher.find()) {
            count++;
            System.out.println("Occurrences " + count + " : " + tNotvMatcher.start() + " to " + tNotvMatcher.end());
        }

        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        //^4[0-9]{12}([0-9]{3})?$ --> VISA Credit Card

    }
}

