package pt.docesesalgados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/encomendas")
    public String encomendas() {
        return "encomendas";
    }

    @RequestMapping("/receitas")
    public String receitas() {
        return "receitas";
    }    
    
    @RequestMapping("/stock")
    public String stock() {
        return "stock";
    }    
    
}