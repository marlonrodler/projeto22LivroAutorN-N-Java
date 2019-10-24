/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Autor {

    private String nome;
    private int anoNasc;
    private String email;
    private ArrayList<Livro> obras;

    public Autor() {
        this.obras = new ArrayList<>();
    }

    public Autor(String nome, int anoNasc, String email, ArrayList<Livro> obras) {
        this.obras = new ArrayList<>();
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
        this.obras = obras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getObras() {
        for (int j = 0; j < obras.size(); j++) {
            System.out.println(this.obras.get(j).getTitulo());
        }
    }

    public void setObras(Livro obra) {
        this.obras.add(obra);
    }

}
