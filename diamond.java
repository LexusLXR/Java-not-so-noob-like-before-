public class diamond {
    public static void main(String[]args){
        // int n = 5;
        // int m = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=m; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     for(int j=3; j>=i; j--){
        //         System.out.print("*");
        //     }System.out.println();
        // }
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i =n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
