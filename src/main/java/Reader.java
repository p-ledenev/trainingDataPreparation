import java.io.*;
import java.util.*;

/**
 * Created by ledenev.p on 04.08.2015.
 */
public class Reader {

    public List<Double> readFrom(String fileName) throws Throwable {

        List<Double> data = new ArrayList<Double>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line == "")
                continue;

            String[] arr = line.split(";");
            data.add(Double.parseDouble(arr[5]));
        }

        reader.close();

        return data;
    }
}
