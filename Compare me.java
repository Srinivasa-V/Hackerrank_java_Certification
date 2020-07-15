class Comparator
{
    boolean compare(int a,int b)
    {
        if(a==b)
            return true;
        else
            return false;
    }
    boolean compare(String a,String b)
    {
        boolean val=false;
        if(a.equals(b))
            val=true;
        return val;
    }
    boolean compare(int[] a,int[] b)
    {
        boolean val=false;
        int s1=a.length;
        int s2=b.length;
        if(s1==s2)
        {
            val=Arrays.equals(a, b);
        }
        else
            val=false;
        return val;
    }
}




