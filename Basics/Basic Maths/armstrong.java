public class armstrong {
    
        boolean isarmstrong(int x){
            
            double lastdigit,sum=0;
            int org=x;
            while (x>0) {
                lastdigit=x%10;
                sum=sum+Math.pow(lastdigit, 3); // lXlXl 3x multiply
                x=x/10;
            }
            return sum == org;
        }
        public static void main(String[] args) {
            armstrong a= new armstrong();
            System.out.println(a.isarmstrong(153));
        }
}
