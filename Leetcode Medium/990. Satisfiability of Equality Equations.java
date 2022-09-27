class Solution {
    HashMap<Character, Character> rank = new HashMap<>();  
    public boolean equationsPossible(String[] equations) {    
        int j=97;
        for(int i=0; i<26; i++)
        {
            char x=(char)j;
            rank.put(x,x);
            j++;
        }
        for(int i =0 ;i<equations.length; i++)   
        {
            String str = equations[i];
            char first = str.charAt(1);
            char second = str.charAt(2);
            char zero = str.charAt(0);
            char last = str.charAt(3);
            if(first==second)
            union(zero,last);                
    
        }

        for(int i =0 ;i<equations.length; i++)   
        {
            String str = equations[i];
            char first = str.charAt(1);
            char second = str.charAt(2);
            char zero = str.charAt(0);
            char last = str.charAt(3);
            
            if(first=='!' && second=='=')
            {
                char a =find(rank.get(zero));
                char b = find(rank.get(last));
                
                if(a==b)
                 return false;       
            }
        }
        
        return true;
        
    }
    
    public char find(char x){
        char check = rank.get(x);
        if(x == check)
            return x;

        char temp = find(check);
        rank.put(x,temp);
        return temp;
    }
    
    public void union(char x, char y)
    {
        char px = find(x);
        char py = find(y);
        
        if(px!=py)
        rank.put(py,px);
        
    }    
}

