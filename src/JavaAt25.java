import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class JavaAt25 {
    private void weLoveCollections() {
        final ArrayList<String> strings = new ArrayList<String>();
        HashMap<Integer, String> map = new HashMap<>();
        HashSet<Integer> integers = new HashSet<>();

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {

        }
    }

    private void weLoveCollectionFactories() {
//        List.of() // java version > 9;
    }

    private void weLoveTheStreamAPI() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("aa");
        Optional<String> aValue = stringList.stream()
                .filter(s -> s.equals("a"))
                .findFirst();

        aValue.ifPresent(System.out::println);

    }

    private void weLoveJavaTime() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        LocalDateTime oneWeekAndOneDayAgo = now.minusDays(8);
        final LocalDate java25BirthDay = LocalDate.of(2020, 10, 25);

    }

    private void weLoveCheckedExceptionSomeTimes() {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            final Date date = dateFormat.parse("20201025");
        } catch (ParseException e) {
            System.out.println("this is not a date");
        }

    }

    @Contract(pure = true)
    private @NotNull
    String weLoveAnnotations(@NotNull Object param) {

        String value = param.toString();
        return "this can never return null";
    }

    private void weLoveVarWhereAppropriate(){
        final String s = "my string";
        final var s1 = "open jdk 15 hello";

        final var list = List.of(1, 2, 3, 4);

    }

    private void weLoveAccessModifiers(){
        new MyInnerClass();
    }

    private String weLoveSwitchExpression(int someValue){

        return switch (someValue) {
            case 1 -> "first value";
            case 2 -> "second value";
            default -> throw new IllegalStateException("Unexpected value: " + someValue);
        };
    }

    private void weLoveHelpFullNullPointerException(){

    }


    static class MyInnerClass {
    }
}
