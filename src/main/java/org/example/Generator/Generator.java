package org.example.Generator;

import java.util.Random;
import java.util.UUID;

public class Generator {

    public int generateOTP(int length) {

        int maxValue = (int) Math.pow(10, length) - 1;

        Random random = new Random();

        return random.nextInt(maxValue + 1);
    }

    public String generateUUID() {

        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }

}

