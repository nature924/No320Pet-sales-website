package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ItemsDAO;
import com.entity.Items;
import com.service.ItemsService;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	@Resource
	private ItemsDAO itemsDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertItems(Items items) {
		return this.itemsDAO.insertItems(items);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateItems(Items items) {
		return this.itemsDAO.updateItems(items);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteItems(String itemsid) {
		return this.itemsDAO.deleteItems(itemsid);
	}

	@Override // 继承接口的查询全部
	public List<Items> getAllItems() {
		return this.itemsDAO.getAllItems();
	}

	@Override // 继承接口的按条件精确查询
	public List<Items> getItemsByCond(Items items) {
		return this.itemsDAO.getItemsByCond(items);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Items> getItemsByLike(Items items) {
		return this.itemsDAO.getItemsByLike(items);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Items getItemsById(String itemsid) {
		return this.itemsDAO.getItemsById(itemsid);
	}

}
