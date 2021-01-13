/**
 * @author bu
 * @create 2021-01-13 10:34
 */
public class HelloGit {

    public static void main(String[] args) {
        System.out.println("hello git");
    }

    public static String getMaxString(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == 'a') {
                sb.append("a");
            }
        }
        return sb.toString();
    }

}
