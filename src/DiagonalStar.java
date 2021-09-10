public class DiagonalStar {

//Solution using the for statement:


    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");

        else {

            for (int row = 0; row < number; row++) {

                for (int column = 0; column < number; column++) {

                    if (row == 0 || row == number - 1 || column == 0 || column == number - 1 || column == row || column == number - 1 - row)
                        System.out.print("*");

                    else System.out.print(" ");
                }

                System.out.println("");
            }
        }
    }



    //Solution using the while statement:
    /*
    public static void printSquareStar(int number){
        if( number < 5) {
            System.out.println("Invalid Value");
        }else {
            int row = 1;
            int col = 1;
            while (row <= number) {
                col = 1;
                //System.out.println(row);
                while (col <= number) {
                    if (row == 1 || row == number || col == 1 || col == number) {
                        System.out.print("*");
                    } else if (row == col) {
                        System.out.print("*");
                    } else if (col == (number - row + 1)) {
                        System.out.print("*");
                    } else System.out.print(" ");
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    }
    */
}
