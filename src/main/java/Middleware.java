public abstract class Middleware {
    protected Middleware proximo;

    public Middleware setProximo(Middleware proximo) {
        this.proximo = proximo;
        return this;
    }

    public void processarRequest(Request request) {
        this.processar(request);
        if (proximo != null) {
            proximo.processarRequest(request);
        }
    }

    public abstract void processar(Request request);
}
