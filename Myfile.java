package gitTesting;

public class Myfile {
    String name;
    int id;

    Myfile setData(String name, int id) {

        Myfile obj = new Myfile();
        obj.name = name;
        obj.id = id;

        return obj;

    }
}
