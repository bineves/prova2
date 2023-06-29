/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaGabriela;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao {
    private double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }


    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return "\nDiretor" + 
                super.toString() +
                "\nPREMIO: " + PREMIO + "%" +
                 "\nSalário Final: " + Util.formatarDinheiro(getSalarioFinal());
    }

    @Override
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal += super.salario + this.PREMIO;
        SalarioFinal += super.salario;
        return SalarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.toString());
    }
    
    
    
}
