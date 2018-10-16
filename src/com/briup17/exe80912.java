/*package com.briup17;

public interface exe80912 {

}
*/

package com.briup17;

import java.util.HashSet;
import java.util.Set;

public class exe80912 {
	private Set<Entry> set;
	public exe80912(){
	
		set=new HashSet<>();
	}
	public void put(Object key,Object value){
	
		Entry entry=new Entry(key,value);
		set.add(entry);
	}
	public Set EntrySet(){
	
		return set;
	}
	class Entry{
		private Object key;
		private Object value;
		public Entry(Object key,Object value)
		{
			this.key=key;
			this.value=value;
		}
		public Object getKey() {
			return key;
		}
		public Object getValue() {
			return value;
		}
		
	}
	public static void main(String[] args) {
		exe80912 map=new exe80912();
		map.put(1,"zhangsan");
		map.put(3,"lisi");
		map.put(2,"wangwu");
		Set<Entry> set=map.EntrySet();
		for(Entry entry:set)
		{
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
		
	}

}

