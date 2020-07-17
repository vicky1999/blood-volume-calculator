package com.vicky1999.blood_volume.api;

import com.vicky1999.blood_volume.services.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Application extends Data {

    @PostMapping("/bvc")
    public Map<Object,Object> getBV(@RequestBody Data data) {
        String gender=data.getGender();
        double height=data.getHeight();
        double weight=data.getWeight();
        height=height/100;
        Double result;
        if(gender.equalsIgnoreCase("male")) {
            result=0.3669 * Math.pow(height,3) + 0.03219 * weight + 0.6041;
        }
        else {
            result=0.3561 * Math.pow(height,3) + 0.03308 * weight + 0.1833;
        }
        Map<Object, Object> response=new HashMap<>();
        response.put("response", HttpStatus.OK);
        response.put("gender",gender);
        response.put("height",height);
        response.put("weight",weight);
        response.put("volume",result);
        return response;
    }


}
