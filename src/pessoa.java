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

        if (cpfNumeros.length() != 11 || cpfNumeros.matches("(\\d)\\1{10}"));
        return false;
        
    }
    
}
