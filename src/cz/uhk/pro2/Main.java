package cz.uhk.pro2;

import cz.uhk.pro2.models.Calculator;
import cz.uhk.pro2.models.MyDbConnector;
import cz.uhk.pro2.models.fileSavers.CsvFileSaver;
import cz.uhk.pro2.models.fileSavers.FileSaver;
import cz.uhk.pro2.models.fileSavers.JsonFileSaver;
import cz.uhk.pro2.models.geometry.GenericClass;
import cz.uhk.pro2.models.geometry.GeometryObject;
import cz.uhk.pro2.models.geometry.SquareGeometryObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean useJson = true;
    public static void main(String[] args) {
	// write your code here
        String connection = MyDbConnector.getConnection();

        FileSaver saver = null;
        if(useJson)
            saver = new JsonFileSaver();
        else
            saver = new CsvFileSaver();

        saver.saveToFile(15);

        int number = saver.readFromFile();
        System.out.println(number);


        System.out.println(LocalDateTime.now());


        System.out.println("sum 10 + 6 = "+Calculator.sum(10,6));
        System.out.println("sum 10.5 + 6.5 = "+Calculator.sum(10.5,6.5));
        System.out.println("sum 10.5 + 6.5 + 3.9 = "+Calculator.sum(10.5,6.5, 3.9));



        String connectionTwo = MyDbConnector.getConnection();

        SquareGeometryObject square = new SquareGeometryObject(10,15,6);
        square.draw();
        System.out.println(square.obsah());

        System.out.println(1);
        System.out.println("ssss");
        System.out.println(2d);
        System.out.println(2f);

        List<SquareGeometryObject> list = new ArrayList<>();


        GenericClass<String> myStringObject = new GenericClass<>("text...");
        System.out.println("last update:" + myStringObject.getLastUpdate());

        myStringObject.setMyObject("new text...");
        System.out.println("last update:" + myStringObject.getLastUpdate());



        GenericClass<SquareGeometryObject> mySquareObject = new GenericClass<>(square);
        



    }
}
