public class Demo {
    public static void main (String ...args){
        Celular baseCelular = new CelularBase();
        baseCelular.creaFuncionalidad();
        System.out.println("------soy base----");

        Celular celularGamaMedia = new CelularGamaMedia(new CelularBase());
        celularGamaMedia.creaFuncionalidad();
        System.out.println("--------");

        Celular celularGamaAlta = new CelularGamaAlta(new CelularGamaMedia(new CelularBase()));
        celularGamaAlta.creaFuncionalidad();
    }
}
