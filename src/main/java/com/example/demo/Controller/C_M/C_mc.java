package com.example.demo.Controller.C_M;

import com.example.demo.Model.M_Resposta;
import com.example.demo.Service.S_mc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_mc {

    @GetMapping("/")
    public String getLocal() {
        return "M.C";
    }

    @PostMapping("/")
    public String getDados(@RequestParam("altura") double altura,
                           @RequestParam("peso") double peso,
                           Model model) {
        M_Resposta resposta = S_mc.calcularMC(altura, peso);
        String numeroArredondado = String.format("%.2f",Double.parseDouble(String.valueOf(resposta.getImc())));

        model.addAttribute("numeroArrendondado", numeroArredondado);
        model.addAttribute("MensagemRetorno", resposta.getresposta());
        return "M.C";
    }
}
