package abstrataCarro;

public class Camaro extends Carro {
    public Camaro(String fabricante,double peso,double preco,double velocidadeMaxima,double aceleracao){
        super(fabricante,peso,preco,velocidadeMaxima,preco);

    }

    
    @Override
    public  double aceleracaoMaxima(){
        return   velocidadeMaxima;
    }

    @Override
    public double aceleracaomedia(){
        double  a=aceleracao/velocidadeMaxima;
        return a;
    }

    @Override
    public double calcularPreco(){
        double a = preco /20;
        return a;
    }
    public void exibir(){
        System.out.println("Fabricante:"+fabricante);
        System.out.println("peso: R$ "+peso);
        System.out.println("preço: "+calcularPreco());
        System.out.println("Aceleração Media: "+aceleracaomedia()+"km/h");
        System.out.println("Aceleração Maxima: "+aceleracaoMaxima()+"km/h");
        System.out.println(" ");
    }
    public void mostrar(){
        System.out.println("\n Carro: "+fabricante+"\n peso do carro: "+peso+"KG "+"\n Preço do carro : R$ "+calcularPreco()+"\n Velocidade Maxima: "+aceleracaoMaxima()+"aceleração media: "+aceleracaomedia()+"M/S\n");
    }


}
