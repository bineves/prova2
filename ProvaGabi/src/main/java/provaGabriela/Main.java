/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaGabriela;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("6542", "Beatriz", "6252-938", "4123-9272", new Endereco("Rua Um", "521", "Bloco A", "541-282", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.FEMININO, 11500, EstadoCivil.CASADO, LocalDate.of(2003, Month.AUGUST, 31));
        Motoboy motoboy = new Motoboy("5282", "Lucas", "414-393", "32213", new Endereco("Rua Dois", "12", "Bloco B", "625-291", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.MASCULINO, 2300, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.MARCH, 22));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Renata", "5142-921", "3132-91", new Endereco("Rua Tres", "234", "Bloco C", "7256-202", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.JURIDICO, Genero.FEMININO, 7550, EstadoCivil.CASADO, LocalDate.of(1992, Month.DECEMBER, 18));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Luciano", "524-291", "32436-022", new Endereco("Rua Quatro", "21", "Bloco D", "7629-21", "Salvador", UnidadeFederativa.BAHIA), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 21500, EstadoCivil.CASADO, LocalDate.of(1973, Month.FEBRUARY, 20));
         
     
        diretor.demitir(motoboy);
        System.out.println(gerente);
        System.out.println(engenheiro);
        System.out.println(diretor);
        }
}
