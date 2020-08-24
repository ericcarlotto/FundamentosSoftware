import java.util.ArrayList;

public class Veiculo {
    
    private String placa;
    private String chassi;
    private String modelo;
    private String cor;
    
    public Carro(String cor, String modelo, String placa, String chassi){
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Moto(String cor, String modelo, String placa, String chassi){
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Caminhao(String cor, String modelo, String placa, String chassi){
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.modelo = modelo;
    }
}