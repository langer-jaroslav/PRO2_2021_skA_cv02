package cz.uhk.pro2.models.fileSavers;

public class CsvFileSaver implements FileSaver {
    private int number;


    @Override
    public void saveToFile(int i) {
        number = i;
        System.out.println("saved to csv");
    }

    @Override
    public int readFromFile() {
        return number;
    }


    public void foo(){
        System.out.println("foo");
    }
}
