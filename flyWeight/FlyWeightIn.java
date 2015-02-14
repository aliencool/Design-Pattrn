package flyWeight;


//外部状态:可变的细粒度
//内部状态:提取出可变中不可变的细粒度
interface FlyWeightIn {
	DragonBox operation();
}
