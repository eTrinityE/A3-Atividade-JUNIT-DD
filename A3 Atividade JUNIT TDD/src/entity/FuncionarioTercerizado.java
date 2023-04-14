package entity;

public class FuncionarioTercerizado extends Funcionario{
    private double despesasAdicionais;

    public FuncionarioTercerizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
    }

    public FuncionarioTercerizado() {}

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double despesasAdicionais) {
        this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
    }

    public final double validaDespesasAdicionais(double despesasAdicionais){
        if(despesasAdicionais > 1000){
            throw new IllegalArgumentException("Valor das despesas adicionais excedeu o permitido");
        }else{
            return despesasAdicionais;
        }
    }
}

