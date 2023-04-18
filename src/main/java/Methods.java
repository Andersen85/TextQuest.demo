import java.sql.SQLOutput;
import java.util.Scanner;


public class Methods {
    private Scanner scanner = new Scanner(System.in);
    private Scanner save = scanner;
    private Scanner austosave = scanner;
    private DataBase dataBase = new DataBase();
    private Character character = new Character();
    private Validator v = new Validator();


    public Methods(Scanner scanner) {
        this.scanner = scanner;
    }

    public void service() {
        int s = scanner.nextInt();
        if(!v.magicValidate(s, character.inventary)) {
            System.out.println("У вас нет нужного заклинания");
            service();
        }
        autoSave();
        System.out.println(dataBase.getDataBase()[s]);
        service();
    }




    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void saveProgress() {
        save = scanner;
    }

    public void autoSave() {
        austosave = scanner;
    }


}
