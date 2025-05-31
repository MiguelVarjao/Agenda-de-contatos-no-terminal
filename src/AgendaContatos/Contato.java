package AgendaContatos;

public class Contato {

    private String nomes;
    private int telefones;

    public Contato(String nomes, int telefones) {

        this.nomes = nomes;
        this.telefones = telefones;
    }

    public int getTelefones() {
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
