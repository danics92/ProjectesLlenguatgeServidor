package agenda;

/**
 * Created by dcatalans on 21/09/16.
 */
class Agenda {
    private int any;

    public Agenda(int any, Pagina[] paginas) {
        this.any = any;
        this.paginas = paginas;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    private Pagina[] paginas;

    public void passar_pagina(int a){
    }
}

class Pagina{
    public Pagina(int dia, int mes, boolean festiu, Cita[] citas) {
        this.dia = dia;
        this.mes = mes;
        this.festiu = festiu;
        this.citas = citas;
    }

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

    public boolean isFestiu() {
        return festiu;
    }

    public void setFestiu(boolean festiu) {
        this.festiu = festiu;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }

    private int dia;
    private int mes;
    private boolean festiu;
    private Cita[] citas;

    public void escriure_cita(){}

    public void esborrar_cita(String id){

    }

}

class Cita{
    private String hora_inici;

    public Cita(String hora_inici, String hora_fi, String motiu) {
        this.hora_inici = hora_inici;
        this.hora_fi = hora_fi;
        this.motiu = motiu;
    }

    public String getMotiu() {
        return motiu;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    public String getHora_inici() {
        return hora_inici;
    }

    public void setHora_inici(String hora_inici) {
        this.hora_inici = hora_inici;
    }

    public String getHora_fi() {
        return hora_fi;
    }

    public void setHora_fi(String hora_fi) {
        this.hora_fi = hora_fi;
    }

    private String hora_fi;
    private String motiu;

    public void escriure_contingut(){}
}