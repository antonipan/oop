package level_8.Ex002;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++number),
                r.nextInt(100, 200));
        this.maxHarmony = r.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int heal = r.nextInt(10, 20);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }
}