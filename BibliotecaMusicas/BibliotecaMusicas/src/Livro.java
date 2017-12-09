public class Livro {

    private String Titulo;
    private String Autor;
    private String Data;
    private boolean Emprestado;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public boolean isEmprestado() {
        return Emprestado;
    }

    public void setEmprestado(boolean Emprestado) {
        this.Emprestado = Emprestado;
    }
}
