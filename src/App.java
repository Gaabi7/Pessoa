public class App {
    public static void main(String[] args) throws Exception {
        pessoa p = new pessoa("Gabriela", 21, "Rua 5", "12345678909");

        if (p.cpfValido()) {
            System.out.println("CPF válido:"); 
        } else {
            System.out.println("Cpf Inválido");
        }
    }
}
