package com.company;

public class Validator {

    public static boolean checkEmail(String email) {
        int etPos = email.indexOf("@");
        if (etPos == -1) return false;

        int etPos2 = email.lastIndexOf("@"); // blablabla@.somethingcom

        if (etPos != etPos2) return false;

        String username = email.substring(0, etPos);
        String domain = email.substring(etPos + 1);

        if (username.length() < 4 && domain.length() < 4) return false;

        if (!checkUsername(username) || !checkDomain(domain)) return false;

        return true;
    }

    private static boolean checkDomain(String domain) {
        if (domain.indexOf(".") == -1) return false;
        if (domain.charAt(0) == '.') return false;
        if (domain.charAt(domain.length() - 1) == '.') return false;
        for (int i = 0; i < domain.length() - 1; i++) {
            if (domain.charAt(i) == '.' && domain.charAt(i + 1) == '.') {
                return false;
            }
        }

        return containsOnlyDigitsLettersDots(domain);
    }

    private static boolean checkUsername(String username) {
        if (username.charAt(0) == '.') return false;

        return containsOnlyDigitsLettersDots(username);
    }

    private static boolean containsOnlyDigitsLettersDots(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i)) &&
                    !Character.isLetter(line.charAt(i)) &&
                    line.charAt(i) != '.') {
                return false;
            }
        }
        return true;
    }
}
