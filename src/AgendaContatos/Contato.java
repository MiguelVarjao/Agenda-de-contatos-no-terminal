package AgendaContatos;

public class Contato {

    private String nomes;
    private String telefones;

    public Contato(String nomes, String telefones) {

        this.nomes = nomes;
        this.telefones = telefones;
    }

    public String getTelefones() {
        return telefones;
    }

    public String getNomes() {
        return nomes;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomes + " | Telefone: " + telefones + "\n";
    }
}
