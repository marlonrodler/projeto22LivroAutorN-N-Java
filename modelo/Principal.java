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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Autor> listAutores = new ArrayList<>();

        Autor autor01 = new Autor();
        Autor autor02 = new Autor();
        Livro livro01 = new Livro();
        Livro livro02 = new Livro();

        autor01.setNome("Marlon");
        autor01.setEmail("marlon@hotmail.com");
        autor01.setAnoNasc(2000);

        autor02.setNome("Thiago");
        autor02.setEmail("thiago@hotmail.com");
        autor02.setAnoNasc(2000);

        livro01.setTitulo("Sistemas Operacionais");
        livro01.setEditora("Fatec");
        livro01.setAno(2018);

        livro02.setTitulo("Estatistica");
        livro02.setEditora("Fatec");
        livro02.setAno(2018);

        autor02.setObras(livro01);
        autor02.setObras(livro02);

        listAutores.add(autor01);
        listAutores.add(autor02);

        livro01.setEscritores(listAutores);

        System.out.println("O livro '" + livro01.getTitulo() + "' contém como autores:");
        for (int j = 0; j < livro01.getEscritores().size(); j++) {
            System.out.println(listAutores.get(j).getNome());
        }

        System.out.println("\nO escritor '" + autor02.getNome() + "' escreveu os livros:");
        autor02.getObras();

    }

}
