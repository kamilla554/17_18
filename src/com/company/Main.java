package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());

        str = scanner.nextLine();
        pattern = Pattern.compile("[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:" +
                "[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:" +
                "[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]");
        matcher = pattern.matcher(str);
        System.out.println(matcher.matches());

        str = "ergerger5.22 USD regergh erg ee423423.11 RURrfg 2 USD rgerg 333.11 USD reg 1.111USD";
        pattern = Pattern.compile("\\d+(\\.\\d{2})?\\s(USD|RUR|EU)");
        matcher = pattern.matcher(str);
        //System.out.println(,a);
        while(matcher.find())
            System.out.println(matcher.group());

    }
}