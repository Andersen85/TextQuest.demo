public class Character {
    private int skill = 0;
    private int hp = 0;
    private int luck = 0;
    Inventary inventary = new Inventary();


    public Character() {
        skill = 7 + diceRoll();
        hp = 13 + diceRoll();
        luck = 7 + diceRoll();
    }

    public Character(int skill, int hp){
        this.skill = skill;
        this.hp = hp;
        luck = 0;
    }

    public boolean fightWithOneEnemy(Character you, Character enemy){
        System.out.println("Начинается битва!");
        int youResult, enemyResult;
        while(you.hp != 0 | enemy.hp != 0) {
            youResult = you.skill + diceRoll() + diceRoll();
            enemyResult = enemy.skill + diceRoll() + diceRoll();
            System.out.println("Сила вашего удара: " + youResult + ",\n" + "Сила удара противника: " + enemyResult);
            if(youResult > enemyResult){
                System.out.println("Вы попали! Враг ранен на 2 ед. здоровья.\n");
                enemy.setHp(enemy.getHp() - 2);
            }
            if(youResult == enemyResult){
                System.out.println("Удар отпарирован, но бой продолжается!\n");
            }
            else {
                System.out.println("Противник нанёс вам 2 ед. урона!\n");
                you.setHp(you.getHp() - 2);
            }
        }
        if(you.getHp() == 0){
            System.out.println("Вы героически пали в бою. Придётся начать игру с начала(Или начасть с сохранения) ");
            return false;
        }
        System.out.println("Это было не легко, но вы победили!");
        return true;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int diceRoll(){
        return (int)(Math.random() * 7);
    }

    public Inventary getInventary() {
        return inventary;
    }

    public void setInventary(Inventary inventary) {
        this.inventary = inventary;
    }

}
