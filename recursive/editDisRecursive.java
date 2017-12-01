
public class editDisRecursive
{
    public editDisRecursive()
    {

    }
    private int distance =-1;
    public  int getDistance(String strA, String strB,int n,int m)
    {
        int lengthA=strA.length();
        int lengthB=strB.length();
        int a[] =new int[lengthA+1];
        int b[] =new int[lengthB+1];
        
        
        for (int i=0;i<strA.length();i++){
            a[i]=strA.charAt(i);
        }
        for (int j=0;j<strB.length();j++){
            b[j]=strB.charAt(j);
        }

        if(null==strA || null ==strB || strA.isEmpty()||strB.isEmpty())
        {
            distance=-1;
        }
        else if(strA.equals(strB))
        {
            distance =0;
            
        }
        else if (m==0)
        {
            distance =n;
        }else if (n==0)
        {
            distance =m;
        }
        else {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    if(a[i-1]==b[j-1])
                    {
                        distance =getDistance( strA,  strB ,n-1,m-1);
                    }else{
                        distance= Math.min(getDistance( strA,  strB ,n-1,m)+1,
                            Math.min(getDistance( strA,  strB ,n,m-1)+1,getDistance( strA,  strB ,n-1,m-1)+1));
                    }
                }
            }

        }
        System.out.println(distance);
        return distance;
    }

}
