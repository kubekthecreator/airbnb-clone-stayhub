package com.kubekthecreator.airbnb_clone_back.listing.application.dto;

import com.kubekthecreator.airbnb_clone_back.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}
