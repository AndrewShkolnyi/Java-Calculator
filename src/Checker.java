public class Checker {
    public static boolean checkInt(String[] args) {
        boolean isAvailable = false;
        for(String i : args) {
        if(Integer.parseInt(i) > 10 || Integer.parseInt(i) < 1 ) {
            break;
        } else {
            isAvailable = true;
        }
        }
        return isAvailable;
    }
    public static boolean checkOpertor(String[] args) {
        boolean isAvailable = false;
        for(String i: args) {
            String value = i;
    if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
        isAvailable = true;
    } else {
        break;
            }

        }
        return isAvailable;
    }

}
