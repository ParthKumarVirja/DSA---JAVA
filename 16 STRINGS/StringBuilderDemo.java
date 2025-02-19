public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // print char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //insert string/char at idex 0
        sb.insert(0,"TVOf");
        System.out.println(sb);

        //delete char at any index 
        sb.delete(0,3);
        System.out.println(sb);


        // append string 
        sb.append("Tv");
        System.out.println(sb);

        // size / length
        System.out.println(sb.length());
    }
}
