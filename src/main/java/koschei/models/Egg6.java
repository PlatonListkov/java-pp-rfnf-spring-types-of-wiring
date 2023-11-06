package koschei.models;

public class Egg6 {

    /**
     * Зависмость Needle7 внедряется через конструктор
     */
    private Needle7 needle;

    public Egg6(Needle7 needle7) {
        this.needle = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
