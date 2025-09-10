package com.web.student.randoms;

import java.util.UUID;

public class RandomId {
    public String rId(){
        String id = UUID.randomUUID()
                .replace("-", "")
                .substring(0,6)
                .toUpperCase();

        return id;
    }
}
