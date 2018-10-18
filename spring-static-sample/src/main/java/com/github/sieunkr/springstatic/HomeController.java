package com.github.sieunkr.springstatic;

import com.github.sieunkr.springstatic.local.LocalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    //TODO:Registry Bean
    //private final CustomStaticRepository customStaticRepository;
    private final LocalRepository repository;

    @GetMapping
    public String test(){
        //customRepository.findOne("","");
        return "test";
    }

}
