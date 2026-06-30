public class HalfPyramid {
    public static void main(String[] args) {
        int r=4;
        int c=4;
       for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(j<=i)
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        } 
    }
    
}
