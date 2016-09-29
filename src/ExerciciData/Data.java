package ExerciciData;

/**
 * Created by dcatalans on 28/09/16.
 */
public class Data {

    //#1.- atributs de classe.
    private static final String SEPARADOR = "-";

    private int dia;
    private int mes;
    private int any;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getAny() {
        return this.any;
    }
    public String getData() {
        return this.dia+SEPARADOR+this.mes+SEPARADOR+this.any;
    }

    public void setData(String data) throws Exception {
        //#2.- Comprova si la data introduida conté guions
        if (!data.contains(SEPARADOR)) throw new Exception();

        int[] dades = descomposaData(data);
        this.dia = dades[0];
        this.mes = dades[1];
        this.any = dades[2];
    }

    private int[] descomposaData(String data){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        this.dia = dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        this.mes = dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        this.any = dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }
    /*public int getAny(){
        return data != null ? descomposaData()[2] : 0;
    }*/

}

class AnyDeTresPas extends Data {

    public boolean isTrespas() {
        return getAny() % 2 == 0;
    }

}
