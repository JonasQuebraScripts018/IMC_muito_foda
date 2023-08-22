package com.example.demo.Service;

import com.example.demo.Model.M_Resposta;
import org.springframework.stereotype.Service;

@Service
public class S_mc {

    public static M_Resposta calcularMC(double altura, double peso) {
        double resul;
        altura = altura /100;
        resul = peso / (altura * altura) ;
        String resposta = "";
        if (resul < 18.5) {
            resposta += "Abaixo do peso";
        } else if (resul >= 18.5 && resul < 24.9) {
            resposta += "peso ideal";
        } else if (resul >= 24.9 && resul < 30) {
            resposta += "sobrepeso";
        } else if (resul >= 30 && resul < 34.9) {
            resposta += "obesidade Grau 1";
        } else if (resul >= 34.9 && resul < 40) {
            resposta += "obesidade Grau 2 (Severa)";
        } else {
            resposta += "obesidade Grau 3 (Mórbida)";
        }

        M_Resposta m_resposta = new M_Resposta(resposta, resul);
        return m_resposta;
    }
}