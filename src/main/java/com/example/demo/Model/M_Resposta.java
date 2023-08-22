package com.example.demo.Model;

public class M_Resposta {

    private String resposta;
    private double Imc;

    public double getImc() {
        return Imc;
    }

    public void setImc(int Imc) {
        this.Imc = Imc;
    }

    public String getresposta() {
        return resposta;
    }

    public void setresposta(String mensagem) {
        this.resposta = mensagem;
    }

    public M_Resposta(String resposta, double Imc) {
        this.resposta = resposta;
        this.Imc = Imc;
    }
}
