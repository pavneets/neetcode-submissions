class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sHash = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tHash = new HashMap<Character, Integer>();

        if(s.length() != t.length()){
            return false;
        }
        else
        {
            for (int c=0; c < s.length(); c++)
            {
            if(sHash.containsKey(s.charAt(c))){
                sHash.put(s.charAt(c), sHash.get(s.charAt(c)) + 1);
            }
            else
            {
                sHash.put(s.charAt(c), 1);
            }
        }

        for (int c=0; c < t.length(); c++)
        {
            if(tHash.containsKey(t.charAt(c))){
                tHash.put(t.charAt(c), tHash.get(t.charAt(c)) + 1);
            }
            else{
                tHash.put(t.charAt(c), 1);
            }
        }

        return sHash.equals(tHash);
        }

    }
}

