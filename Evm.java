import java.io.*;
import java.util.*;

public class Evm {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> map1 = new HashSet<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < n; ++i) {
            String str1 = br.readLine();
            String[] str2 = str1.split(" ");
            String id = str2[0];
            String party = str2[1];
            if(!map1.contains(id)) {
            if(map2.containsKey(party)) {
                map2.put(party, map2.get(party)+1);
            } else {
                map2.put(party, 1);
                list.add(party);
            }
            if(map2.get(party) >  max ) {
                max = map2.get(party);
            }
            map1.add(id);
            }
        }
        List<String> list2 = new ArrayList<>();
        for(String i : list) {
            if(map2.get(i) == max) {
                list2.add(i);
            }
        }
        Collections.sort(list2);
        Iterator<String> itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
