package com.web.student.randoms;

import java.util.UUID;

public class RandomId {
    public static String rId(){

        return UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0,6)
                .toUpperCase();
    }
}
