package cz.uhk.pro2.models.fileSavers;

public class JsonFileSaver implements FileSaver {
    private int number;

    @Override
    public void saveToFile(int i) {
        number = i;
        System.out.println("saved to json");
    }

    @Override
    public int readFromFile() {
        return number;
    }
}
