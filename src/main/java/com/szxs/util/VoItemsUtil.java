package com.szxs.util;

import com.szxs.dto.VoItems;
import com.szxs.entity.DmItem;

import java.util.ArrayList;
import java.util.List;

//将DmItem对象装换成VoItems对象(集合)
public class VoItemsUtil {
    public static List<VoItems> getVoItems(List<DmItem> dmItemList){
        List<VoItems>  voItemsList = new ArrayList<VoItems>();
        for(DmItem dmItem :dmItemList){
            VoItems voItems = new VoItems();
            voItems.setAreaName(dmItem.getDmCinema().getAreaName());
            voItems.setAreaId(dmItem.getDmCinema().getAreaId());
            voItems.setStartDate(dmItem.getStartTime());
            voItems.setEndDate(dmItem.getEndTime());
            voItems.setAddress(dmItem.getDmCinema().getAddress());
            voItems.setId(dmItem.getId());
            voItems.setMinPrice(dmItem.getMinPrice());
            voItems.setItemName(dmItem.getItemName());
            voItemsList.add(voItems);
        }
        return voItemsList;
    }
}
