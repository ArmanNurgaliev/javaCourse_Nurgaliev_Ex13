import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String s1 = "Я помню чудное мгновенье:";
        String s2 = "Передо мной явилась";
        String sInsert = " ты,";
        String s3 = "Как мимолетное виденье,";
        String s4 = "Как гений чистой красоты.";

        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        sb.append(s4);
        sb.insert(44, sInsert);
        sb.insert(25, "\n");
        sb.insert(49, "\n");
        sb.insert(73, "\n");

        Pattern pattern = Pattern.compile("^[А-Яа-я]{4,7}$");
        System.out.println("Слова длиной от 4 до 7:");
        for (String s: sb.toString().split("\\s+")) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) System.out.println(s);
        }

        System.out.println();
        System.out.println("Стихотворение");
        System.out.println(sb.toString());
    }
}
