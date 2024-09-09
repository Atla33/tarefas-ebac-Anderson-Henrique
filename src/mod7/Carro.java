package mod7;

public class Carro {


    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean motorLigado;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motorLigado = false; // O motor começa desligado
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    //Métodos simples

    // Método para ligar o carro
    public void ligarCarro() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    //Método para desligar o carro
    public void desligarCarro() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Motor ligado: " + (motorLigado ? "Sim" : "Não"));
    }
}

// sempre usar git push --set-upstream origin mod09 quando criar uma branch nova

