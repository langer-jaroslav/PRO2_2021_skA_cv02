package cz.uhk.pro2.models.fileSavers;

import cz.uhk.pro2.models.MyDbConnector;

public class SqlFileSaver implements FileSaver {
    @Override
    public void saveToFile(int i) {
        String conn = MyDbConnector.getConnection();


    }

    @Override
    public int readFromFile() {
        return 0;
    }
}
