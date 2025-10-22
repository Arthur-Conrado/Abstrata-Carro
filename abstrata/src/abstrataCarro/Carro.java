package abstrataCarro;
public abstract class Carro {
    protected String fabricante;
    protected Double peso;
    protected Double preco;
    protected Double velocidadeMaxima;
    protected Double aceleracao;
    



    public Carro (String fabricante,double peso, double preco, double velocidadeMaxima, double aceleracao){
        this.fabricante = fabricante;
        this.peso=peso;
        this.preco=preco;
        this.velocidadeMaxima = velocidadeMaxima;
        this.aceleracao = aceleracao;
        
    }

    public abstract double aceleracaomedia();
    public abstract double aceleracaoMaxima();
    public abstract double calcularPreco();
    
    public void exibir(){
        System.out.println("Fabricante:"+fabricante);
        System.out.println("peso: R$ "+peso);
        System.out.println("preco"+calcularPreco());
        System.out.println("Aceleração Media:"+aceleracaomedia()+"km/h");
        System.out.println("Aceleração Maxima:"+aceleracaoMaxima()+"km/h");
        System.out.println(" ");
    }
    


    
    

}
