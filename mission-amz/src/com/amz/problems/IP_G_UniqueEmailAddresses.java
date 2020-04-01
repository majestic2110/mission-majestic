package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class IP_G_UniqueEmailAddresses extends AbstractQuestion {

    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
            return 0;
        }
        Set<String> names = new HashSet<>();
        StringBuilder buff = null;
        for (String curName : emails) {
            names.add(processEmail(curName));
        }
        return names.size();
    }

    private String processEmail(String email) {
        StringBuilder buff = new StringBuilder();
        boolean skip = false;
        int i = -1;
        for (char ch : email.toCharArray()) {
            i++;
            if (ch == '@') {
                break;
            } else if (skip || ch == '.') {
                continue;
            } else if (ch == '+') {
                skip = true;
                continue;
            } else {
                buff.append(ch);
            }
        }
        buff.append(email.substring(i));
        return buff.toString();
    }

    @Override
    @Test
    public void evaluate() {
        IP_G_UniqueEmailAddresses test = new IP_G_UniqueEmailAddresses();
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println("No. of Unique Emails := " + test.numUniqueEmails(emails));
    }
}
