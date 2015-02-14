package flyWeight;

import java.util.HashMap;

public class FlyWeightFactory {
	//保持多个享元对象
	private static HashMap<String, FlyWeightIn> hashMap = new HashMap<String, FlyWeightIn>();
	
	
	public static FlyWeightIn getFlyWeight(String key)
	{
		//
		FlyWeightIn fw = hashMap.get(key);
		
		if(fw == null)
		{
			DragonBox box = new DragonBox();
			ConcreteFW concreteFW = new ConcreteFW(box);
			hashMap.put(key, concreteFW);
			
			fw = hashMap.get(key);
		}
		
		return fw;
	}
}
