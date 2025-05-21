public class pessoa {
    
    //Atributos 
    private String nome;
    private int idade;
    private String endereco;
    private String cpf;

    //Contrutor
    public pessoa (String nome, int idade, String endereco, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    } 

    public String getCpf() {
        return cpf;
    }

    public boolean cpfValido() {
        String cpfNumeros = cpf.replaceAll("\\D", "");

        if (cpfNumeros.length() != 11 || cpfNumeros.matches("(\\d)\\1{10}"))
        return false;
        
        int soma1 = 0, soma2 = 0;
        for (int i = 0; i < 9; i++) {
            int num = cpfNumeros.charAt(i) - '0';
            soma1 += num * (10 - i);
            soma2 += num * (11 - i);
        }

        int dig1 = (soma1 * 10) % 11;
        if (dig1 == 10) dig1 = 0;
        soma2 += dig1 * 2;

        int dig2 = (soma2 * 10) % 11;
        if (dig2 == 10) dig2 = 0;

        return dig1 == (cpfNumeros.charAt(9) - '0') && dig2 == (cpfNumeros.charAt(10) - '0');
    }   
}
