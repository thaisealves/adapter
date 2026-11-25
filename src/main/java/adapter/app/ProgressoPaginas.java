package adapter.app;

public class ProgressoPaginas implements IProgresso {

    private int paginas;

    @Override
    public int getProgresso() {
        return this.paginas;
    }

    @Override
    public void setProgresso(int paginas) {
        this.paginas = paginas;
    }
}
