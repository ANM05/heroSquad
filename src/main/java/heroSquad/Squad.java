package heroSquad;
import java.util.List;
import java.util.ArrayList;

public class Squad{
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> mSquads = new ArrayList<Squad>();

    public Squad(String squadName, int maxSize, String cause){
     mName = squadName;
     mSize = maxSize;
     mCause = cause;
     mSquads.add(this);
    }
    public String getName(){
        return mName;
    }
    public int getSize(){
        return mSize;
    }
    public String getCause(){
        return mCause;
    }
    public static List<Squad> squadAll(){
        return mSquads;
    }
}