package tk.mybatis.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng.li
 * @Description: TODO
 * @date 2020/7/31 9:53
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

}
