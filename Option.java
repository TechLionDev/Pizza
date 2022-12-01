
public class Option {
    public Option(PizzaSize[] arr) {
        final String prefix = "| ";
        final String suffix = " |";
        final String header = prefix + "The Options Are:" + suffix;
        System.out.println(header);
        for (int i = 0; i < arr.length; i++) {
            String sizeName = arr[i].value;
            System.out.println(prefix + (i + 1) + " - " + sizeName + suffix);
        }
    }
}
