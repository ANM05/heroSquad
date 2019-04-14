package heroSquad;
import java.util.List;
import java.util.ArrayList;

public class Hero{

    private String mHeroName;
    private int mHeroAge;
    private String mSpecialPower;
    private String mStrength;
    private String mWeakness;
    private static List<Hero> heroInstances = new ArrayList<Hero>();
    private int mId;

    public Hero(String heroName, int heroAge, String specialPower, String strength, String weakness){
    mHeroName = heroName;
    mHeroAge = heroAge;
    mSpecialPower = specialPower;
    mStrength = strength;
    mWeakness = weakness;
    heroInstances.add(this);
    mId = heroInstances.size();
    }

    public String getHeroName(){
        return mHeroName;
    }
    public int getHeroAge(){
        return mHeroAge;
    }
    public String getSpecialPower(){
        return mSpecialPower;
    }
    public String getStrength(){
        return mStrength;
    }
    public String getWeakness(){
        return mWeakness;
    }
    public static List<Hero> getAll(){
        return heroInstances;
    }
    public static void clear(){
        heroInstances.clear();
    }
    public int getId(){
        return mId;
    }
    public static Hero find(int id){
        return heroInstances.get(id-1);
    }
}