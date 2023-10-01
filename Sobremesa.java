package DesignPatterns_Facade;

public class Sobremesa extends Produto 
{
    private String tam;

    public String getTamanho() 
    {
        return tam;
    }

    public void setTamanho(String tam) 
    {
        this.tam = tam;
    }
}