package oficina;

import veiculos.Veiculos;

public class Mecanico extends Veiculos{
    public void fazerRevisao(){
        Veiculos veiculos = new Veiculos();

        acelerar(); // metodo nao visivel / acessivel por conta do protected entao veiculos.acelerar
                    // nao funcionaria
    }
}
