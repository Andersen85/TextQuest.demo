import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private String[] dataBase = new String[617];

    public DataBase() {
        createDataBase();
    }

    public String[] getDataBase() {
        return dataBase;
    }

    public void createDataBase(){
        File file = new File("C:\\java\\quest1\\test.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            try {
                String chapter = "";
                int i = 0;
                String line = reader.readLine();
                System.out.println(line);
                try {
                while (reader.ready()){
                    //Если парсится:
                    if (Integer.parseInt(line) < 617) {
                        dataBase[i] = chapter;
                        i++;
                        line = reader.readLine();
                        System.out.println(line == null);
                    }
                    //Если не парсится:
                    else {
                        chapter = chapter + line + "\n";
                        line = reader.readLine();
                        }
                    }
                } catch (NumberFormatException ignored){}
                System.out.println(line);
                System.out.println("Chapter : " + chapter);
                System.out.println("i : " + i);






//            while (line != null) {
//                book = book + line + "\n";
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }


//
//                    String[] strings = book.split("\\d*\n", 616);
//                System.out.println(Arrays.toString(strings));

//            int j=0;
//            for (int i = 0; i<strings.length; i++){
//                if(i%2 == 1){
//                    dataBase[j] = strings[i];
//                    j++;
//                }
//            }

            } catch (NumberFormatException ignored){
                System.out.println("Ошибка");
            }

        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }


    }


}
