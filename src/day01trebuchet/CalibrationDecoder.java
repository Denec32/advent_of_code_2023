package day01trebuchet;

public class CalibrationDecoder
{
    public long decode(String[] s) throws Exception
    {
        long sum = 0;
        for (String line : s) {
            int calibrationValue = decodeLine(line);
            sum += calibrationValue;
        }

        return sum;
    }

    private int decodeLine(String line) throws Exception
    {

        return getFirstDigit(line) * 10 + getLastDigit(line);

    }
    private int getFirstDigit(String line) throws Exception
    {
        for (char symbol : line.toCharArray()) {
            if (Character.isDigit(symbol)) return symbol - '0';
        }

        throw new Exception("no digits found");
    }

    private int getLastDigit(String line) throws Exception
    {
        for (int i = line.length() - 1; i >= 0; i--) {
            char symbol = line.charAt(i);
            if (Character.isDigit(symbol)) return symbol - '0';
        }

        throw new Exception("no digits found");
    }
}