package part08.pakiet1.abc.def.ghi.part09.part05;

import part09.SomeJavaBean;

public class SomeJavaBeanUsage {

    public static void main(String[] args) {

        SomeJavaBean someJavaBean = new SomeJavaBean();


    }

    public int getHello(SomeJavaBean s) {
        if (2>1) {
            return s.getX() * 167;
        } else {
            return s.getY() * 100;
        }
    }

    public void hello() {

        // użyj klasy SomeJavaBean i skorzystaj z pola x

        SomeJavaBean someJavaBean = new SomeJavaBean();
        someJavaBean.getX();



    }

    public void propertiesDemo() {

        SomeJavaBean concrete = new SomeJavaBean();

        int x = concrete.getX();  // odczytujemy "właściwość" X
        concrete.setY(x*2);

        int z = concrete.getZ();  // odczytujemy "właściwość" X
        concrete.setZ(x*2);



    }
}
