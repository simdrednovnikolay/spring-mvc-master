package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {


    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public String getCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carService.getCarByNum(count));
        return "car";
    }

}
