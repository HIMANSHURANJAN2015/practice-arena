package com.scaler.suryainterviewquestion;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FilterProductController {
    private static final String FETCH_URL = "http://interview.surya-digital.in/get-electronics";

    @GetMapping("/filter")
    public ResponseEntity<List<Product>> filterProductsBasedOnDate(
                            @RequestParam(required = false) LocalDate startDate,
                            @RequestParam(required = false) LocalDate endDate) {

        // Fetch product list
        RestClient restClient = RestClient.create();
        List<Product> allProducts = restClient.get()
                .uri(FETCH_URL)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Product>>() {});

        // Filter products
        ZoneId zone = ZoneId.systemDefault();
        List<Product> filteredProducts = allProducts.stream()
                .filter(product -> {
                    Instant lastUpdated = product.getLastUpdated();
                    if (lastUpdated == null) {
                        return false; // skip null timestamps
                    }
                    LocalDate lastUpdatedDate = LocalDate.ofInstant(product.getLastUpdated(), zone);
                    //System.out.println("lastUpdatedDate: " + lastUpdatedDate);
                    //If both present
                    if(startDate !=null && endDate !=null && !lastUpdatedDate.isBefore(startDate) && !lastUpdatedDate.isAfter(endDate)) {
                        System.out.println("Case-1");
                        return true;
                    }
                    //else only start date present
                    else if(startDate !=null && endDate== null && !lastUpdatedDate.isBefore(startDate)) {
                        System.out.println("Case-2");
                        return true;
                    }
                    //else if only end date is present
                    else if(endDate !=null && startDate==null && !lastUpdatedDate.isAfter(endDate)) {
                        System.out.println("Case-3");
                        return true;
                    }
                    //else if nothing present
                    else if(startDate == null && endDate == null) {
                        System.out.println("Case-4");
                        return true;
                    }
                    //Else filter them out
                    else {
                        System.out.println("Case-5");
                        return false;
                    }
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredProducts);
    }


}
