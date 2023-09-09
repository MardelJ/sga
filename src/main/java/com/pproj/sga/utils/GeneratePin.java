package com.pproj.sga.utils;

import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Component
public class GeneratePin {
    public static int generatePin() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        return sr.nextInt(9000000) + 1000000;
    }

    public static String generateStringPin() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        int pin = sr.nextInt(9000000) + 1000000;
        return String.valueOf(pin);
    }
}
