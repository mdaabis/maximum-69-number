public class Main {
    public static void main(String[] args) {
        int num = -96669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num)
    {
        char[] chars = String.valueOf(num).toCharArray();
        int i = 0;
        if (num > 0)
        {
            for (char character : chars)
            {
                if (character == '6')
                {
                    chars[i] = '9';
                    break;
                }
                else
                    i++;
            }
        }
        else {
            for (char character : chars)
            {
                if (character == '9')
                {
                    chars[i] = '6';
                    break;
                }
                else
                    i++;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}