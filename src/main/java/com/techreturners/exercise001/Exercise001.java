package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = (originalPrice / 100) * vatRate;
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(vat + originalPrice));
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
