public class teacher {
    private int num;
    private String name;
    boolean changed = true;
    public static int count = 0;

    public void setTeacher(int num){
        if(num>0)
        this.num=num;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
}
public int getNum(){
    return num;
}
}
