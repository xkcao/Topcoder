package com.xiaokang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Aaagmnrs {
    /*
0)
{ "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" }
Returns: { "Aaagmnrs", "TopCoder" }
The examples above.
1)
{ "SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok" }
Returns: { "SnapDragon vs tomek" }
2)
{ "Radar ghost jilts Kim", "patched hers first", "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM" }
Returns: { "Radar ghost jilts Kim", "patched hers first" }
     */
    @SuppressWarnings("SimplifyStreamApiCallChains")
    public String[] anagrams(String[] phrases){
        List<String> results = new ArrayList<>();

        for (String phrase : phrases) {
            boolean existAlready = false;
            for(String result : results) {
                if (isAnagrams(phrase, result)) {
                    existAlready = true;
                    break;
                }
            }

            if (!existAlready) results.add(phrase);
        }

//        return results.toArray(String[]::new);
        return results.stream().toArray(String[]::new);
    }

    boolean isAnagrams(String str1, String str2){
        str1 = str1.toLowerCase(Locale.ROOT).replaceAll("\\s", "");
        str2 = str2.toLowerCase(Locale.ROOT).replaceAll("\\s","");

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String str1Sorted = new String(charArray1);
        String str2Sorted = new String(charArray2);

        return str1Sorted.equalsIgnoreCase(str2Sorted);
    }
}
