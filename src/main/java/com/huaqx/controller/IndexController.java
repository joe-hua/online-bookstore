package com.huaqx.controller;

import com.huaqx.pojo.BookSnapshot;
import com.huaqx.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/")
    public String index(Model model){
        ArrayList<BookSnapshot> random8Books = bookService.getRandom8Books();
        model.addAttribute("random8Books",random8Books);
        return "index";

    }

    @RequestMapping("/index")
    public String index1(Model model){
        ArrayList<BookSnapshot> random8Books = bookService.getRandom8Books();
        model.addAttribute("random8Books",random8Books);
        return "index";
    }


}
