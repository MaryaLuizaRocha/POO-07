class Funcionario {
    private String nomeFuncionario;
    private double salarioHora;
    private int horasTrabalhadas;

    public Funcionario(String nomeFuncionario, double salarioHora, int horasTrabalhadas) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}

