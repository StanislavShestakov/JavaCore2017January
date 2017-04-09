import com.company.StringComparing;
import sun.misc.IOUtils;

import java.beans.Encoder;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Stas on 03.04.2017.
 */
public class MostFrequerentByte {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> map = new TreeMap<>();
        //ArrayList<Byte> symbols = new ArrayList<>();
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String a = bufferedReader.readLine();
//        InputStream inputStream = new FileInputStream("res/text_01.txt");
//        while (inputStream.available() > 0) {
//            int butes = inputStream.read();
//            symbols.add((byte)butes);
//        }
        String text = new String(Files.readAllBytes(Paths.get("res/text_01.txt")),"Cp1252");
        byte[] bytes = text.getBytes("Cp1252");
        List<Byte> symbols = new ArrayList<>();
        for(byte byt : bytes){
            symbols.add(byt);
        }
        for (Byte symbol : symbols) {
            Integer count = map.get(symbol);
            map.put(symbol, count == null ? 1 : count+1);
        }
        Collections.sort(symbols, new Comparator<Byte>() {
            @Override
            public int compare(Byte o1, Byte o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        for (Byte symbol : symbols) {
            if(symbol.equals(symbols.get(0))){
                String s =  new String(symbol.toString());
                String ss = new String(s.getBytes("Cp1252"),"Cp1252");
                System.out.print(" " + ss);
            }
        }
        System.out.println();
        for (int i = 0; i < map.get(symbols.get(0)) ; i++) {
           // System.out.print((char)((int)symbols.get(0))+" ");
            System.out.print((int)symbols.get(0)+" ");
        }
        System.out.println();
        System.out.println((char) ((int)symbols.get(0)));
        map.entrySet().stream()
                .sorted(Map.Entry.<Byte, Integer>comparingByValue().reversed())
                .limit(map.size())
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!");
        for (Map.Entry<Byte, Integer> byteIntegerEntry : map.entrySet()) {
            System.out.println(byteIntegerEntry);
        }


        // another method
        int maxRepeat = 0;
        int index = 0;
        for (int i = 0; i < symbols.size(); i++) {
            int maxCurRepeat = 0;
            for (int j = 0; j < symbols.size(); j++) {
                if(symbols.get(j) == symbols.get(i)){
                    maxCurRepeat++;
                    if(maxCurRepeat > maxRepeat){
                        maxRepeat = maxCurRepeat;
                        index = j;
                    }
                }
            }
        }
        System.out.println(symbols.get(index));

    }
}
