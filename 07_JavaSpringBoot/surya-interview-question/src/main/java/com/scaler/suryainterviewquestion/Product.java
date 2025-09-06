package com.scaler.suryainterviewquestion;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class Product {
    private String productId;
    private String productName;
    private String brandName;
    private String category;
    private String description;
    private double price;
    private String currency;
    private double discountPercentage;
    private int stockQuantity;
    private String warehouseLocation;
    private String sku;
    private String processor;
    private String memory;
    private String storageCapacity;
    private String displaySize;
    private boolean isAvailable;
    private LocalDate releaseDate; //"2025-01-20"
    private Instant lastUpdated; //"2024-08-01T10:00:00Z"
    private double averageRating;
    private int ratingCount;
    private int warrantyDurationMonths;
    private double weight_kg;
}
