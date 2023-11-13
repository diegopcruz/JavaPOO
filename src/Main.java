import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Gato gato1 = new Gato("Felix", "preto", 15, 2.5, "carinho");
        Passaro passaro1 = new Passaro("Frajola", "amarelo", 5, 0.25, "carinho");
        Cachorro cachorro1 = new Cachorro("Marley", "Branco", 50, 10.5, 20, "carinho");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();








        /*
        Passaro passaro1 = new Passaro("Frajola", "amarelo", 5, 0.25, "carinho");

        Cachorro cachorro1 = new Cachorro("Marley", "Branco", 50, 10.5, 20, "carinho");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

         */







        /*
        Cachorro cachorro1 = new Cachorro("Marley", "Branco", 50, 10.5, 20, "carinho");

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Rex", "Branco", 50, 10.5, 20, "carinho");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

        // Estudar sobre ENUM

         */

        /*
        System.out.printf("Hello Word!");

        byte variavelByte = -127;
        // short -32768 a 32767
        // char 0 a 65535
        // int -2b a 2b
        // long -9t a 9t

        int variavelInt = 2147483;

        System.out.println(variavelByte);
        System.out.println(variavelInt);
         */

    }


}