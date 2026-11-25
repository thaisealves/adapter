package adapter.app;

public class ProgressoAdapter extends ProgressoPercentual {

    private IProgresso progressoPaginas;
    private int totalPaginas;

    public ProgressoAdapter(IProgresso progressoPaginas, int totalPaginas) {
        this.progressoPaginas = progressoPaginas;
        this.totalPaginas = totalPaginas;
    }

    public int recuperarProgresso() {
        int paginas = Math.round(this.getPercentual() * totalPaginas / 100.0f);
        progressoPaginas.setProgresso(paginas);
        return progressoPaginas.getProgresso();
    }

    public void salvarProgresso() {
        if (progressoPaginas.getProgresso() >= totalPaginas)
            this.setPercentual(100.0f);
        else
            this.setPercentual(progressoPaginas.getProgresso() * 100.0f / totalPaginas);
    }
}
