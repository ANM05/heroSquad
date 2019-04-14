package heroSquad;

public class Hero{

    private String mHeroName;
    private int mHeroAge;
    private String mSpecialPower;
    private String mStrength;
    private String mWeakness;

    public Hero(String heroName, int heroAge, String specialPower, String strength, String weakness){
    mHeroName = heroName;
    mHeroAge = heroAge;
    mSpecialPower = specialPower;
    mStrength = strength;
    mWeakness = weakness;
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
}