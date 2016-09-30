package ExerciciGeometria.proves;

import ExerciciGeometria.Cercle;
import ExerciciGeometria.FiguraGeometrica;
import ExerciciGeometria.Rectangle;

/**
 * Created by dcatalans on 30/09/16.
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica f = new Cercle();
        FiguraGeometrica f2 = new Rectangle();
        //f.visualitzar();
        //f2.visualitzar();
        System.out.println(f.equals(f2));
    }


}
