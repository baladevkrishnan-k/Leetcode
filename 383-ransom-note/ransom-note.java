class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> h1=new HashMap();
        Map<Character,Integer> h2=new HashMap();
        for(var i:ransomNote.toCharArray()){
             h1.put(i,h1.getOrDefault(i,0)+1);
        }
        for(var i:magazine.toCharArray()){
            h2.put(i,h2.getOrDefault(i,0)+1);
        }for(var i: ransomNote.toCharArray()){
            if(h2.containsKey(i)){
                if(h1.get(i)>h2.get(i)) return false;
            }else{
                return false;
            }
        }return true;
    }
}