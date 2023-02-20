package com.hjt.course01.controller;

import com.hjt.course01.entity.User;
import com.hjt.course01.others.BusinessErrorException;
import com.hjt.course01.others.BusinessMsgEnum;
import com.hjt.course01.util.JsonResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ec")
@RestController
public class ExceptionController {

    @PostMapping("/e1")
    public JsonResult e1(User user ){
        System.out.println("1");
        int[] ints = new int[10];

        try {
            System.out.println(ints[11]);
        }catch (Exception e){
            throw new BusinessErrorException(BusinessMsgEnum.PARMETER_BIG_EXCEPTION);
        }
        System.out.println(user);
        return new JsonResult();
    }

}
