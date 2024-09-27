package testNgDemo.ReadData;

import java.io.*;
import java.util.List;
import java.util.Scanner;

//import org.apache.commons.io.FileUtils;

public class ReadingDataFromTextFile {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader("src/resources/data/data.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String str = bufferedReader.readLine();
//        while(str != null){
//            System.out.println(str);
//            str = bufferedReader.readLine();
//        }

//        List<String> lines = FileUtils.readLines(new File("untitled.txt"));

        Scanner sc = new Scanner(new FileInputStream("src/resources/data/data.txt"));
//        String line = sc.next();
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());

        }

    }
}
