import com.alibaba.fastjson.JSON;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
    public static void main (String[]args) throws FileNotFoundException {
        String json = new Scanner(new File( "files/file1_2" )).useDelimiter("\\Z").next();
        Lines lines = JSON.parseObject(json,Lines.class);

        System.out.println(json);
    }
}
