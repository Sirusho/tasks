package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //serialization
        //Person person=new Person(15, "Ann", "ann@gmail.com");
//        FileOutputStream file=new FileOutputStream("person.txt");
//        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(file)){
//            objectOutputStream.writeObject(person);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //deserialization
        Person person;
        person=null;
        try(FileInputStream fileInputStream=new FileInputStream("person.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {

           person=(Person)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
