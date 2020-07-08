package com.ywx.springbootstarterdemotest;

import com.ywx.springboot.starter.demo.AnimalService;
import com.ywx.springboot.starter.demo.BirdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 23:25
 * @description：test controller
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalService animalService;

    private final BirdService birdService;

    public AnimalController(AnimalService animalService, BirdService birdService) {
        this.animalService = animalService;
        this.birdService = birdService;
    }

    @GetMapping("/")
    public String animal() {
        animalService.doing();
        return "animal";
    }

    @GetMapping("/bird")
    public String bird() {
        birdService.doing();
        return "bird";
    }
}
