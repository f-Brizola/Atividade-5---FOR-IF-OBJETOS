package Objetos;

public class Carro {

    public String nome;
    public String marca;
    public String cor;
    public int ano;
  
    public Carro() {
        
    }

   public Carro(String nome) {
       this.nome = nome;
   }

    public Carro(int ano) {
        this.ano = ano;
    }

   public Carro(String nome, String marca) {
       this.nome = nome;
       this.marca = marca;
   }
   
   public Carro(String nome, String marca, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
   }
   
   public Carro(String nome, String marca, String cor, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
   }
}


package Main;

import Objetos.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "Hilux";
        carro1.marca = "Toyota";
        carro1.cor = "Prata";
        carro1.ano = 2023;

        Carro carro2 = new Carro("Uno","Fiat","Branco");

        carro2.ano = 2014;
        
        System.out.println("Nome: " + carro1.nome + " Marca: " + carro1.marca + " Cor: " + carro1.cor + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Marca: " + carro2.marca + " Cor: " + carro2.cor + " Ano: " + carro2.ano);
    }
}
