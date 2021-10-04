package cz.uhk.pro2.models;

public class MyDbConnector {
    private static String connection;

    public static String getConnection(){
        if(connection == null){
            connection = "CONECTION";
        }

        return connection;
    }
}
