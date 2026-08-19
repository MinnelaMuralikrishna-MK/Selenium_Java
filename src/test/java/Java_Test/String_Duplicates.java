package Java_Test;

public class String_Duplicates
{
    public static void main(String[] args)
    {
        String str = "Minnela";
        char[] carray = str.toCharArray();
        System.out.println("The String is = " + str);
        System.out.println("Duplication Character in above string is = ");

        for (int k = 0; k < str.length(); k++)
        {
            for(int j = k + 1 ; j < str.length(); j++)
            {
                if(carray[k] == carray[j])
                {
                    System.out.println(carray[j] + " ");
                    break;
                }
            }
        }
    }
}
