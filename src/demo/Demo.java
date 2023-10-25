package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	public static void main(String args[]){
		String para = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, Lorem ipsum dolor sit amet.. comes from a line in section 1.10.32.";
		String[] words = para.split(" ");
		String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u"
				,"v","w","x","y","z"};
		Map<String, Object> finalList = new HashMap<String,Object>();
		List<Integer> tempIndexList = new ArrayList<Integer>();
		for(int i=0; i<alphabets.length; i++){
			for(int j=0; j<words.length; j++){
				if(words[j].substring(0,1).equals(alphabets[i])){
					//System.out.println(words[j]+" substring: "+ words[j].substring(0,1) + " "+words[j].substring(0,1).equals(alphabets[i]));
					tempIndexList.add(j);
				}
			}
			//System.out.println("tempIndexList: "+ tempIndexList.toString());
			Map<String, Integer> tempMap = new HashMap<String,Integer>();
			if(tempIndexList.size() > 0){
				tempMap.put("min", tempIndexList.get(0));
				tempMap.put("max", tempIndexList.get(tempIndexList.size()-1));
				tempMap.put("count", tempIndexList.size());
			}			
			finalList.put(alphabets[i], tempMap);
			tempIndexList.clear();
		}
		for(Map.Entry<String,Object> entry : finalList.entrySet()){
			System.out.println(entry.getKey()+"->");
			System.out.println(entry.getValue().toString());
//			for(Map.Entry<String,Object> entryObj : entry.getValue()){
//				System.out.println(entryObj.getKey()+" : " + entryObj);
//			}
		}
	}
}
