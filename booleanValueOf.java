// https://blogs.oracle.com/javamagazine/post/quiz-yourself-wrapper-classes-intermediate

class booleanValueOf {
    public static void main(String[] args) {
        String one = "1";
        Boolean b1 = Boolean.valueOf(one); // line n1
        Integer i1 = new Integer(one);  // Integer deprecated
        Integer i2 = 1;
        System.out.print("before if\n");
        if (b1) {
            System.out.print(i1 == i2); // output = never even enters the if
        }
        System.out.print("after if\n");

        Integer v1 = new Integer("1");
        Integer v2 = new Integer("1");
        System.out.print(v1 == v2);  // output = false

        Integer v11 = new Integer("1");
        Integer v21 = 1;
        System.out.print(v11 == v21); // output = false

        Integer v12 = Integer.valueOf(1);
        Integer v22 = Integer.valueOf(1);
        System.out.print(v12 == v22); // output = true

    }
}