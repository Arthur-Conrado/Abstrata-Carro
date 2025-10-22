package abstrataCarro;

public class Mustang extends Carro {
     public Mustang(String fabricante,double peso,double preco,double velocidadeMaxima,double aceleracao){
        super(fabricante,peso,preco,velocidadeMaxima,preco);

    }

    @Override
    public  double aceleracaoMaxima(){
        return   velocidadeMaxima;
    }

    @Override
    public double aceleracaomedia(){
        double  a=velocidadeMaxima/2;
        return a;
    }

    @Override
    public double calcularPreco(){
        double imposto = 150;
        double a = preco - imposto;
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
        System.out.println("\n Carro: "+fabricante+"\n peso do carro: "+peso+"KG "+"\n Preço do carro : R$ "+calcularPreco()+"\n Velocidade Maxima: "+aceleracaoMaxima()+"\n aceleração media: "+aceleracaomedia()+"M/S\n");
    }


}
