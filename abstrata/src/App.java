import abstrataCarro.Camaro;
import abstrataCarro.Celta;
import abstrataCarro.Murcealagro;
import abstrataCarro.Mustang;
public class App {
    public static void main(String[] args)  {
        Celta celta = new Celta ("gol",1000,20.00, 180,10);
        Mustang mustang = new Mustang("Ford",1500,1900,290,9);
        Camaro camaro = new Camaro("wolsk",1800,90.00,250,10);
        Murcealagro murcealagro= new Murcealagro("lamborguini",3000,2500,350,5);
        
        camaro.exibir();
        camaro.mostrar();

        celta.exibir();
        celta.mostrar();

        murcealagro.mostrar();
        murcealagro.exibir();

        mustang.exibir();
        mustang.mostrar();



    }
}
