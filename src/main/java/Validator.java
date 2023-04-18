public class Validator {

    public Validator() {
    }

    public boolean magicValidate(int s, Inventary inv) {
        int i;
        //Плаванья
        if (s == 378 || s == 311) {
            for (i = 0; i < 10; i++) {
                if (inv.getMagic()[i].equalsIgnoreCase("заклятие плаванья")) {
                    inv.setMagic(i, "");
                    return true;
                }
            }
            return false;
        }
        //Левитаци
        if (s == 103) {
            for (i = 0; i < 10; i++) {
                if (inv.getMagic()[i].equalsIgnoreCase("заклятие левитации")) {
                    inv.setMagic(i, "");
                    return true;
                }
            }
            return false;
        }

        return false;
    }
}
