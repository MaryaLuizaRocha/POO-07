public class TesteFuncionario {

    public static void main(String[] args) {

        FuncionarioRegular regularA = new FuncionarioRegular("João", 20.0, 160);
        FuncionarioRegular regularB = new FuncionarioRegular("Maria", 25.0, 150);

        System.out.println("Detalhes dos funcionários regulares:");
        System.out.println("Nome: " + regularA.getNomeFuncionario() +
                ", Salário Mensal: R$" + regularA.calcularSalarioMensal());
        System.out.println("Nome: " + regularB.getNomeFuncionario() +
                ", Salário Mensal: R$" + regularB.calcularSalarioMensal());

        FuncionarioTerceirizado terceirizadoA = new FuncionarioTerceirizado("Marya", 18.0, 180, 500);
        FuncionarioTerceirizado terceirizadoB = new FuncionarioTerceirizado("Tatiane", 22.0, 160, 700);

        System.out.println("\nDetalhes dos funcionários terceirizados:");
        System.out.println("Nome: " + terceirizadoA.getNomeFuncionario() + ", Salário Mensal: R$" + terceirizadoA.calcularSalarioMensal());
        System.out.println("Nome: " + terceirizadoB.getNomeFuncionario() + ", Salário Mensal: R$" + terceirizadoB.calcularSalarioMensal());
    }
}
