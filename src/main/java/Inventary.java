import java.util.Scanner;

public class Inventary {

    private String[] inv = new String[7];
    private String[] magic = new String[10];

    public Inventary() {
        // дописать заполнение инвенторя
        inv[0] = "15"; //Золотые монеты
        inv[1] = "2";  //Фляга
        magicSelection();
    }

    public void magicSelection() {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        System.out.println("Астролог предупредил: уровень вашего МАСТЕРСТВА позволяет вам воспользоваться заклятиями \n" +
                "только 10 раз. Поэтому вы можете выбрать любые заклятия и в любом количестве, но всего их \n" +
                "должно быть не более десяти. \n" +
                "Какие заклинания вы выберете(10)?\n"
                + "Введите: \n" +
                "1, чтобы добавить ЗАКЛЯТИЕ ЛЕВИТАЦИИ\n" +
                "2, чтобы добавить ЗАКЛЯТИЕ ОГНЯ\n" +
                "3, чтобы добавить ЗАКЛЯТИЕ ИЛЛЮЗИИ\n" +
                "4, чтобы добавить ЗАКЛЯТИЕ СИЛЫ \n" +
                "5, чтобы добавить ЗАКЛЯТИЕ СЛАБОСТИ\n" +
                "6, чтобы добавить ЗАКЛЯТИЕ КОПИИ\n" +
                "7, чтобы добавить ЗАКЛЯТИЕ ИСЦЕЛЕНИЯ\n" +
                "8, чтобы добавить ЗАКЛЯТИЕ ПЛАВАНИЯ\n");
        int i = 0;
        while (i <= 10) {
            System.out.println("(Осталось мест: " + (10 - i) + ")\n");
            s = scanner.nextInt();
            if (s == 1) {
                magic[i] = "ЗАКЛЯТИЕ ЛЕВИТАЦИИ";
                System.out.println("Добавлено заклятие ЛЕВИТАЦИИ");
                i++;
            }
            if (s == 2) {
                magic[i] = "ЗАКЛЯТИЕ ОГНЯ";
                System.out.println("Добавлено заклятие ОГНЯ");
                i++;
            }
            if (s == 3) {
                magic[i] = "ЗАКЛЯТИЕ ИЛЛЮЗИИ";
                System.out.println("Добавлено заклятие ИЛЛЮЗИИ");
                i++;
            }
            if (s == 4) {
                magic[i] = "ЗАКЛЯТИЕ СИЛЫ";
                System.out.println("Добавлено заклятие СИЛЫ ");
                i++;
            }
            if (s == 5) {
                magic[i] = "ЗАКЛЯТИЕ СЛАБОСТИ";
                System.out.println("Добавлено заклятие СЛАБОСТИ");
                i++;
            }
            if (s == 6) {
                magic[i] = "ЗАКЛЯТИЕ КОПИИ";
                System.out.println("Добавлено заклятие КОПИИ");
                i++;
            }
            if (s == 7) {
                magic[i] = "ЗАКЛЯТИЕ ИСЦЕЛЕНИЯ";
                System.out.println("Добавлено заклятие ИСЦЕЛЕНИЯ");
                i++;
            }
            if (s == 8) {
                magic[i] = "ЗАКЛЯТИЕ ПЛАВАНИЯ";
                System.out.println("Добавлено заклятие ПЛАВАНИЯ");
                i++;
            }
            if (s == 9) {

                System.out.println("Пропуск заполнения");
                i=11;
            }
            System.out.println("Набор заклинаний успешно собран!");
        }
    }

    //Использование Фляги
    public void drink() {
        System.out.println("Осталось воды: " + inv[1] + "глотка\n");
        System.out.println("Сколько глотков сделать?");
        int s = new Scanner(System.in).nextInt();
        int dr = Integer.parseInt(inv[1]);
        if (dr >= s) {
            setInv(1, Integer.toString(dr-s));
        }
    }

    public String[] getMagic() {
        return magic;
    }

    public void setMagic(int i, String str) {
        magic[i] = str;
    }

    public void invToString() {
        for (String s : inv)
            System.out.println("| " + s + " |");
    }


    public String[] getInv() {
        return inv;
    }

    public void setInv(int i, String str) {
        inv[i] = str;
    }
}
