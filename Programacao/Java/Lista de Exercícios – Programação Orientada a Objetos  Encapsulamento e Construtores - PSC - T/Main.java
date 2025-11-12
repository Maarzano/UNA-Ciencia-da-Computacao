public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario("Arthur", 314, 456.32);

        System.out.println(func1.retornarDados());
        System.out.println(func2.retornarDados());

        func2.reajustarSalario(1000.45);
        System.out.println(func2.retornarDados());
        
    }

}
