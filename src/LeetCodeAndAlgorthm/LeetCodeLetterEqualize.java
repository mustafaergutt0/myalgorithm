package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class LeetCodeLetterEqualize
{
    public boolean equalFrequency(String word)
    {
        int[] numOfChars = new int[26];

        for (char c : word.toCharArray())
        {
            numOfChars[c - 'a']++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++)
        {
            int num = numOfChars[i];
            if (num != 0)
            {
                if (map.get(num) == null)
                {
                    if (map.size() == 2) return false;

                    map.put(num, 1);
                }
                else map.put(num, map.get(num) + 1);
            }
        }

        if (map.size() == 2)
        {
            int k = 1;
            int diff = 0;

            for (int i : map.keySet())
            {
                if (i == 1 && map.get(i) == 1) return true;
                diff = diff + i * k;
                k = -1;
            }

            if (diff != 1 && diff != -1) return false;

            int first = 0;
            int firstValue = 0;
            int second = 0;
            int secondValue = 0;

            for (int i : map.keySet())
            {
                if (first == 0)
                {
                    first = i;
                    firstValue = map.get(i);
                }
                else
                {
                    second = i;
                    secondValue = map.get(i);
                }
            }

            if (first > second && firstValue <= secondValue && firstValue == 1 || first < second && firstValue >= secondValue && secondValue == 1) return true;
        }
        else
        {
            for (int i : map.keySet())
            {
                if (map.get(i) == 1 || i == 1) return true;
            }
        }

        return false;
    }
}
