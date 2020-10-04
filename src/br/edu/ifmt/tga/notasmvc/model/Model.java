package br.edu.ifmt.tga.notasmvc.model;
    
    public class Model {
    
    private double v1 = 0, v2 = 0, r = 0;
    private int operacao;
    private String discA, discB;
    private float mensal, bim, att, bim1, bim2, bim3, bim4, mediaA, mediaB;
    
    public void setValor1(double valor1, int oper){
        this.v1 = valor1;
        this.operacao = oper;
    }
    
    public double getValor1(){        
        return v1;        
    }
    
    public double getOperacao(){
        return operacao;
        
    }
    
    public void setValor2(double valor2){
        this.v2 = valor2;
    }
    
    public double getValor2(){        
        return v2;        
    }
    
    public double resultado(){
        if(getOperacao() == 1){
           this.r = getValor1() + getValor2();
        }
        if(getOperacao() == 2){
           this.r = getValor1() - getValor2();
        }
        if(getOperacao() == 3){
            this.r = getValor1() * getValor2();
        }
        if(getOperacao() == 4){
            this.r = getValor1() / getValor2();
        }
        return this.r;
    }
    
    public float getMediaA() {
        return mediaA;
    }
    
    public void setMediaA() {
        this.mediaA = ((bim1*2)+(bim2*2)+(bim3*3)+(bim4*3))/10;
    }
    
    public float getMediaB(){
        return mediaB;
    }
    
    public void setMediaB(){
        this.mediaB = (float) ((((mensal + bim)/2) * 0.8) + att);
    }
    
    public String getDiscA() {
        return discA;
    }
    
    public void setDiscA(String disc) {
        this.discA = disc;
    }
    
    public float getBim1() {
        return bim1;
    }
    
    public void setBim1(float bim1) {
        this.bim1 = bim1;
    }
    
    public float getBim2() {
        return bim2;
    }
    
    public void setBim2(float bim2) {
        this.bim2 = bim2;
    }
    
    public float getBim3() {
        return bim3;
    }
    
    public void setBim3(float bim3) {
        this.bim3 = bim3;
    }
    
    public float getBim4() {
        return bim4;
    }
    
    public void setBim4(float bim4) {
        this.bim4 = bim4;
    }

    public String getDiscB() {
        return discB;
    }

    public void setDiscB(String discB) {
        this.discB = discB;
    }

    public float getMensal() {
        return mensal;
    }

    public void setMensal(float mensal) {
        this.mensal = mensal;
    }

    public float getBim() {
        return bim;
    }

    public void setBim(float bim) {
        this.bim = bim;
    }

    public float getAtt() {
        return att;
    }

    public void setAtt(float att) {
        this.att = att;
    }
    
    

}
