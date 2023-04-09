package com.devcamp.s20.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devcamp.s20.restapi.service.StringService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class StringApiController {
    @Autowired
    private StringService stringService;

    @GetMapping("/reverse-string")
    public String reverseString(@RequestParam(required = true, name = "string") String string) {
        return stringService.reverseString(string);
    }

    @GetMapping("/palindrome-string")
    public String palindromeString(@RequestParam(required = true, name = "string") String string) {
        return stringService.palindromeString(string);
    }

    @GetMapping("/unique-string")
    public String uniqueCharsString(@RequestParam(required = true, name = "string") String string) {
        return stringService.uniqueCharsString(string);
    }

    @GetMapping("/concatenate-strings")
    public String uniqueCharsString(@RequestParam(required = true, name = "string1") String string1,
            @RequestParam(required = true, name = "string2") String string2) {
        return stringService.concatenateStrings(string1, string2);
    }
}
