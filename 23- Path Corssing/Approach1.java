import java.util.HashMap;
import java.util.HashSet;

class Solution{
    public boolean isPathCrossing(String path){
        Map<Character, Pair<Integer, Integer>> moves = new HashMap();
        moves.put('N', new Pair(0,1));
        moves.put('S', new Pair(0, -1));
        moves.put('E', new Pair(1, 0));
        moves.put('W', new Pair(-1,0));

        Set<Pair<Integer, Integer>> visited = new HashSet();
        visited.add(new Pair(0,0));

        int x = 0, y = 0;
        for (Character c : path.toCharArray()) {
            Pair<Integer, Integer> curr = new Pair(x, y);
            int dx = curr.getKey();
            int dy = curr.getValue();
            x += dx;
            y += dy;

            Pair<Integer, Integer> pair = new Pair(x, y);
            if(visited.contains(pair)) {
                return true;
            }
            visited.add(pair);
        }
        return false;

    }
}