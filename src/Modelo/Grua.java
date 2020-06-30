package Modelo;

public class Grua {
    private String PATENTE_GRUA,MARCA,MODELO,TIPO,ANIO;
    private int SERVICIO_GRUA_ID_SERVICIO,USUARIO_RUT_USUARIO;
    private  boolean ESTADO,ESTADO_DELETE;

    public Grua(){

    }

    public Grua(String PATENTE_GRUA, String MARCA, String MODELO, String TIPO, String ANIO, int SERVICIO_GRUA_ID_SERVICIO, int USUARIO_RUT_USUARIO, boolean ESTADO, boolean ESTADO_DELETE) {
        this.PATENTE_GRUA = PATENTE_GRUA;
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.TIPO = TIPO;
        this.ANIO = ANIO;
        this.SERVICIO_GRUA_ID_SERVICIO = SERVICIO_GRUA_ID_SERVICIO;
        this.USUARIO_RUT_USUARIO = USUARIO_RUT_USUARIO;
        this.ESTADO = ESTADO;
        this.ESTADO_DELETE = ESTADO_DELETE;
    }

    public String getPATENTE_GRUA() {
        return PATENTE_GRUA;
    }

    public void setPATENTE_GRUA(String PATENTE_GRUA) {
        this.PATENTE_GRUA = PATENTE_GRUA;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getANIO() {
        return ANIO;
    }

    public void setANIO(String ANIO) {
        this.ANIO = ANIO;
    }

    public int getSERVICIO_GRUA_ID_SERVICIO() {
        return SERVICIO_GRUA_ID_SERVICIO;
    }

    public void setSERVICIO_GRUA_ID_SERVICIO(int SERVICIO_GRUA_ID_SERVICIO) {
        this.SERVICIO_GRUA_ID_SERVICIO = SERVICIO_GRUA_ID_SERVICIO;
    }

    public int getUSUARIO_RUT_USUARIO() {
        return USUARIO_RUT_USUARIO;
    }

    public void setUSUARIO_RUT_USUARIO(int USUARIO_RUT_USUARIO) {
        this.USUARIO_RUT_USUARIO = USUARIO_RUT_USUARIO;
    }

    public boolean getESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }

    public boolean getESTADO_DELETE() {
        return ESTADO_DELETE;
    }

    public void setESTADO_DELETE(boolean ESTADO_DELETE) {
        this.ESTADO_DELETE = ESTADO_DELETE;
    }

    @Override
    public String toString() {
        return "Grua{" +
                "PATENTE_GRUA='" + PATENTE_GRUA + '\'' +
                ", MARCA='" + MARCA + '\'' +
                ", MODELO='" + MODELO + '\'' +
                ", TIPO='" + TIPO + '\'' +
                ", ANIO='" + ANIO + '\'' +
                ", SERVICIO_GRUA_ID_SERVICIO=" + SERVICIO_GRUA_ID_SERVICIO +
                ", USUARIO_RUT_USUARIO=" + USUARIO_RUT_USUARIO +
                ", ESTADO=" + ESTADO +
                ", ESTADO_DELETE=" + ESTADO_DELETE +
                '}';
    }
}
