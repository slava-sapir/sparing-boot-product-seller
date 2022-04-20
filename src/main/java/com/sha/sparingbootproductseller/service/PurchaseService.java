package com.sha.sparingbootproductseller.service;

import com.sha.sparingbootproductseller.model.Purchase;
import com.sha.sparingbootproductseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
