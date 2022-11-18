public class CelularGamaMedia extends DecoradorCelular{
    public CelularGamaMedia(Celular celular) {
        super(celular);
    }

    @Override
    public void creaFuncionalidad() {
        super.creaFuncionalidad();
        System.out.println("mas funcionalidades");
        this.addCamara();
        this.addGPs();

    }
    private void addCamara() {
        System.out.println("soy camara");
    }
    private void addGPs(){
        System.out.println("soy GPS");
    }
}
