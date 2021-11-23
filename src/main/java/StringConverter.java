public class StringConverter {
    public static Integer convert(String input){
        Integer output = Integer.parseInt(input);
        if (output>32767 || output<-32767)
            throw new IllegalArgumentException();
        return output;
    }
}
