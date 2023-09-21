package com.arquitectura.reporte.Utils;

public class Constants {
    public static String SQLCONSULTPARAMS = "select * from Tbl_Cultivos_Agricolas ";
    public static String WHERE = " where ";
    public static String RUBRO = " rubro = ";
    public static String SUBREGION = " subregion = ";
    public static String ANIO = " anio = ";
    public static String AND = " and ";
    public static String SQLCONSULTIDREPORTE = "select Top 1 (id) from Tbl_solicitud_reporte order by id desc";

    public static String DNSDATABASE = "jdbc:sqlserver://srv-evergreen.database.windows.net";
    public static String USUARIO = "azureuser@srv-evergreen";
    public static String PASS = "Q1w2e3r4123.*";

    public static String STRINGCONNECTION = "jdbc:sqlserver://srv-evergreen.database.windows.net:1433;database=EvergreenAna;user=azureuser@srv-evergreen;password=Q1w2e3r4123.*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

}
