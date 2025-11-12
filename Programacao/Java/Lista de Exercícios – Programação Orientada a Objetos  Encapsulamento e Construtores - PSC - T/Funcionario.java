public class Funcionario {

    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(){
        this.nome = "[SEM NOME]";
    }

    public Funcionario(String nome, int matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String retornarDados(){
        return "Nome: [" + this.nome + "] - Matrícula: [" + this.matricula + "] - Salário: [R$ " + this.salario + "]";
    }

    public void reajustarSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){return this.nome;}
    public int getMatricula(){return this.matricula;}
    public double getSalario(){return this.salario;}
    public void setNome(String nome){this.nome = nome;}
    public void setMatricula(int matriucla){this.matricula = matriucla;}
    public void setSalario(double salario){this.salario = salario;}

}
