package metodele;

public class Metodele {
    public String CaractereMijloc(String arr)
    {
        int n=arr.length();
        int index=n/2;
        String mijloc="";
        if(n%2==0)
        {
            mijloc=arr.substring(index - 1 ,index+1);
        }
        else {

            mijloc=arr.substring(index ,index+1);
        }
        return mijloc;
    }
    public int Suma(int x)
    {
        int sum=0;
        while(x!=0)
        {
            sum+=x%10;
            x/=10;
        }
        return sum;

    }
}
