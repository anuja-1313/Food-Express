package com.foodexpress.utils;

import java.util.UUID;

public class Helper {


    public static String generateRandomId() {
        //change id generation logic
        return UUID.randomUUID().toString();
    }

}
