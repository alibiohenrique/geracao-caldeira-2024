package hora_da_pratica.desafio05;

public class Desafio05 {
    public static void main(String[] args) {
        Podcast pod = new Podcast(5, 100, 37, 190, "Talking shit");
        pod.listar();
        pod.classificar(5);
        pod.classificar(5);
        pod.classificar(5);
        pod.listar();

    }
}

class Audio {
    private String titulo;
    private double duracao;
    private int curtidas;
    private int totalReproducoes;
    private double classificacao;

    public Audio() {
    }

    public Audio(double classificacao, int totalReproducoes, int curtidas, double duracao, String titulo) {
        this.classificacao = classificacao;
        this.totalReproducoes = totalReproducoes;
        this.curtidas = curtidas;
        this.duracao = duracao;
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public double getClassificacao() {
        return classificacao;
    }
}

interface AudioTools {

    void reproduzir();

    void curtir();

    void classificar(double classificacao);

    double atualizarClassificacao();

    void listar();

}

class Podcast extends Audio implements AudioTools {

    private int contadorClassificacao;

    public Podcast(double classificacao, int totalReproducoes, int curtidas, double duracao, String titulo) {
        super(classificacao, totalReproducoes, curtidas, duracao, titulo);
        contadorClassificacao++;
    }

    @Override
    public void reproduzir() {
        this.setTotalReproducoes(getTotalReproducoes() + 1);
    }

    @Override
    public void curtir() {
        this.setTotalReproducoes(getCurtidas() + 1);
    }

    @Override
    public void classificar(double classificacao) {
        this.setClassificacao(getClassificacao() + classificacao);
        contadorClassificacao++;
        atualizarClassificacao();
    }
    @Override
    public double atualizarClassificacao() {
        double classificacao = getClassificacao() / contadorClassificacao;
        setClassificacao(classificacao);
        return classificacao;
    }

    @Override
    public void listar() {
        System.out.println("#".repeat(30));
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Duracao: " + this.getDuracao());
        System.out.println("Curtidas: " + this.getCurtidas());
        System.out.println("Total de reproducoes: " + this.getTotalReproducoes());
        System.out.printf("Clasificacao: %.2f \n", this.getClassificacao());
        System.out.println("#".repeat(30));
    }

}

class Musicas extends Audio implements AudioTools {

    private String artista;
    private int contadorClassificacao;

    public Musicas(double classificacao, int totalReproducoes, int curtidas, double duracao, String titulo, String artista) {
        super(classificacao, totalReproducoes, curtidas, duracao, titulo);
        this.artista = artista;
    }

    @Override
    public void listar() {
        System.out.println("#".repeat(30));
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Artista: " + this.artista);
        System.out.println("Duracao: " + this.getDuracao());
        System.out.println("Curtidas: " + this.getCurtidas());
        System.out.println("Total de reproducoes: " + this.getTotalReproducoes());
        System.out.printf("Clasificacao: %.2f \n", this.getClassificacao());
        System.out.println("#".repeat(30));
    }

    @Override
    public double atualizarClassificacao() {
        double classificacao = getClassificacao() / contadorClassificacao;
        setClassificacao(classificacao);
        return classificacao;
    }

    @Override
    public void classificar(double classificacao) {
        this.setClassificacao(getClassificacao() + classificacao);
        contadorClassificacao++;
        atualizarClassificacao();

    }

    @Override
    public void curtir() {
        this.setTotalReproducoes(getCurtidas() + 1);

    }

    @Override
    public void reproduzir() {
        this.setTotalReproducoes(getTotalReproducoes() + 1);
    }
}