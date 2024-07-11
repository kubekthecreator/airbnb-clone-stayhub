package com.kubekthecreator.airbnb_clone_back.listing.application.dto.sub;

import com.kubekthecreator.airbnb_clone_back.listing.application.dto.vo.BathsVO;
import com.kubekthecreator.airbnb_clone_back.listing.application.dto.vo.BedroomsVO;
import com.kubekthecreator.airbnb_clone_back.listing.application.dto.vo.BedsVO;
import com.kubekthecreator.airbnb_clone_back.listing.application.dto.vo.GuestsVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record ListingInfoDTO(
        @NotNull @Valid GuestsVO guests,
        @NotNull @Valid BedroomsVO bedrooms,
        @NotNull @Valid BedsVO beds,
        @NotNull @Valid BathsVO baths) {
}
