import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        String s = "Good";
        //here s will create a new object then it will concat and again assign
        // to s
        s = s.concat(" Morning!");
        System.out.println(s);

        StringBuffer stringBuffer = new StringBuffer("Good");
        // New object is not created original object is manipulated
        stringBuffer.append(" Morning");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Good");
        stringBuilder.append(" Morning");
        System.out.println(stringBuilder);

        //this will break string into token the delimiter which you give
        //here space is given so it will break stmt when the space detected
        StringTokenizer tokenizer = new StringTokenizer("Hey, How are you?", " ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        //it will join tokens separated delimiter followed by prefix and suffix
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        System.out.println(joiner);


        //string pool
        String s1 = "Hello";
        String s2 = "Hello";
        //true as both reference to same memory space
        System.out.println(s1 == s2);

        String s3 = new String("Hello");
        //false as new keyword everytime makes new memory
        System.out.println(s1 == s3);
    }
}
