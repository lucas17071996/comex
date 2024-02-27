package br.com.alura.Screen.Match.modelos;

public class Pessoa {
   private String name;
   private String email;
   private int idade;

    public String getName() {
        return name;
    }
public int getIdade() {
        return idade;
}
public void setIdade(int idade) {
        this.idade = idade;
}
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}