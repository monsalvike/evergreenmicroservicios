package com.arquitectura.reporte.models;

public class ReporteInfo {
    private String id;
    private String nombreReporte;
    private String stringConsulta;
    private String formato;
    private String usuarioSolicita;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getStringConsulta() {
        return stringConsulta;
    }

    public void setStringConsulta(String stringConsulta) {
        this.stringConsulta = stringConsulta;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getUsuarioSolicita() {
        return usuarioSolicita;
    }

    public void setUsuarioSolicita(String usuarioSolicita) {
        this.usuarioSolicita = usuarioSolicita;
    }

    @Override
    public String toString() {
        return "Insert into Tbl_solicitud_reporte (nombrereporte,stringconsulta,formato,usuario) VALUES (" +
                "'" + nombreReporte + "'," +
                "'" + stringConsulta + "'," +
                "'" + formato + "'," +
                "'" + usuarioSolicita + "');";

    }

}
