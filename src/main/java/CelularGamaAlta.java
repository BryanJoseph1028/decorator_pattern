public class CelularGamaAlta extends DecoradorCelular{

    public CelularGamaAlta(Celular celular) {
        super(celular);
    }

    @Override
    public void creaFuncionalidad() {
        super.creaFuncionalidad();
        this.addpantallatactil();
        this.addstreaming();

    }
    private void addpantallatactil(){
        System.out.println("soy tactil");
    }
    private void addstreaming(){
        System.out.println("soy streaming");
    }
}
