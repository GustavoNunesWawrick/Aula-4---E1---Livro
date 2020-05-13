
/**
 *
 * @author Gustavo Nunes Wawrick
 */
public class Livro {

    private String titulo;
    private int codigo;
    private String autor;
    private double preco;

    public Livro() {
        titulo = "";
        codigo = 0;
        autor = "";
        preco = 0.0;
    }

    public Livro(String titulo, int codigo, String autor, double preco) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public double calculaPrecoFinal(double desconto) {
        double precoFinal = preco - preco * desconto;
        return precoFinal;
    }

    public void exibeDados() {
        System.out.println("Título: " + titulo + "\n"
                + "Código: " + codigo + "\n"
                + "Autor: " + autor + "\n"
                + "Preço: " + preco);
    }

}
