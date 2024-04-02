class FuncionarioRegular extends Funcionario {
    public FuncionarioRegular(String nomeFuncionario, double salarioHora, int horasTrabalhadas) {
        super(nomeFuncionario, salarioHora, horasTrabalhadas);
    }

    public double calcularSalarioMensal() {
        return getSalarioHora() * getHorasTrabalhadas();
    }
}
