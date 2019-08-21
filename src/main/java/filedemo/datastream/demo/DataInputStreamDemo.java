package filedemo.datastream.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("G:/appdev/o.txt"));

        int age = dis.readInt();
        long readLong = dis.readLong();
        float readFloat = dis.readFloat();

        double readDouble = dis.readDouble();

        boolean readBoolean = dis.readBoolean();

        String readUTF = dis.readUTF();

//        String name = dis.readUTF();
//        int age = dis.readInt();
//        System.out.println(name);
//        System.out.println(age);
//        Integer.parseInt("1");
    }

}
