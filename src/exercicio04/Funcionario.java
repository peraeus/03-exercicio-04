package exercicio04;

public class Funcionario {

    // atributos ou variáveis de instância
    String nome;
    String cargo;
    double salario;

    // metodo construtor para inicializar os atributos do objeto
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        System.out.println(this);

    }


    //método para aumentar salário de acordo com uma porcentagem
    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    //método para aumentar salário de acordo com uma porcentagem
    //e de acordo com um cargo
    public void aumentarSalario(String cargo, double porcentagem) {
        if (this.cargo.equalsIgnoreCase(cargo)) { //this - é usado para diferenciar a variavel local da global/ referenciar objeto
            salario += salario * porcentagem / 100;
        }
    }

    //metodo para promover um funcionario --> alterar o cargo
    public void promover(String novoCargo) {
        cargo = novoCargo;


    }
}
