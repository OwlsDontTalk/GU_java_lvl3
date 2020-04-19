package lesson_3;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        //readFile();
        //readFiewFiles();
        readBigFile();
    }

    public static void readFile(){
        ArrayList<Character> characters = new ArrayList<>();

        try(FileInputStream in = new FileInputStream("lesson-3/lesson3task1.txt")) {

            byte[] arr = new byte[100];
            int x;

            while ( (x=in.read()) != -1) {
                System.out.print((char)x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFiewFiles() throws IOException {
        ArrayList<InputStream> is = new ArrayList<>();
        ArrayList<Character> out = new ArrayList<>();
        is.add(new FileInputStream("lesson-3/task2-1.txt"));
        is.add(new FileInputStream("lesson-3/task2-2.txt"));
        is.add(new FileInputStream("lesson-3/task2-3.txt"));
        is.add(new FileInputStream("lesson-3/task2-4.txt"));
        is.add(new FileInputStream("lesson-3/task2-5.txt"));

        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(is));
        int x;

        while ( (x=sis.read()) != -1) {
            out.add((char) x);
        }

        try (FileOutputStream outS = new FileOutputStream("lesson-3/task2-result.txt")) {
            for (int i = 0; i < out.size(); i++) {
                outS.write(out.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readBigFile() throws IOException {
        long t = System.currentTimeMillis();
        int page = 0;
        Reader reader = new InputStreamReader(new FileInputStream("lesson-3/task3-loremIpsum.txt"));
        char[] chars = new char[1800];
        while (reader.read(chars) != -1){
            System.out.println("Page: " + page++);
            System.out.println(chars);
        }

        System.out.println("\n\nTotal pages printed: " + page);
        System.out.println("Time spent: " + (System.currentTimeMillis() - t));
    }
}
