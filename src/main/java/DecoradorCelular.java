public abstract class DecoradorCelular implements Celular {
    private final Celular celular;
    public DecoradorCelular(Celular celular)
    {
        this.celular=celular;
    }

    @Override
    public void creaFuncionalidad() {
        this.celular.creaFuncionalidad();
    }
}
