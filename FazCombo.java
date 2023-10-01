package DesignPatterns_Facade;

public class Combo extends Produto 
{
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();
    private int tipo;


    public void FazerCombo(int tipo) {
        tipo = tipo;
        if (tipo == 1) {
         
            burguer.setGramas(250);
            burguer.setDescricao("Hamburguer Duplo");
            burguer.setPreco(8.99);
            sobremesa.setTamanho("G");
            sobremesa.setDescricao("Sundae");
            sobremesa.setPreco(7.00);
            bebida.setMl(350);
            bebida.setDescricao("Coca-Cola");
            bebida.setPreco(6.99);

        } else {
           
            burguer.setGramas(250);
            burguer.setDescricao("Vegetariano");
            burguer.setPreco(12.00);
            sobremesa.setTamanho("M");
            sobremesa.setDescricao("Sorvete");
            sobremesa.setPreco(6.00);
             bebida.setMl(400);
            bebida.setDescricao("Suco");
            bebida.setPreco(9.00);
        }
    }

    @Override
    //substituindo ou sobrescrevendo um método da superclasse
    public String toString() 
    {
        return 
        "Combo: " + tipo + "\n" +
        
        "\nHamburguer: " + burguer.getDescricao() + ";  " + burguer.getGramas()  + "  " +
        "\nSobremesa: " + sobremesa.getDescricao() + "   " + sobremesa.getTamanho() + 
        "\nBebida: " + bebida.getDescricao() + "   " + bebida.getMl() + "ml" +
        "\nValor total: " + (burguer.getPreco() + sobremesa.getPreco() +  bebida.getPreco());
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Burguer getBurguer() {
        return burguer;
    }

    public void setBurguer(Burguer burguer) {
        this.burguer = burguer;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Sobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}