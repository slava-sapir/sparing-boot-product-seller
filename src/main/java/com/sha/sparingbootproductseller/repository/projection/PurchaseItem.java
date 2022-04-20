package com.sha.sparingbootproductseller.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem
{
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
