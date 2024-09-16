public class Solution{
    public String convert(String s,int numRows){
        if(numRows==1)
        return s;
        StringBuilder ret=new StringBuilder();
        int n=s.length();
        int cyclen=2*numRows-2;

        for(int i=0;i<numRows;i++){
            for(int j=0;j+i<n;j+=cyclen){
                ret.append(s.charAt(j+i));
                if(i!=0 && i!=numRows-1 && j+cyclen-i<n)
                    ret.append(s.charAt(j+cyclen-i));
            }
        }
        return ret.toString();
    }
}
