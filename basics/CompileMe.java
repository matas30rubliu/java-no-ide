package training.basics;

/**
 * <ul>
 *   <li> Compile: javac -d ./target CompileMe.java </li>
 *   <li> Run:     java -cp ./target training.basics.CompileMe </li>
 * </ul>
 * <b> Generate this Javadoc: javadoc -d ./target CompileMe.java </b>
 * @since 2020-07-15
 */
public class CompileMe {
    public static void main(String[] args) {
        System.out.println("args received:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}