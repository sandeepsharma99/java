package Patterns;

public class pattern1 {
    public static void main(String[] args) {
        // Patter 1
        // int n = 5;
        // for (int row = 1; row<=n; row++){
        //     for(int col = 1; col<=n; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // } 
        
        // Patter 2
        // int n = 5;
        // for (int row=1; row<=n; row++){
        //     for (int col=1; col<=row; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 3 
        // int n = 5;
        // for (int row=1; row<=n; row++){
        //     for(int col=1; col<=n-row; col++){ // spaces
        //         System.out.print(" ");
        //     }
        //     for(int col=1; col<=n; col++){ // stars
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Pattern 4
        // int n = 5;
        // for(int row=1;row<=n; row++){
        //     for(int col=1; col<=    n-row+1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 5
        // int n = 5;
        // for(int row = 1; row<=n; row++){
        //     for(int col=1; col<=n-row; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1; col<=2*row-1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Pattern 6
        // int n = 5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=row-1; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1; col<=2*n-2*row-1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Pattern 7
        // int n = 5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n; col++){
        //         if (row==1 || row==n){
        //             System.out.print("* ");
        //         }else{
        //             if(col==1 || col==n){
        //                 System.out.print("* ");
        //             }else{
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 8
        // int n = 5;
        // for(int row=1; row<=n; row++){
        //     if (row==1 || row==2 ||row==n){
        //         for(int col=1; col<=row; col++){
        //             System.out.print("* ");
        //         }
        //     }else{
        //         // star
        //         System.out.print("* ");
        //         // space
        //         for(int col=1; col<=(row-2); col++){
        //             System.out.print("  ");
        //         }
        //         // star
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 9
        // int n = 5;
        // for(int row=1; row<= n; row++){
        //     for(int col=1; col<=n-row; col++){
        //             System.out.print("  ");
        //         }
        //     if(row==1||row==n){
        //         for(int col=1; col<=2*row-1; col++){
        //             System.out.print("* ");
        //         }
        //     }else{
                
        //         System.out.print("* ");

        //         for(int col=1; col<=2*row-3; col++){  
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Pattern 10
        // int n = 5;
        // for(int row=1; row<= n; row++){
        //     for(int col=1; col<=n-row; col++){
        //             System.out.print("  ");
        //         }
        //     if(row==1){
        //         for(int col=1; col<=2*row-1; col++){
        //             System.out.print("* ");
        //         }
        //     }else{
        //         // 1 star
        //         System.out.print("* ");
        //         //space
        //         for(int col=1; col<=2*row-3; col++){  
        //             System.out.print("  ");
        //         }
        //         // 1 star
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }
        // for(int row=1; row<=n-1; row++){

        //     // part-1 (spaces)
        //     for(int col=1; col<=row; col++){
        //         System.out.print("  ");
        //     }
        //     //part-2 (star)

        //     if(row==n-1){
        //         // 1 start
        //         System.out.print("*");
        //     }else{
        //         // 1 start
        //         System.out.print("* ");
        //         // spaces
        //         for(int col=1; col<=2*(n-row)-3; col++){
        //             System.out.print("  ");
        //         }
        //         // 1 star
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 11
        int n = 5;
        for(int row=1; row<=n; row++){
            
                for(int col=1; col<=row; col++){
                System.out.print("* ");
                }

                for(int col=1; col<=2*(n-row); col++){
                System.out.print("  ");
                }

                for(int col=1; col<=row; col++){
                System.out.print("* ");
                }
            
                
                

                System.out.println();
            }

            for(int row=1; row<=n; row++){
                for(int col=1; col<=n-row+1; col++){
                    System.out.print("* ");
                }
                for(int col=1; col<=(row-1)*2; col++){
                    System.out.print("  ");
                }
                for(int col=1; col<=(n-row)+1; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }






            
           
        }  
}