package adapter.app;

public class Leitor {

    IProgresso progresso;
    ProgressoAdapter persistencia;

    public Leitor(int totalPaginas) {
        progresso = new ProgressoPaginas();
        persistencia = new ProgressoAdapter(progresso, totalPaginas);
    }

    public void setProgresso(int paginas) {
        progresso.setProgresso(paginas);
        persistencia.salvarProgresso();
    }

    public int getProgresso() {
        return persistencia.recuperarProgresso();
    }

    public float getPercentual() {
        return persistencia.getPercentual();
    }
}
