package abstrataCarro;

public abstract class Carro {
    protected String fabricante;
    protected Double peso;
    protected Double preco;
    protected Double velocidadeMaxima;
    protected Double aceleracao;
    



    public Carro (String fabricante,Double peso, Double preco, Double velocidadeMaxima, Double aceleracao){
        this.fabricante = fabricante;
        this.peso=peso;
        this.preco=preco;
        this.velocidadeMaxima = velocidadeMaxima;
        this.aceleracao = aceleracao;
        
    }

    public abstract Double aceleracaomedia();
    public abstract Double aceleracaoMaxima();
    public abstract Double calcularPreco();
    
    public void exibir(){
        System.out.println("Fabricante:"+fabricante);
        System.out.println("peso: R$ "+peso);
        System.out.println("preco"+calcularPreco());
        System.out.println("Aceleração Media:"+aceleracaomedia()+"km/h");
        System.out.println("Aceleração Maxima:"+aceleracaoMaxima()+"km/h");


    }
    
    

}
