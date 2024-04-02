class FuncionarioTerceirizado extends Funcionario {
    private double adicionalTerceirizado;

    public FuncionarioTerceirizado(String nomeFuncionario, double salarioHora, int horasTrabalhadas, double adicionalTerceirizado) {
        super(nomeFuncionario, salarioHora, horasTrabalhadas);
        this.adicionalTerceirizado = adicionalTerceirizado;
    }

    public double calcularSalarioMensal() {
        return (getSalarioHora() * getHorasTrabalhadas()) + adicionalTerceirizado;
    }
}

