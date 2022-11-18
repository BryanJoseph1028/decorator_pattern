public class CelularBase implements Celular {
    @Override
    public void creaFuncionalidad() {
        System.out.println("Basico:");
        this.addCalculadora();
    }
    private void addCalculadora(){
        System.out.println("calc");
    }
}
