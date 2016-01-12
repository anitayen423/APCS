/*
 * Moves at night instead of at day (6PM to 6AM) and is asleep at any other time (does nothing)
 *
 * @author Anita Yen
 */
public class NocturnalCow extends Cow {

    public NocturnalCow(String name, int hungriness, int sicknessLevel, int age, int x, int y) {
        super(name, hungriness, sicknessLevel, age, x, y);
    }

    public NocturnalCow(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        String temp = super.toString();
        temp = temp.replaceAll("Cow", "NocTurnalCow");
        return temp;
    }

    @Override
    public boolean awake() {
        return WorldObject.currentHour < 6 || WorldObject.currentHour >= 18;
    }

    @Override
    public void printObjectID() {
        System.out.print(NOCTURNAL_COW);
    }
}
