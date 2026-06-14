package arrays.multidimensional;

public class multiDimensionExample {
    public static void main(String[] args) {
        //creating array objects

        String[][] objects = {{"Spoon","Fork", "Bowl"}, {"Salt", "pepper"}};

        //accessing array elements using indexing
        System.out.println(objects[0][2]);


        System.out.println();


        // we can also print the multi-dimensional arrya as grid
        int[][] number = {{1,2,3}, {4,5,6}};

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

/*we access values by providing an index for the array and another one for the value inside it.*/
