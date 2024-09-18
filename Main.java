public class Main {

    public static boolean IsAllUnique(String[] str, int size)
    {
        for(int i = 0; i < size; i=i+1)
        {
            for(int j = i + 1; j < size; j=j+1)
            {
                if(str[i] == str[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{
		System.out.println("Hello World");
        String[] ar = {"A", "B", "C", "E"};
        IsAllUnique(ar, ar.length);
        boolean answer = IsAllUnique(ar, ar.length);
        if(answer == true)
        {
            System.out.println("unique");
        }
        if(answer == false)
        {
            System.out.println("stack");
        }
    }
		
	
}
