// public class string_buffer {
//     public static void main(String[] args){
//         StringBuffer sb = new StringBuffer();
//         System.out.println(sb.capacity());
//         sb.append("Dharun");
//         // StringBuffer sb = "Dharun";
//         sb.append(" Raj");
//         System.out.println(sb);
//         sb.append(" Raj test the size of the string buffer");
//         System.out.println(sb.capacity());
//         System.out.println(sb.length());
//     }
// }


public class StringBuilderGrowthDemo {
    public static void main(String[] args) {
        // Create StringBuilder with initial capacity 10
        StringBuilder sb = new StringBuilder(10);
        System.out.println("Initial capacity: " + sb.capacity());

        String appendStr = "abcdefghij"; // 10 chars

        // Append strings repeatedly and monitor capacity
        for (int i = 1; i <= 10; i++) {
            sb.append(appendStr);
            System.out.println("After appending " + (i * 10) + " chars, capacity: " + sb.capacity());
        }
    }
}
