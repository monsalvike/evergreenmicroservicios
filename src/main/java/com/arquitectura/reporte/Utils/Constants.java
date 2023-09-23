package com.arquitectura.reporte.Utils;

public class Constants {
    public static String SQLCONSULTPARAMS = "select rubro, subregion, municipio, anio as año,area_total as area_Predio, area-produccion, volumen_produccion from Tbl_Cultivos_Agricolas ";
    public static String WHERE = " where ";
    public static String RUBRO = " rubro = ";
    public static String SUBREGION = " subregion = ";
    public static String ANIO = " anio = ";
    public static String AND = " and ";
    public static String SQLCONSULTIDREPORTE = "select Top 1 (id) from Tbl_solicitud_reporte order by id desc";
    public static String STRINGCONNECTION = "jdbc:sqlserver://srv-evergreen.database.windows.net:1433;database=EvergreenAna;user=azureuser@srv-evergreen;password=Q1w2e3r4123.*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

}
