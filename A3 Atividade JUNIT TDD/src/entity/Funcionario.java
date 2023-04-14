package entity;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHora(horasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);
    }

    public Funcionario() {
    }

    public double calculaPagamento() {
        if (horasTrabalhadas * valorHora >= 1300) {
            return horasTrabalhadas * valorHora;
        } else {
            throw new IllegalArgumentException("Valor do pagamento abaixo do esperado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validaHora(horasTrabalhadas);
    }

    public final int validaHora(int horasTrabalhadas) {
        if (horasTrabalhadas >= 40) {
            throw new IllegalArgumentException("Horas trabalhadas excedeu o permitido");
        } else {
            return horasTrabalhadas;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    public final double validaValorHora(double valorHora) {
        if (valorHora >= (1320 * 0.04) && valorHora <= (1320 * 0.10)) {
            return valorHora;
        } else {
            throw new IllegalArgumentException("O valor da hora não está dentro do estipulado");
        }
    }
}



