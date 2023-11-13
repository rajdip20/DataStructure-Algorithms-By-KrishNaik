class ArrayExample1Out {
    
    void multiArrays() {
        // int arr_1[][] = new int[5][3];
        int arr_2[][] = {{12, 13, 14}, {15, 16, 17}, {18, 19, 20}};

        System.out.println(arr_2[0][0]);    // 12
        System.out.println(arr_2[0][1]);    // 13
        System.out.println(arr_2[0][2]);    // 14

        System.out.println(arr_2[1][0]);    // 15
        System.out.println(arr_2[1][1]);    // 16
        System.out.println(arr_2[1][2]);    // 17

        System.out.println(arr_2[2][0]);    // 18
        System.out.println(arr_2[2][1]);    // 19
        System.out.println(arr_2[2][2]);    // 20

        for (int i = 0; i < arr_2.length; i++) {

            for (int j = 0; j < arr_2[i].length; j++) {
                
                System.out.println(arr_2[i][j]);
            }
        }
    }

    void demoArrays() {
        int ages[] = new int[3];
        // float weights[] = new float[3];
        String names[] = {"rahul", "raj", "rohit", "rana"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
        // ages[5] = 36;        // out of bounds

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);        // print using for loop
        }

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        for (String name : names) {
            System.out.println(name);           // print using for each loop
        }

        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);        // print using while loop
            i++;
        }

        System.out.println(ages.length);    // 3
        System.out.println(names.length);   // 4
    }
}

public class ArrayExample1 {
    public static void main(String[] args) {
        ArrayExample1Out obj = new ArrayExample1Out();
        // obj.demoArrays();
        obj.multiArrays();
    }
}