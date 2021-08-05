package step4;

public class Reverse {
    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String tmp[] = data.split(" ");
        for(int i=0; i<tmp.length; i++){
            StringBuffer s = new StringBuffer(tmp[i]);
            ans.append(s.reverse());
            ans.append(" ");
        }
        /********** End *********/
        return ans;
    }
}
