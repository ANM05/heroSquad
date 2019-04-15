package heroSquad;

public class Squad{
    private String mName;
    private int mSize;
    private String mCause;

    public Squad(String squadName, int maxSize, String cause){
     mName = squadName;
     mSize = maxSize;
     mCause = cause;
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
}