package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Items;

@Service("itemsService")
public interface ItemsService {
	// 插入数据 调用itemsDAO里的insertItems配置
	public int insertItems(Items items);

	// 更新数据 调用itemsDAO里的updateItems配置
	public int updateItems(Items items);

	// 删除数据 调用itemsDAO里的deleteItems配置
	public int deleteItems(String itemsid);

	// 查询全部数据 调用itemsDAO里的getAllItems配置
	public List<Items> getAllItems();

	// 按照Items类里面的字段名称精确查询 调用itemsDAO里的getItemsByCond配置
	public List<Items> getItemsByCond(Items items);

	// 按照Items类里面的字段名称模糊查询 调用itemsDAO里的getItemsByLike配置
	public List<Items> getItemsByLike(Items items);

	// 按主键查询表返回单一的Items实例 调用itemsDAO里的getItemsById配置
	public Items getItemsById(String itemsid);

}
